/**
 * 
 */
package com.x1a0ch1.testgnl;

import java.util.HashMap;
import java.util.Map;

import ognl.Ognl;
import ognl.OgnlException;

import com.x1a0ch1.pojo.Foo;

/**
 * @author Administrator
 *
 */
public class ArrayTest {

	/**
	 * @param args
	 * @throws OgnlException 
	 */
	public static void main(String[] args) throws OgnlException {
		Foo foo=new Foo();
		String[] arr={"����","����","����","С��"};
		foo.setArr(arr);
		Map map=new HashMap();
		String arr1=(String) Ognl.getValue("arr[1]", map,foo);
		System.out.println("�ڶ���Ԫ��:"+arr1);
	}

}
