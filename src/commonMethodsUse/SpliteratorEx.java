package commonMethodsUse;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Vector;
import java.util.Spliterator;
public class SpliteratorEx {

	public static void main(String[] args) {
		ArrayList<String> firstList=new ArrayList<String>();  
		//adds elements to the array list  
		firstList.add("Apple");  
		firstList.add("Pears");  
		firstList.add("Peach");  
		firstList.add("Papaya");  
		firstList.forEach(x->System.out.println(x));
		
		ListIterator<String> it=firstList.listIterator();
		while(it.hasNext()) {
			String i=it.next();
			if(i.equals("Apple")) {
				it.set(i);
			}
			}
		//second array list      
		ArrayList<String> secondList=new ArrayList<String>();  
		//adds elements to the array list  
		secondList.add("Apple");  
		secondList.add("Pears");  
		secondList.add("Papaya");  
		secondList.add("Peach");  
		//removes all elements from the first list  
		//returns empty list if all the elements of first list match with elements of second list  
		secondList.removeAll(firstList);  
		//prints the element of second list which does not match with the element of the first list  
		System.out.println(secondList);  
	        
	        
	        

	}

}
