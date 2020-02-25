package com.example.SpringDataJpa.AuditUserExample.repository;

import java.util.List;
import java.util.Optional;
import java.util.concurrent.CompletableFuture;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Repository;

import com.example.SpringDataJpa.AuditUserExample.model.User;

@Repository	
public interface UserRepository extends JpaRepository<User, Integer>{
	User findByEmailAddress(String emailAddress);
	List<User> findOptionalByActive(int active);
	Optional<User> findByLastName(String lastName);
	@Async
	CompletableFuture<User> findByFirstName(String firstName);
	User findByFirstNameAndLastName(String firstName, String lastName);
	
	@Modifying
	@Query("update User u set u.active = 0 where u.firstName= :firstName")
	@Transactional
	void updateActive(String firstName);
	
	
}
