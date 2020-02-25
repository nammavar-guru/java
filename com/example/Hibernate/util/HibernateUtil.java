package com.example.Hibernate.util;

import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

import com.example.Hibernate.FlushEvict.Book;
import com.example.Hibernate.HibernateState.Student;

public class HibernateUtil {
	private static SessionFactory sessionFactory;
	private static StandardServiceRegistry serviceRegistry;
	
	public static SessionFactory getSessionFactory() {
		if(sessionFactory == null) {
			try {
				Configuration configuration = new Configuration();
				configuration.addAnnotatedClass(Book.class);
				configuration.addAnnotatedClass(Student.class);
				
				serviceRegistry = new StandardServiceRegistryBuilder().configure().build();
				sessionFactory = configuration.buildSessionFactory(serviceRegistry);
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
		return sessionFactory;
	}
}
