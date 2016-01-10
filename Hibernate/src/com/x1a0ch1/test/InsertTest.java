package com.x1a0ch1.test;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.x1a0ch1.factory.HibernateSessionFactory;
import com.x1a0ch1.model.Student;

public class InsertTest {
	public static void main(String[] args){
		Student student=new Student();
		student.setId("0509301*21");
		student.setName("����");
		student.setSubject("��ѧ����");
		student.setResult(90.0);
		Session session=HibernateSessionFactory.getSession();
		Transaction transaction=null;
		
		try {
			transaction = session.beginTransaction();
			session.save(student);
			transaction.commit();System.out.println("��Ӽ�¼�ɹ�");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			transaction.rollback();
		}
		HibernateSessionFactory.closeSession();
	}
}
