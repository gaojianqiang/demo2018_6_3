package com.file.controller;

import java.io.File;
import java.io.IOException;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
@Controller
public class UploadController {
	@RequestMapping("/upload")
	@ResponseBody
	public String upload(HttpServletRequest request,@RequestParam("file") MultipartFile  file) throws IllegalStateException, IOException{
		String realPath = request.getServletContext().getRealPath("/upload");
		File realFile=new File(realPath);
		if(!realFile.exists()){
			realFile.mkdirs();
		}
		File target=new File(realPath,file.getOriginalFilename());
		file.transferTo(target);
		return "cg";
	}
}
