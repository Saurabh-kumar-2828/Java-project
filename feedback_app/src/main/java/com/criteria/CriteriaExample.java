package com.criteria;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Restrictions;

import com.entities.Student;

public class CriteriaExample {
	public static void main(String[] args) {
		
		Session s = new Configuration().configure().buildSessionFactory().openSession();
		
		Criteria c = s.createCriteria(Student.class);
		
		// add filter(restrictions) to get data
		//c.add(Restrictions.eq("city", "delhi"));
		
		// another filter (restrictions)
		c.add(Restrictions.gt("id", 24)); // where id grater then 24 
		c.add(Restrictions.lt("id", 24)); // where id less then 24 

		List<Student> students = c.list();
		
		for(Student st:students) {
			System.out.println(st);
		}
		
		
		s.close();
	}
}
