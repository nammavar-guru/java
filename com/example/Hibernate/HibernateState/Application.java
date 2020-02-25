package com.example.Hibernate.HibernateState;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.example.Hibernate.util.HibernateUtil;

public class Application {

	public static void main(String[] args) throws Exception {
		Student student1 = new Student("guru","murugesan","guru@gmail.com");
		Student student2 = new Student("Kumaresh","guru","kumaresh@gmail.com");
		
		Transaction trans = null;
		Transaction tran1 = null;
		Transaction trans2 = null;
		
		Session session = HibernateUtil.getSessionFactory().openSession();
		trans = session.beginTransaction();
		session.save(student1);
		trans.commit();
		session.close();
		
		Session perSession = HibernateUtil.getSessionFactory().openSession();
		tran1 = perSession.beginTransaction();
		perSession.persist(student2);
		tran1.commit();
		perSession.close();
		
		Thread.sleep(100000);
		Session newSession = HibernateUtil.getSessionFactory().openSession();
		trans2 = newSession.beginTransaction();
		//student1 = new Student();
		student1.setFirstName("gurunathan");
		newSession.merge(student1);
		trans2.commit();
		newSession.close();
		
	}

}
