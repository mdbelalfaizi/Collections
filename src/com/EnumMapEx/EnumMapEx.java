package com.EnumMapEx;
import java.util.Collection;
import java.util.Collections;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import java.util.Map;
import java.util.ArrayList;
import java.util.List;
public class EnumMapEx {
	
	public enum Days{
		MON,TUE,WED,THU,FRI,SAT,SUN
	}

	public static void main(String[] args) {
		Map mp=new HashMap<Days,String>();
		mp.put(Days.MON,"Belal");
		
		EnumMap<Days,String> map=new EnumMap<Days,String>(Days.class);
		map.put(Days.MON, null);
		map.put(Days.TUE, null);
		map.put(Days.WED,"wednesday");
		
		for(Map.Entry<Days,String> m:map.entrySet()) {
			System.out.println(m.getKey()+"  "+m.getValue());
		}
		EnumMap<Days,String> map2=new EnumMap<Days,String>(map);
		System.out.println(map2);
		
		EnumMap<Days,String> map3=new EnumMap<Days,String>(mp);
		System.out.println(map3);
		
		List<String> c=new ArrayList<String>();
		Collections.addAll(c,"Z","A","B","C","E","F","D");
		System.out.println(c);
		int index=Collections.binarySearch(c,"D",null);
		System.out.println("mis is:"+Collections.min(c,Collections.reverseOrder()));
        System.out.println(index);
        
       	}

}
