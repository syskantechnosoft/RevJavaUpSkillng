package com.revature;

import java.util.List;

import javax.persistence.Query;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

import com.revature.model.Student;

public class Starter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StandardServiceRegistry registry = new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();
		SessionFactory sessionFactory = new MetadataSources(registry).buildMetadata().buildSessionFactory();
		Session session = sessionFactory.openSession();
		session.beginTransaction();

//		Query query = session.getNamedQuery("findStudentByID").setParameter("id", 32);
		Query query = session.getNamedQuery("viewAllStudents");
		List<Student> students = query.getResultList();
		for (Student student : students) {
			System.out.println(student);
		}
		session.getTransaction().commit();
		session.close();
	}

}
