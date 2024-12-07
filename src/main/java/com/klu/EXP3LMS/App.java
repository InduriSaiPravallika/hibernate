package com.klu.EXP3LMS;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );

        StandardServiceRegistry ssr = new StandardServiceRegistryBuilder().configure("Hibernate.cfg.xml").build();
        Metadata md = new MetadataSources(ssr).getMetadataBuilder().build();
        SessionFactory sf = md.getSessionFactoryBuilder().build();
        
        Session session = sf.openSession();
        Transaction transaction = session.beginTransaction();
        
        Book book1 = new Book();
        book1.setTitle("Harry Potter");
        book1.setAuthor("J.K. Rowling");
        book1.setIsbn(123456789);
        session.save(book1);
        
        DVD dvd1 = new DVD();
        dvd1.setTitle("The Matrix");
        dvd1.setDirector("Lana Wachowski, Lilly Wachowski");
        dvd1.setRegioncode(1);
        session.save(dvd1);
        
        transaction.commit();
        session.close();
        
        System.out.println("Inserted Data");
    }
}
