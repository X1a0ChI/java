package com.x1a0ch1.bean;

import java.util.Comparator;

public class abcComparator implements Comparator {

	@Override
	public int compare(Object o1, Object o2) {
		// TODO Auto-generated method stub
		return ((String)o1).compareTo((String)o2);
	}

}
