package com.example.Hibernate.FlushEvict;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.example.Hibernate.util.HibernateUtil;

public class FlushApplication {
	public static void main(String[] args) {
		Transaction transaction = null;
		try {
			Session session = HibernateUtil.getSessionFactory().openSession();
		
			
			transaction = session.beginTransaction();
			Book book1 = (Book)session.get(Book.class, 13L);
			book1.setName("New Hibernate Book");
			session.flush();
			// After session.flush(), hibernate compares book object data and corresponding record in database. 
			//If there is a difference it will execute update query to update object data in the database, but it will not commit.
			transaction.commit();
			
		}catch(Exception e) {
			System.out.println("Exception :"+e);
			if(transaction !=null) {
				transaction.rollback();
			}
	
		}
		
		}
}

