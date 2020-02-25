package com.example.SpringDataJpa.AuditUserExample.repository;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.Repository;
import org.springframework.data.repository.query.Param;

import com.example.SpringDataJpa.AuditUserExample.model.User;

public interface UserQueryRepository extends Repository<User,Integer> {
	@Query("select u from User u where u.emailAddress=?1")
	User findByEmailAddress(String emailAddress);
	
	@Query(value="select * from users u where u.email_address=:email",nativeQuery=true)
	User findByParamEmailAddress(@Param("email") String emailAddress);
	
	
	
}
;