package com.example.Hibernate.FlushEvict;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.example.Hibernate.util.HibernateUtil;

public class EvictApplication {
	public static void main(String[] args) {
		Transaction transaction = null;
		try {
			Session session = HibernateUtil.getSessionFactory().openSession();
		
			
			transaction = session.beginTransaction();
			Book book1 = (Book)session.get(Book.class, 13L);
			Book book2 = (Book)session.get(Book.class, 14L);
			book1.setName("New Hibernate Book");
			book2.setName("New New Spring Book");
			session.evict(book1);
			//book1 is in detached state and book2 is in persistent state
			transaction.commit();
			
		}catch(Exception e) {
			System.out.println("Exception :"+e);
			if(transaction !=null) {
				transaction.rollback();
			}
	
		}
		
		}
}

