package collections.Map;
import java.util.Queue;
import java.util.Deque;
import java.util.Collections;
import java.util.Comparator;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
public class CollectionsClassEx {

	public static void main(String[] args) {
		  ArrayList arrlist = new ArrayList<>();  
          arrlist.add("ABCDG");  
          arrlist.add("AB");  
          arrlist.add("ABC");  
          arrlist.add("ABCD");  
         // arrlist.add(9);
        // Collections.reverse(arrlist);
        
         Collections.sort(arrlist, Collections.reverseOrder(new Comparator<String>() {
        	@Override
            public int compare(String o1,String o2) {
        		if(o1.length()>o2.length())
        			return 1;
        		else if(o1.length()<o2.length())
        			return -1;
        		else
        			return 0;
        		 
        	 }

			
		}));
         System.out.println(arrlist);
          
          
	}
}
