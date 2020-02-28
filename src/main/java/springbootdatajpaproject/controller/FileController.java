package springbootdatajpaproject.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;
import springbootdatajpaproject.service.FileService;

@RequestMapping("api/file")	
@RestController
public class FileController{

	@Autowired
	FileService fileService;
	
	@PostMapping(value = "uploadImage")
	public void uploadImage(@RequestParam("file") MultipartFile file) {
		
	fileService.uploadImage(file); 		
	}

}
