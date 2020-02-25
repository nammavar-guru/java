package com.example.SpringDataJpa.AuditUserExample;

import java.util.Date;
import java.util.List;
import java.util.Optional;
import java.util.concurrent.CompletableFuture;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.domain.AuditorAware;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import org.springframework.scheduling.annotation.EnableAsync;

import com.example.SpringDataJpa.AuditUserExample.model.User;
import com.example.SpringDataJpa.AuditUserExample.model.UserNamedQuery;
import com.example.SpringDataJpa.AuditUserExample.repository.UserNamedQueryRepository;
import com.example.SpringDataJpa.AuditUserExample.repository.UserQueryRepository;
import com.example.SpringDataJpa.AuditUserExample.repository.UserRepository;

@SpringBootApplication
@EnableAsync
@EnableJpaAuditing(auditorAwareRef="auditorAware")
public class UserApplication implements CommandLineRunner {
	
	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private UserQueryRepository userQueryRepository;
	
	@Autowired
	private UserNamedQueryRepository userNamedQueryRepository;
	
	@Bean
	public AuditorAware<String> auditorAware(){
		return new AuditorAwareImpl();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SpringApplication.run(UserApplication.class, args);
	}
	
	@Override
	public void run(String...arg) throws Exception {
		
		/*
		 * User user = new User(); user.setActive(1); user.setAge(25);
		 * user.setEmailAddress("guru@gmail.com"); user.setFirstName("guru");
		 * user.setLastName("murugesan"); user.setStartDate(new Date()); user =
		 * userRepository.save(user);
		 * 
		 * User usera = new User(); usera.setActive(1); usera.setAge(10);
		 * usera.setEmailAddress("kumaresh@gmail.com"); usera.setFirstName("kumaresh");
		 * usera.setLastName("gurunathan"); usera.setStartDate(new Date()); usera =
		 * userRepository.save(usera);
		 */
		 
		
		//Query creation from Method names
		User user1 = userRepository.findByEmailAddress("guru@gmail.com");
		System.out.println("User1 :"+user1.toString());
		
		User user2 = userRepository.findByFirstNameAndLastName("guru","murugesan");
		System.out.println("User2 :"+user2.toString());
		
		
		List<User> userList = userRepository.findOptionalByActive(1);
		for(User u:userList) {
			System.out.println("UserList :"+u.toString());
		}
		System.out.println("UserList :"+userList.size());
		
		Optional<User> userOptional = userRepository.findByLastName("test");
		if (userOptional.isPresent())
			System.out.println("userOptional :"+userOptional.get().toString());
		
		//@Async Query execution	
		CompletableFuture<User> cfUser1 = userRepository.findByFirstName("Guru");
		CompletableFuture<User> cfUser2 = userRepository.findByFirstName("kumaresh");
		//System.out.println("cfUser1 :"+cfUser1.get().toString());
		CompletableFuture.allOf(cfUser1,cfUser2);
		System.out.println("cfUser1 :"+cfUser1.get().toString());
		System.out.println("cfUser2 :"+cfUser2.get().toString());
		
		//Creating JPQL queries
		User user3 = userQueryRepository.findByEmailAddress("guru@gmail.com");
		System.out.println("User3 :"+user3.toString());
		
		User user4 = userQueryRepository.findByParamEmailAddress("guru@gmail.com");
		System.out.println("User4 :"+user4.toString());
		
		//@NamedQuery and @NamedQueries
		UserNamedQuery user5 = userNamedQueryRepository.findByEmailAddress("guru@gmail.com");
		System.out.println("User5 :"+user5.toString());
		
		UserNamedQuery user6 = userNamedQueryRepository.findLastName("murugesan");
		System.out.println("User6 :"+user6.toString());
		
		UserNamedQuery user7 = userNamedQueryRepository.findFirstName("kumaresh");
		System.out.println("User7 :"+user7.toString());
		
		 userRepository.updateActive("guru");
		 User user9 = userRepository.findByFirstNameAndLastName("guru","murugesan");
		 System.out.println("User9 :"+user9.toString());	
		 
		//Not Working
		//Predicate predicate = user.firstname.equalsIgnoreCase("dave")
			//	.and(user.lastname.startsWithIgnoreCase("mathews"));

			//userRepository.findAll(predicate);
	}

}
