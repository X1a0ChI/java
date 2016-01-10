/**
 * 
 */
package com.x1a0ch1.testgnl;

import java.util.HashMap;
import java.util.Map;

import ognl.Ognl;
import ognl.OgnlException;

import com.x1a0ch1.pojo.Goo;

/**
 * @author Administrator
 *
 */
public class StaticMethodTest {

	/**
	 * @param args
	 * @throws OgnlException 
	 */
	public static void main(String[] args) throws OgnlException {
		Goo goo=new Goo();
		Map map=new HashMap();
		int up=(int) Ognl.getValue("@com.x1a0ch1.pojo.Goo@getUP()", map,goo);
		int down=(int) Ognl.getValue("@com.x1a0ch1.pojo.Goo@getDOWN()", map,goo);
		int right=(int) Ognl.getValue("@com.x1a0ch1.pojo.Goo@getRIGHT()",map,goo);
		int left=(int) Ognl.getValue("@com.x1a0ch1.pojo.Goo@getLEFT()", map,goo);
		System.out.println("up:"+up);
		System.out.println("down:"+down);
		System.out.println("right:"+right);
		System.out.println("left:"+left);
	}

}
