package springbootdatajpaproject.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import springbootdatajpaproject.pojo.builderModel;
import springbootdatajpaproject.repository.builderDaoRepository;

@Service
public class builderserviceImpl implements builderservice {
	
	//builderModel temp; 
	
	@Autowired
	builderDaoRepository BDaoRepo;

	@Override
	public void createUser(builderModel buildermodel) {
		// TODO Auto-generated method stub
         //temp=buildermodel;
		
         BDaoRepo.save(buildermodel);
		System.out.println("service method called");
		
	}

	@Override
	public void updateBuilder(builderModel buildermodel) {
		// TODO Auto-generated method stub
		System.out.println("in service -----------------------");
		BDaoRepo.save(buildermodel);
		System.out.println("service method called");
		
	}

	@Override
	public List<builderModel> getallBuilder() {
		// TODO Auto-generated method stub
		return BDaoRepo.findAll();
	}

	@Override
	public void deleteAccount(builderModel buildermodel) {
		// TODO Auto-generated method stub
		BDaoRepo.save(buildermodel);
		System.out.println("ddddddddddddddddddddddddddddddd");
	}

	@Override
	public Optional<builderModel> getById(int id) {
		// TODO Auto-generated method stub
		return BDaoRepo.findById(id);
	}


	
	

	 
	

}
