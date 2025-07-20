package collections.Map;
import java.util.Map;
import java.util.LinkedList;
import java.util.List;
import java.util.Map.Entry;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.TreeMap;
public class MapExamples {

	public static void main(String[] args) {
		TreeMap<Object,Object> map=new TreeMap<Object,Object>();  
		  map.put(100,"Amit");  
		  map.put(101,"Vijay");  
		  map.put(102,"Rahul");  
		  map.put(40.0,"Belal");
		  
		  // sorting 
		  
		  sort(map);
		 HashMap<Number,String> map2=new HashMap<Number,String>(); 
		 
		    /*  //won't work due to wildcard construts <? extends k,? extends V>
			 *   Map<Integer,String> map2=new HashMap<Integer,String>(map);  
			 */
			  
		 
		 //replace
		 // map.replaceAll((x,y)->"Ajaay");
		 
		// map2=(HashMap<Number, String>) map.clone();
		 		  
		
     /*	  map2.put(10001,"Amit Kumar");  
		  map2.put(10101,"Vijay  sinha");  
		  map2.put(10201,"Rahul kanwal");  */
		  
	    /*Set<Map.Entry<Integer,String>> entry=map.entrySet();
		  Iterator itr=entry.iterator();
		  while(itr.hasNext()) {
			  Map.Entry ent=(Map.Entry<Integer, String>)itr.next();
			  System.out.println(ent.getKey()+"  "+ent.getValue());
		  }
		    
		  Set<Integer> keys=map.keySet();
		  for(int key:keys) {
			  System.out.println(key);
		  }*/
		 
		// map.clear();

		/* map.forEach((x,y)->{
			  x=x+1;
			  System.out.println(x+"  "+y);
		  });*/
		  
	/*	  map.merge(102, "Belal",(k,v)->{
			 return k.concat(v);
		  });*/
		  
	/*	  map2.replaceAll((x,y)->{
			  return y.concat("!");
		  });*/
		  
	/*	  map2.computeIfAbsent(102,(x)->{
			 return "Md Belal";
			  
		  });*/
		  System.out.println(map.values());
		
	}

	private static void sort(TreeMap<Object, Object> map) {
		List list=new LinkedList(map.entrySet());
		Collections.sort(list,new Comparator<Object>() {
            @Override            
			public int compare(Object o1, Object o2) {
            	Map.Entry entry1=(Map.Entry)o1;
            	Map.Entry entry2=(Map.Entry)o2;
            	
            	String value1=(String) entry1.getValue();
            	String value2=(String) entry2.getValue();
            	
            	return  value1.compareTo(value2);
	
		
			}

			
			
		});
		System.out.println(list);
		
	}

}
