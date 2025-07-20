package com.collections_class;

import java.util.Comparator;

public class Comp implements Comparator<String> {

	@Override
	public int compare(String o1, String o2) {
		if(o1.charAt(o1.length()-2)>o2.charAt(o2.length()-2))
			return 1;
		else if(o1.charAt(o1.length()-2)<o2.charAt(o2.length()-2))
			return -1;
		else
			return 0;
	}
	

}
