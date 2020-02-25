package com.example.SpringCore.importclass;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

//We can import the class using import annotation
//the imported class need not to declare a @Component annotation
@Configuration
@Import(DatabaseInitializer.class)
public class AppConfig {
	
}
