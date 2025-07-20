package collections.Map.TreeMap;
import java.util.TreeMap;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;
public class TreeMapEx {

	public static void main(String[] args) {
		TreeMap<Integer,String> map=new TreeMap<Integer,String>();    
	      map.put(100,"Amit");    
	      map.put(102,"Ravi");    
	      map.put(101,"Vijay");    
	      map.put(103,"Rahul");    
	     
	      Set s=map.entrySet();
	      Iterator itr=s.iterator();
	     
	      map.put(104, "Belal");
	      while(itr.hasNext()) {
	    	  System.out.println(itr.next());
	      }
	    
	   //   Comparator c=map.comparator();
	      
	  //    System.out.println(map.lowerKey(98));
	}

}
