package com.x1a0ch1.test;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;

import com.x1a0ch1.factory.HibernateSessionFactory;
import com.x1a0ch1.model.Student;

public class QueryTest {

	public static void main(String[] args) {
		Session session=HibernateSessionFactory.getSession();
		Query query=session.createQuery("from Student");
		List list=query.list();
		Iterator iter=list.iterator();
		Student stu=null;
		System.out.println("学号\t\t姓名\t科目\t成绩");
		while(iter.hasNext()){
			stu=(Student) iter.next();
			System.out.println(stu.getId()+"\t"+stu.getName()+"\t"
					+stu.getSubject()+"\t"+stu.getResult());
		}
		HibernateSessionFactory.closeSession();
	}

}
