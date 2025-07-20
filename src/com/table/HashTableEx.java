package com.table;
import java.util.HashMap;
import java.util.Map;
public class HashTableEx {

	public static void main(String[] args) {
		HashMap<Integer,Integer> ht=new HashMap<Integer,Integer>();
		ht.put(1,10);
		ht.put(5, 50);
		ht.put(3,30);
        ht.put(2, 20);
        ht.merge(1,400,(a1,a2)->(a1+36));
        
        for(Map.Entry<Integer,Integer> entry:ht.entrySet()) {
        	System.out.println(entry.getKey()+"   "+entry.getValue());
        }
   
	}

}
