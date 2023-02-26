package com.file.helper;

import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

import org.springframework.stereotype.Component;
import org.springframework.web.multipart.MultipartFile;

@Component
public class FileUploadHelper {
	//this is static file location. it is every computer is diffrent . then use dynamic location
	public final String UPLOAD_DIR="C:\\Users\\91985\\Desktop\\SpringBoot\\Springboot olderversion project\\file_Upload\\src\\main\\resources\\static\\image";
   
	public boolean uploadFile(MultipartFile multiPart) {
		boolean f=false;
		try {
//			InputStream is = multiPart.getInputStream();
//			byte data[]=new byte[is.available()];
//			is.read(data);
//			//write in folder
//			FileOutputStream fos=new FileOutputStream(UPLOAD_DIR+File.separator+multiPart.getOriginalFilename());
//			fos.write(data);
//			fos.flush();
//			fos.close();
			//2nd method
			Files.copy(multiPart.getInputStream(),Paths.get(UPLOAD_DIR+File.separator+multiPart.getOriginalFilename()), 
					StandardCopyOption.REPLACE_EXISTING);
			f=true;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return f;
    }
}
