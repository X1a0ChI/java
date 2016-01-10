package com.x1a0ch1.testgnl;

import java.util.HashMap;
import java.util.Map;

import ognl.Ognl;
import ognl.OgnlException;

import com.x1a0ch1.pojo.Foo;

public class MapTest {

	public static void main(String[] args) throws OgnlException {
		Foo foo=new Foo();
		Map context=new HashMap();
		Map map=(Map)Ognl.getValue("#{1:'tom',2:'jack',3:'rose'}", context,foo);
		foo.setMap(map);
		String tom=(String)Ognl.getValue("map[1]", context,foo);
		String jack=(String)Ognl.getValue("map[2]", context,foo);
		System.out.println(tom);
		System.out.println(jack);
	}

}
