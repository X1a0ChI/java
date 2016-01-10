package com.x1a0ch1.testgnl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import ognl.Ognl;
import ognl.OgnlException;

import com.x1a0ch1.pojo.Employee;
import com.x1a0ch1.pojo.Koo;

public class OGNLTest {

	public static void main(String[] args) throws OgnlException {
		Koo koo=new Koo();
		Map context=new HashMap();
		Employee e1=new Employee();
		e1.setId(1);
		e1.setName("TOM");
		Employee e2=new Employee();
		e2.setId(2);
		e2.setName("jack");
		Employee e3=new Employee();
		e3.setId(3);
		e3.setName("rose");
		List<Employee> employees=new ArrayList<Employee>();
		employees.add(e1);
		employees.add(e2);
		employees.add(e3);
		koo.setEmployees(employees);
		List<Employee> lis=(List<Employee>)Ognl.getValue("employees.{?#this.id==1}",context,koo);
		List<Employee> lis2=(List<Employee>)Ognl.getValue("employees.{?#this.id>1}",context,koo);
		System.out.println(lis.get(0).getName());
		System.out.println("----------------------");
		for(Employee e:lis2){
			System.out.println(e.getId()+" : "+ e.getName());
		}
	}

}
