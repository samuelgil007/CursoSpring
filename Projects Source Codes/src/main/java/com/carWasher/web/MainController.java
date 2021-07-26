package com.carWasher.web;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.InputStreamResource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MainController {


	@Autowired
	JavaMailSender javaMailSender;

	@RequestMapping(value = { "/", "/index.html" })
	public ModelAndView index() {
		ModelAndView modelAndView = new ModelAndView();
        //Va a la vista llamada index y la retorna
		modelAndView.setViewName("index");

		//Email sender
		SimpleMailMessage simpleMailMessage = new SimpleMailMessage();
		simpleMailMessage.setTo("Email to");
		simpleMailMessage.setCc("Email desde donde se envia");
		simpleMailMessage.setText("Text");
		simpleMailMessage.setSubject("subject");

		javaMailSender.send(simpleMailMessage);

		return modelAndView;
	}

	@RequestMapping(value = "/login.html")
	public ModelAndView login() {
		ModelAndView modelAndView = new ModelAndView();
		//Va a la vista llamada login y la retorna
		modelAndView.setViewName("login");

		return modelAndView;
	}

	//Subiendo un archivo
	@RequestMapping(value="/upload",method=RequestMethod.POST, consumes=MediaType.MULTIPART_FORM_DATA_VALUE)
	public String upload(@RequestParam("file") MultipartFile file, ModelMap modelMap) throws IOException {
		
		File newFile = new File("c:/demo/"+file.getOriginalFilename());
		FileOutputStream outputStream = new FileOutputStream(newFile);
		outputStream.write(file.getBytes());
		outputStream.close();
		
		modelMap.addAttribute("file",file);
		
		return "/index";
	}

	//retornar archivo
	@RequestMapping(value="/download/{fileName}", method=RequestMethod.GET)
	public ResponseEntity<Object> download(@PathVariable String fileName) throws FileNotFoundException{
		String path="c:/demo/"+fileName;
		
		File file = new File(path);
		InputStreamResource resource = new InputStreamResource(new FileInputStream(file));
		
		HttpHeaders headers = new HttpHeaders();
		headers.add("Content-Disposition", String.format("attachment;	filename=\"%s\"", file.getName()));
		headers.add("Cache-Control", "no-cache, no-store, mustrevalidate");
		headers.add("Pragma", "no-cache");
		headers.add("Expires", "0");

		
		
		return ResponseEntity.ok().headers(headers).contentLength(file.length()).body(resource);
	}

}
