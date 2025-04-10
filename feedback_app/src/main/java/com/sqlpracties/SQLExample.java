package com.sqlpracties;

import java.util.Arrays;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.NativeQuery;

import com.entities.Student;

public class SQLExample {
	public static void main(String[] args) {
		
		SessionFactory factory = new Configuration().configure().buildSessionFactory();

		Session s = factory.openSession();
		
		// SQL QUERY
		String q = "select * from Student"; 
		
		NativeQuery nq = s.createSQLQuery(q);
		
		
		List<Object[]> list= nq.list();
		//both are same use any one 
		//nq.getResultList();
		
		for(Object[] student : list) {
			// System.out.println(Arrays.toString(student));  // print all array in string 
			System.out.println(student[4] + " : " + student[3]);
		}
		s.close();
		factory.close();
	}
}
