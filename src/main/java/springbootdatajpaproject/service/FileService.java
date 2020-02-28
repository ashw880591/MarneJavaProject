package springbootdatajpaproject.service;

import org.springframework.web.multipart.MultipartFile;

public interface FileService {

	void uploadImage(MultipartFile file);

}
