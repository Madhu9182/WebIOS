package org.MavenHibernatetutorials.ProjectWithMvnAndHbnte;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        System.out.println("Project Started....!!!");
        
        Configuration cfg = new Configuration();
        cfg.configure("maven.xml");
        SessionFactory factory = cfg.buildSessionFactory();
        
        //Creating a object
        Employee emp = new Employee();
        emp.setEmpId(456);
        emp.setEmpName("Venkat");
        emp.setEmpPh("9182744558");
        emp.setEmpDeskNo(256894);
        System.out.println(emp);
        
        Session session = factory.openSession();
        Transaction txn = session.beginTransaction();
        txn.commit();
        session.close();
        System.out.println("Record saved in database");
        
        System.out.println(factory);
        System.out.println(factory.isClosed());
        System.out.println(factory.isOpen()); 
    }
}
