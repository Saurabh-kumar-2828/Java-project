package com.hqlPractiesCode;

import java.util.Arrays;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import com.entities.Student;

public class HQLExample {
	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory factory = cfg.buildSessionFactory();

		Session s = factory.openSession();

		// HQL
		// Syntax:
		//
		// String query = "from Student"; // get all result

		// String query = "from Student where city='Lacknow'";
		//String query = "from Student where city=:x";
		
		// using alias
		String query = "from Student as s where s.city=:x and s.name=:n";
		

		Query q = s.createQuery(query);

		q.setParameter("x", "Lacknow");
		q.setParameter("n", "peter");

		// single -(Unique)
		// q.uniqueResult();

		// Multiple - list
		List<Student> list = q.list();

		for (Student student : list) {
			System.out.println(student.getName() + " : " + student.getCity());
		}
		
		System.out.println("______________________________________________");
		
		// delete query here .......................
		
		/*
		 * Transaction tx = s.beginTransaction();
		 * 
		 * Query q2 = s.createQuery("delete from Student s where s.city=:c");
		 * q2.setParameter("c", "ABC");
		 * 
		 * int r= q2.executeUpdate(); System.out.println("Deleted : ");
		 * System.out.println(r); tx.commit();
		 */
		
		// update query here  ..........................................
		
		/*
		 * Transaction tx = s.beginTransaction();
		 * 
		 * Query q3 = s.createQuery("update Student set city=:c, where name=:n");
		 * q3.setParameter("c", "delhi"); q3.setParameter("n", "Peter"); int r =
		 * q3.executeUpdate(); System.out.println(r + "Object Updated ");
		 * 
		 * tx.commit();
		 */
		
		//how to execute join 
		
		Query q4 = s.createQuery("select q.question, q.questionId, a.answer from Question as q INNER JOIN q.answers as a");
		List<Object[]> list4 = q4.getResultList();
		
		for(Object[] arr : list4) {
			System.out.println(Arrays.toString(arr));
		}
		
		s.close();
		factory.close();
	}

}
