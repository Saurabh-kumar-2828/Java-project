package com.sqlpracties;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.entities.Student;

public class SecondLevelCache {
	public static void main(String[] args) {
		 		
			SessionFactory factory = new Configuration().configure().buildSessionFactory();
			Session session1 = factory.openSession();
			// first
			Student student1 = session1.get(Student.class, 12424);
			System.out.print(student1);
			
			session1.close();
			
			Session session2 = factory.openSession();
			// Second
			Student student2 = session2.get(Student.class, 12424);
			System.out.print(student2);
			
			session2.close();
	}

}
