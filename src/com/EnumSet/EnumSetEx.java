package com.EnumSet;

import java.util.EnumSet;
import java.util.Iterator;
import java.util.Set;

enum days{
	SUNDAY,MONDAY,TUESDAY,WEDNESDAY,THURSDAY,FRIDAY,SATURDAY
}

public class EnumSetEx {

	public static void main(String[] args) {
		
		EnumSet<days> set,set1;
		set=EnumSet.allOf(days.class);
		Iterator itr=set.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		set1=set.clone();
		System.out.println(set1);
		

	}

}
