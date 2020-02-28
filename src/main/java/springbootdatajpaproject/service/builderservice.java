package springbootdatajpaproject.service;

import java.util.List;
import java.util.Optional;

import springbootdatajpaproject.pojo.builderModel;

public interface builderservice {

	//List<builderService> getVehicle();

	void createUser(builderModel buildermodel);

	void updateBuilder(builderModel buildermodel);

	List<builderModel> getallBuilder();

	void deleteAccount(builderModel buildermodel);

	Optional<builderModel> getById(int id);

	
	

	

}
