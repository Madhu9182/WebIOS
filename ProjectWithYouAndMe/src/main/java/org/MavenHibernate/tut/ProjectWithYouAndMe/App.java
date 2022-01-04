package org.MavenHibernate.tut.ProjectWithYouAndMe;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        System.out.println("project started...!!!");
        
        //Establishing connection
        
        Configuration cfg = new Configuration();
        cfg.configure("hibernate.maven.xml");
        SessionFactory fty = cfg.buildSessionFactory();
        
        //Creating object for product
        Product prd = new Product();
        prd.setId(17);
        prd.setName("Hp Pavilion");
        prd.setPrice("80 pounds");
        System.out.println(prd);
        
        //Creating object for courses
        Courses crs = new Courses();
        crs.setCourseId(105);
        crs.setCourseName("JEE Full Stack with Azure");
        crs.setCoursePrice(30000);
        crs.setCourseDuration("01-march-2021 to 06-july-2021");
        
        
        Session session = fty.openSession();
        Transaction tax = session.beginTransaction();
        
        session.save(prd);
        session.save(crs);
        
        tax.commit();
        session.close();
        System.out.println("Records saved");
        
        System.out.println(fty);
    }
}
