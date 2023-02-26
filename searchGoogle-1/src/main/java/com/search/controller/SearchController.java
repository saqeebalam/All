package com.search.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.view.RedirectView;

@Controller
public class SearchController {

	@RequestMapping("/search")
	public String searchHomePage()
	{
		return "Hello";
	}
	
	@RequestMapping("/searchPage")
	public RedirectView searchPage(@RequestParam("search") String Search)
	{
		System.out.println("Called searchPage="+Search);
		RedirectView r=new RedirectView();
		String url="https://www.google.com/search?q="+Search;
		r.setUrl(url);
		return r;
	}
}
