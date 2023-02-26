package com.file.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.file.helper.FileUploadHelper;

@RestController
public class FileUpload {
	@Autowired
	private FileUploadHelper fileUploadHelper;
	
	@PostMapping("/upload-file")
	public ResponseEntity<String> uploadFile(@RequestParam("file") MultipartFile file){
//		System.out.println(file.getSize()+" =size");
//		System.out.println(file.getOriginalFilename()+" =filename");
//		System.out.println(file.getContentType()+" =get content type");
		// validation for empty file
		try {
			
		
		if(file.isEmpty()) {
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Request must content file");
		}
		//validaation for only jpeg file
		if(!file.getContentType().equals("image/jpeg")) {
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Only jpeg file only");
		}
		//for file uploading
		  boolean uploadFile = fileUploadHelper.uploadFile(file);
		  if(uploadFile) {
			  return ResponseEntity.ok("File is successfully Uploade");
		  }
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Something went wrong try again");
	}

}
