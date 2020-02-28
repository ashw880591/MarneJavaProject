package springbootdatajpaproject.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import springbootdatajpaproject.pojo.builderModel;

//import com.assimilate.web.model.UserModel;

@Repository
public interface builderDaoRepository extends JpaRepository<builderModel, Integer> {

	// int setpasswordupdate(String password, Object email_id);

	// int selectBasedOnflagPasswordMobileno(String password, String email_id);

	// int selectBasedOnflagPasswordEmail_id(String password, String email_id);

	// int selectBasedOnflagpasswordemail_id(String password, String email_id);

	// int selectBasedOnflagpasswordemail_id(String password, String email_id);

}