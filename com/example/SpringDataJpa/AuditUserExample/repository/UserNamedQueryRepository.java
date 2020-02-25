package com.example.SpringDataJpa.AuditUserExample.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.SpringDataJpa.AuditUserExample.model.UserNamedQuery;

public interface UserNamedQueryRepository extends JpaRepository<UserNamedQuery, Integer> {
	UserNamedQuery  findByEmailAddress(String emailAddress);
	UserNamedQuery  findLastName(String lastName);
	UserNamedQuery  findFirstName(String firstName);
	
}
