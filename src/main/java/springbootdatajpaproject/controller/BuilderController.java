package springbootdatajpaproject.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import springbootdatajpaproject.pojo.builderModel;
import springbootdatajpaproject.service.builderservice;

@RequestMapping("api/Marne")
@RestController
public class BuilderController {
	
	@Autowired
	builderservice  builderService;

	@RequestMapping(path = "/creatBuilder")
	public String CreateUser(@RequestBody builderModel buildermodel) {

		builderService.createUser(buildermodel);
		return "record inserted succesfully"; 

	}	
	@RequestMapping(path="/update")
	public String update(@RequestBody builderModel buildermodel) {
		System.out.println("in update call........"+buildermodel);
	    builderService.updateBuilder(buildermodel);
	    return "record update successfully";
	    
	}
	
	@RequestMapping(path="/getall")
	public List<builderModel> getallbuilder(){
		return builderService.getallBuilder();
	}
	@RequestMapping(path="/getbyid/{id}")
	public Optional<builderModel> getById(@PathVariable("id") int id){
		return builderService.getById(id);
		
	}
	 
	@RequestMapping(path="/deleteAccount")
	public void DeleteAccount(@RequestBody builderModel buildermodel) {
		System.out.println("delete recored"+buildermodel);
		builderService.deleteAccount(buildermodel);
	}

	@PostMapping(value = "uploadImage")
	public void uploadImage() {
				
	}

}
	
	
	


