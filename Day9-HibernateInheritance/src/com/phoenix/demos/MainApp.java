package com.phoenix.demos;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class MainApp {

	public static void main(String[] args) {
		
		Employee e1=new Employee(1,"Chetan");
		ProjectManager p1=new ProjectManager(2,"Mahesh",2);
		Employee e2=new ProjectManager(3, "Suresh", 4);
		
		Session ses=new Configuration().configure().buildSessionFactory().openSession();
		Transaction tr=ses.beginTransaction();
		ses.save(e1);
		ses.save(p1);
		ses.save(e2);
		tr.commit();
		ses.close();
	}

}
