/**
 * 
 */
package com.x1a0ch1.testgnl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import ognl.Ognl;
import ognl.OgnlException;

import com.x1a0ch1.pojo.Foo;

/**
 * @author Administrator
 *
 */
public class ListTest {

	/**
	 * @param args
	 * @throws OgnlException 
	 */
	public static void main(String[] args) throws OgnlException {
		Foo foo=new Foo();
		Map map=new HashMap();
		List<String> list=(List<String>) Ognl.getValue("{'∫ÏÃ“1','∫ÏÃ“2','∫ÏÃ“3'}", map,foo);
		foo.setList(list);
		String l=(String) Ognl.getValue("list[1]",map,foo);
		System.out.println("listµƒ÷µ:"+l);
	}

}
