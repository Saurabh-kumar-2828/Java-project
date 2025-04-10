package com.hqlPractiesCode;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import com.entities.Student;

public class HQLPagination {
	public static void main(String[] main) {
		
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session s = factory.openSession();
	    
		//Query<Student> q = s.createQuery("from Student", Student.class); // this is optional to say types
		
		Query query = s.createQuery("from Student"); 
		
		// implementing pagination using hibernate... 
		
		query.setFirstResult(0);
		
		query.setMaxResults(5);
		
		List<Student> list = query.list();
		
		for(Student st : list) {
			System.out.println(st.getName() + " : " + st.getCity());
		}
		
		s.close();
		factory.close();
	}
}
