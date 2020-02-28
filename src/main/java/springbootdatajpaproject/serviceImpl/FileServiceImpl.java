package springbootdatajpaproject.serviceImpl;

import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import springbootdatajpaproject.service.FileService;

@Service
public class FileServiceImpl implements FileService {

	@Override
	public void uploadImage(MultipartFile file) {

		System.out.println("FileServiceImpl : uploadImage method called");
		String fileName	=file.getOriginalFilename();

	}

}
