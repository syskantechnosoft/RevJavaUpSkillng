package com.revature.myhibernate;

import org.hibernate.Session;

import com.revature.myhibernate.dto.Employee;
import com.revature.myhibernate.util.HibernateUtil;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
//        System.out.println( "Hello World!" );
		Session session = HibernateUtil.getSessionFactory().openSession();
		session.beginTransaction();

		// Add new Employee object
		Employee emp = new Employee();
		emp.setEmail("demo-user@mail.com");
		emp.setFirstName("demo");
		emp.setLastName("user");

		session.save(emp);

		session.getTransaction().commit();
		HibernateUtil.shutdown();
		System.out.println("Done!!!");
	}

}
