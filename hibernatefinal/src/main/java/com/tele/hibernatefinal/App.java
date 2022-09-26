package com.tele.hibernatefinal;

import java.io.ObjectInputFilter.Config;

/**
 * Hello world!
 *
 */
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 *
 */
public class App  
{
    public static void main( String[] args )
    {
    	
    	Staff_list obj1=new  Staff_list();
    	
    	obj1.setId(101);
    	obj1.setName("Himanshu");
    	obj1.setcity("Delhi");
    	obj1.setphone(96);
    	obj1.setcountry("India");
	     
    	Staff_list obj2=new  Staff_list(); 
    	
    	obj2.setId(102);
    	obj2.setName("Swayam");
    	obj2.setcity("Gujrat");
    	obj2.setphone(99);
    	obj2.setcountry("India");
	    
        Staff_list obj3=new  Staff_list(); 
    	
    	obj3.setId(103);
    	obj3.setName("Rohan");
    	obj3.setcity("Banglore");
    	obj3.setphone(97);
    	obj3.setcountry("India");
	    
        Staff_list obj4=new  Staff_list(); 
    	
    	obj4.setId(104);
    	obj4.setName("Ankit");
    	obj4.setcity("Mumbai");
    	obj4.setphone(98);
    	obj4.setcountry("India");
	    
        Staff_list obj5=new  Staff_list(); 
    	
    	obj5.setId(105);
    	obj5.setName("Ravi");
    	obj5.setcity("Pune");
    	obj5.setphone(91);
    	obj5.setcountry("India");
	    
    	Configuration cong=new Configuration().configure().addAnnotatedClass(Staff_list.class);
    	SessionFactory sf = cong.buildSessionFactory();
    	Session session=sf.openSession();
    	Transaction tx=session.beginTransaction();
    	
    	session.save(obj1);
    	session.save(obj2);
    	session.save(obj3);
    	session.save(obj4);
    	session.save(obj5);
    	tx.commit();
    	session.flush();
    	session.close();
        System.out.println( "Hello World!" );
    }
}
