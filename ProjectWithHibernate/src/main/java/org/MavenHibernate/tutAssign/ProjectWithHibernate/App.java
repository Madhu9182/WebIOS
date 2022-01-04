package org.MavenHibernate.tutAssign.ProjectWithHibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        System.out.println("Project started...!!!");
        
        //Establishing connection
        
        Configuration cfg = new Configuration();
        cfg.configure("hibernatemaven.xml");
        SessionFactory fty = cfg.buildSessionFactory();
        
        //Creating an Object for order
        Order ord = new Order();
        ord.setId(123);
        ord.setName("Ferrari");
        ord.setPrice("4000 Pounds");
        
        
        
        Session session = fty.openSession();
        Transaction txn = session.beginTransaction();
        
        session.save(ord);
        txn.commit();
        
        session.close();
        System.out.println("Records saved");
        System.out.println(fty.isClosed());
        System.out.println(fty.isOpen());
        System.out.println(fty);
    }
}
