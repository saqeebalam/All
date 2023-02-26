package com.marketing.controller;

import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.List;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.lowagie.text.DocumentException;
import com.marketing.dto.LeadData;
import com.marketing.entities.Lead;
import com.marketing.pdf.PdfGenerate;
import com.marketing.pdf.UserPDFExporter;
import com.marketing.services.LeadService;
import com.marketing.util.EmailService;
import javax.servlet.http.HttpServletResponse;


@Controller

public class LeadController {
	
	@Autowired
	private LeadService leadService;
	
	@Autowired
	private EmailService emailService;
	
	@Autowired
    private PdfGenerate service;
	
	//here  is no doget and dopost method
	//create method according to your requirment
	//Handler method
	//it act like @web servellet http://localhost:8080/create when this url run it call this viewCreateLeadPage()
	
	@RequestMapping("/create")
	public String viewCreateLeadPage() {
		return "create_lead";
	}
	//1st method to take data from view and store in DB
	@RequestMapping("/saveLead")
	public String saveOneLead(@ModelAttribute("l") Lead lead , ModelMap model) {
		//System.out.println(lead);
		leadService.saveLeadInfo(lead);
		emailService.sendEmail(lead.getEmail(), "welcome to PSA", "Test Email from SpringBoot");
		model.addAttribute("msg","Record is Save");
		return "create_lead";
	}
	//2nd method to take data from view and store in DB
//	@RequestMapping("/saveLead")
//	public String saveOneLead(@RequestParam("firstName") String firstName,@RequestParam("lastName") String lastName,
//			@RequestParam("email") String email,@RequestParam("mobile") String mobile,ModelMap model) {
//		Lead lead=new Lead();
//		lead.setFirstName(firstName);
//		lead.setLastName(lastName);
//		lead.setEmail(email);
//		lead.setMobile(mobile);
//		
//		//System.out.println(lead);
//		leadService.saveLeadInfo(lead);
//		model.addAttribute("msg","Record is Save");
//		return "create_lead";
//	}
	//3rd type to to take data from view and store in DB
//	@RequestMapping("/saveLead")
//	public String saveOneLead(LeadData leadData , ModelMap model) { //here just give Dto class name as it 
//		//System.out.println(lead);
//		Lead lead=new Lead();
//		lead.setFirstName(leadData.getFirstName());
//		lead.setLastName(leadData.getLastName());
//		lead.setEmail(leadData.getEmail());
//		lead.setMobile(leadData.getMobile());
//		leadService.saveLeadInfo(lead);
//		model.addAttribute("msg","Record is Save");
//		return "create_lead";
//	}
	@RequestMapping("/listAll")
	public String listAllLeads(Model model) {
		List<Lead> leads = leadService.getLeads();
		model.addAttribute("leads",leads);
		//System.out.println(leads);
		return "list_leads";
	}
	
	@RequestMapping("/delete")
	public String deleteOneLead(@RequestParam("id") long id , Model model) {
		leadService.deleteLead(id);
		List<Lead> leads = leadService.getLeads();
		model.addAttribute("leads",leads);
		return "list_leads";
	}
	
	@RequestMapping("/update")
	public String getLeadInfo(@RequestParam("id") long id, Model model) {
		Lead lead=leadService.getInfo(id);
		model.addAttribute("leads", lead);
		return "update_lead";
	}
	
	@RequestMapping("/updateLead")
	public String updateLeadInfo(LeadData leadData, Model model) {
		Lead l=new Lead();
		l.setId(leadData.getId());
		l.setFirstName(leadData.getFirstName());
		l.setLastName(leadData.getLastName());
		l.setMobile(leadData.getMobile());
		l.setEmail(leadData.getEmail());
		leadService.saveLeadInfo(l);
		List<Lead> leads = leadService.getLeads();
		model.addAttribute("leads",leads);
		//System.out.println(leads);
		return "list_leads";
	}
	
	//pdf generate code
	@GetMapping("/users/export/pdf")
    public void exportToPDF(HttpServletResponse response) throws DocumentException, IOException {
        response.setContentType("application/pdf");
        DateFormat dateFormatter = new SimpleDateFormat("yyyy-MM-dd_HH:mm:ss");
        String currentDateTime = dateFormatter.format(new Date());
         
        String headerKey = "Content-Disposition";
        String headerValue = "attachment; filename=users_" + currentDateTime + ".pdf";
        response.setHeader(headerKey, headerValue);
         
        List<Lead> listUsers = service.listAll();
         
        UserPDFExporter exporter = new UserPDFExporter(listUsers);
        exporter.export(response);
         
    }
}
