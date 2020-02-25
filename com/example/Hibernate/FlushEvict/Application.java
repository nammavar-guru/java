package com.example.Hibernate.FlushEvict;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.example.Hibernate.util.HibernateUtil;


public class Application {
	public static void main(String[] args) {
		Transaction transaction = null;
		try {
			Session session = HibernateUtil.getSessionFactory().openSession();
		
			Book book1= new Book();
			book1.setName("Spring Book");
			
			transaction = session.beginTransaction();
			System.out.println("test");
			session.save(book1);
			System.out.println("test2");
			
			transaction.commit();
			
		}catch(Exception e) {
			System.out.println("Exception :"+e);
			if(transaction !=null) {
				transaction.rollback();
			}
	
		}
		
		}
}
