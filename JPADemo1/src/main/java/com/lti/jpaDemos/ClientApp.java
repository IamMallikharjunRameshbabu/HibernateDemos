package com.lti.jpaDemos;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class ClientApp {
	public static void main(String[] args) {
		
		Student s1= new Student(55,"Ram",78);
		Student s2= new Student(52,"Madhu",80);
		Student s3= new Student(53,"MadhuMathi",75);
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("JPA-PU");
		EntityManager em = factory.createEntityManager();
		
//		em.getTransaction().begin();
		
//		em.persist(s1);
//		em.persist(s2);
//		em.persist(s3);

//		System.out.println("Record added");
		
//		em.getTransaction().commit();
		
		//Retriving data Form Table-----
		
		
		em.getTransaction().begin();
		
		Student temp=em.find(Student.class,55);
		
		System.out.println(temp.getScore());
		
		em.getTransaction().commit();
		
		//Updating Record----
		
		temp.setScore(1);

		em.getTransaction().begin();
		
		em.merge(temp);
		
		em.getTransaction().commit();
		
		System.out.println(temp.getScore());
		
		//deleting-----------
		
		em.getTransaction().begin();
		
		em.remove(temp);
		
		em.getTransaction().commit();
		
		System.out.println(temp.getScore());
		
		em.close();
		
	}
	
	
}
