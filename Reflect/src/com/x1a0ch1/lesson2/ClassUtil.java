package com.x1a0ch1.lesson2;

import java.lang.reflect.Method;

public class ClassUtil {
	public static void printClassMessage(Object obj){
		Class c=obj.getClass();
		System.out.println(c.getName());
		Method[] ms=c.getMethods();//所有public的函数
	//	c.getDeclaredMethods();//自己声明的
		for(int i=0;i<ms.length;i++){
			Class returnType=ms[i].getReturnType();
			System.out.print(returnType.getName()+" ");
		System.out.print(ms[i].getName()+"(");
		Class[] paramTypes=ms[i].getParameterTypes();
		for(Class class1:paramTypes){
			System.out.print(class1.getName()+",");
		}
		System.out.println(")");
		}
		System.out.print(c.getName());
	}
}
