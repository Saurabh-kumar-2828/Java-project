package com.spring.orm;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.orm.dao.StudentDao;
import com.spring.orm.entities.Student;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
    	StudentDao studentDao = context.getBean("studentDao", StudentDao.class);
    	
    	
//    	Student student = new Student(222,"Durgesh Tiwari", "lucknow");
//    	
//    	int r = studentDao.insert(student);
//    	
//    	System.out.println("done " + r);
    	
    	
    	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    	boolean go = true;
    	while(go) {
    		System.out.println("PRESS 1 for add new student");
        	System.out.println("PRESS 2 for display all students ");
        	System.out.println("PRESS 3 for get detail of single student ");
        	System.out.println("PRESS 4 for delete student ");
        	System.out.println("PRESS 5 for update studdent ");
        	System.out.println("PRESS 6 for exit ");
        	
           try {
        	   
        	   int input = Integer.parseInt(br.readLine());
        	   
        	   // using conditional statement  
//        	   if(input == 1) {
//        		   // add a new student
//        	   }else if(input == 2) {
//        		   // display all student 
//        	   }
        	   
        	   // using switch statement 
        	  switch (input) {
        	   case 1:
        		   // add a new student 
        		   // taking input from users 
        		   
        		   System.out.println("Enter user Id : ");
        		   int uId = Integer.parseInt(br.readLine());
        		   
        		   System.out.println("Enter user name : ");
        		   String uName = br.readLine();
        		   
        		   System.out.println("Enter user city : ");
        		   String uCity = br.readLine();
        		   
        		   // creating student object and setting values
        		   Student student = new Student();
        		   student.setId(uId);
        		   student.setStudentName(uName);
        		   student.setStudentCity(uCity);
        		   
        		   // saving student object to database by calling insert of student dao
        		   int r = studentDao.insert(student);
        		   
        		   System.out.println(r + " student added ");
        		   System.out.println("*************************************************");
        		   System.out.println();
        		   
        		   
        		   break;
        	   case 2:
        		   // display all student
    			   System.out.println("*************************************************");

        		   
        		   List<Student> allStudents = studentDao.getAllStudents();
        		   for(Student st : allStudents) {
        			   System.out.println("Name : "+ st.getStudentName());
        			   System.out.println("Id : "+ st.getId());
        			   System.out.println("cITY : "+ st.getStudentCity());
        			   System.out.println("______________________________________________");
        		   }
    			   System.out.println("*************************************************");

        		   break;
        	   case 3:
        		   // get single student data
        		   System.out.println("Enter user Id : ");
        		   int userId = Integer.parseInt(br.readLine());
        		   Student singleStudent = studentDao.getStudent(userId);
        		   System.out.println("Name : "+ singleStudent.getStudentName());
    			   System.out.println("Id : "+ singleStudent.getId());
    			   System.out.println("cITY : "+ singleStudent.getStudentCity());
    			   System.out.println("______________________________________________");
    			   System.out.println("*************************************************");

        		   break;
        	   case 4:
        		   // for delete student 
        		   System.out.println("Enter user Id : ");
        		   int id = Integer.parseInt(br.readLine());
        		   studentDao.delete(id);
        		   System.out.println("Student deleted .. ");
    			   System.out.println();

        		   break;	
        	   case 5:
        		   // update the student 
        		   System.out.println("Enter user Id : ");
        		   int sId = Integer.parseInt(br.readLine());
                   
        		   System.out.println("Enter user name : ");
        		   String sName = br.readLine();
        		   
        		   System.out.println("Enter user city : ");
        		   String sCity = br.readLine();
        		   
        		   Student student2 = new Student();
        		   student2.setId(sId);
        		   student2.setStudentName(sName);
        		   student2.setStudentCity(sCity);
        		   
        		   studentDao.updateStudnet(student2);
        		   
    			   System.out.println("student id "+ sId + " is updated ... ");
    			   System.out.println("");


        		   break;
        	   case 6:
        		   //  exit
        		   go = false;
        		   break;	   
        	   }
        	   
           }catch(Exception e) {
        	   System.out.println("Invalid Input Try with another one !! ");
        	   System.out.println(e.getMessage());
           }
    	}
    	
    	System.out.println("Thankyou for using my application");
    	System.out.println("See you soon !! ");

    }
}
