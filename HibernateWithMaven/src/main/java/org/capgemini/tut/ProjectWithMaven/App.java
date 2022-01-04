package org.capgemini.tut.ProjectWithMaven;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App {

	public static void main(String[] args) {
		System.out.println("Project Started...!");
		
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.xml");	
		SessionFactory factory = cfg.buildSessionFactory();
		
		//Creating a student object 
		Student st = new Student();
		st.setId(65);
		st.setName("Naga");
		st.setCity("Mumbai");
		System.out.println(st);
		
		Session session = factory.openSession(); //Getting the data saved
		Transaction tx = session.beginTransaction();
		
		session.save(st);
		tx.commit(); //Entity of a table Record saved to the database.
		session.close();
		System.out.println("Record saved successfully into the database");
		
		System.out.println(factory);
		//I would like to check the connection to the database is closed or not
		System.out.println(factory.isClosed());
		System.out.println(factory.isOpen());
	//	System.out.println(factory.equals(cfg));
	//	System.out.println(factory.getSessionFactory());
	}
}
