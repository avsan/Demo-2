package com.satya.hibernate.utill;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtill {

	private static SessionFactory factory;
	
	private HibernateUtill(){
	}
public static synchronized SessionFactory getSessionFactory(){
		
		if(factory==null){
			factory = new Configuration().configure("com/satya/hibernate/config/hibernate.cfg.xml").buildSessionFactory();
		}
		return factory;
		
	}
	
}
