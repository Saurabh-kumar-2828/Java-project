package com.sqlpracties;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.entities.Student;

public class FirstLevelChacheExamble {
	public static void main(String[] args) {
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session session = factory.openSession();
		// by default enable
		
		Student student = session.get(Student.class, 121); // now store first level cache here 
		System.out.println(student);
		
		// working something
		System.out.print("Working something....");
		Student student1 = session.get(Student.class, 121);
		// here query not fare because session cache store by default this object
		System.out.print(student1);
		
		// check in session cache 121 id data present or note 
		System.out.println(session.contains(student1));
		
		session.close();
	}
}
