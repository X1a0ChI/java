/**
 * 
 */
package com.x1a0ch1.testgnl;
import java.util.HashMap;
import java.util.Map;

import ognl.Ognl;
import ognl.OgnlException;

import com.x1a0ch1.pojo.*;

/**
 * @author Administrator
 *
 */
public class StaticFieldTest {

	/**
	 * @param args
	 * @throws OgnlException 
	 */
	public static void main(String[] args) throws OgnlException {
		Goo goo=new Goo();
		Map map=new HashMap();
		int up=(Integer)Ognl.getValue("@com.x1a0ch1.pojo.Goo@UP", map,goo);
		int down=(Integer)Ognl.getValue("@com.x1a0ch1.pojo.Goo@DOWN", map,goo);
		int right=(Integer)Ognl.getValue("@com.x1a0ch1.pojo.Goo@RIGHT", map,goo);
		int left=(Integer)Ognl.getValue("@com.x1a0ch1.pojo.Goo@LEFT",map,goo);
		System.out.println("up:"+up);
		System.out.println("down:"+down);
		System.out.println("right:"+right);
		System.out.println("left:"+left);
	}

}
