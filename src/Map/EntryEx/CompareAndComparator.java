package Map.EntryEx;

import java.util.Map;
import java.util.Map.Entry;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.ArrayList;
import java.util.List;
public class CompareAndComparator {

	public static void main(String[] args) {
		
		System.out.println("Program start");
		Map<Integer,String> map=new HashMap<Integer,String>();          
	      map.put(100,"Amit");    
	      map.put(101,"Vijay");    
	      map.put(102,"Rahul"); 
	      map.put(96, "shekh");
	      List<String> list=new ArrayList<>();
	      list.add("khan");
	      list.add("md");
	      list.add("belal");
	      //map.entrySet().stream().sorted(Map.Entry.comparingByKey()).forEach(System.out::println);
	      // map.entrySet().stream().sorted(Map.Entry.comparingByValue()).forEach(System.out::println);
	      // map.values().stream().sorted().forEach(System.out::println);;
          // list.stream().sorted().forEach(System.out::println);
	      map.entrySet().stream().sorted(new Comparator<Map.Entry<Integer, String>>() {

			@Override
			public int compare(Entry<Integer, String> o1, Entry<Integer, String> o2) {
				return o1.getValue().compareTo(o2.getValue());
			}
	    	  
		}).forEach(System.out::println);
	}

}
