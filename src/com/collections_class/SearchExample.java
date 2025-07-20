package com.collections_class;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.ArrayList;
import java.util.Collection;
public class SearchExample{
	
	
  public int compare(String o1, String o2) {
		  
		 if(o1.charAt(o1.length()-3)>o2.charAt(o2.length()-3))
			  return 1; 
		  else if(o1.charAt(o1.length()-3)<o2.charAt(o2.length()-3)) 
			  return -1; 
		  else 
			  return 0;
		  
	  }
  
  public int compare2(Integer o1, Integer o2) {
	    
	  Integer r1=0,r2=0;
	  if(o1%2==0 && o2%2==0)
	  {
		r1=o1%2;
		r2=o2%2;
		
		return r1.compareTo(r2);
	 }
	return 0;
  }

	  
 public static void main(String[] args) {
		
		  Comparator c=new Comparator() {
		  @Override 
		  public int compare(Object o1, Object o2) {
		  
		  if(o1.toString().charAt(o1.toString().length()-1)>o2.toString().charAt(o2.
		  toString().length()-1)) return 1; else
		  if(o1.toString().charAt(o1.toString().length()-1)<o2.toString().charAt(o2.
		  toString().length()-1)) return -1; else return 0; }
		  
		 		};
		
			  
		List<String> names=new ArrayList<String>();
		List<Integer> number=new ArrayList<>();
		
		names.add("Faizi");names.add("MdBelal");names.add("Belal");names.add("Khan");names.add("Aslam");
		number.add(20);	number.add(10);	number.add(2);number.add(5);number.add(108);number.add(1);
		
		System.out.print(names);
		System.out.println();
		System.out.print(number);
		
		System.out.println();
		System.out.println("*********______*******______**********");
		
		//sorting collections
		//Collections.sort(names);
		Collections.sort(number);
		System.out.println(names+"     "+number);
		
		//reverse
		//demo d=new SearchExample()::compare;   //to research
		//Collections.sort(names,new SearchExample()::compare);
		//Collections.sort(number);
		//System.out.println(names+"     "+number);
		System.out.println("*********______Binary Search______**********");
		
		int index=Collections.max(number,new SearchExample()::compare2);
		System.out.println("At Pos:"+index);

		System.out.println("*********______Checked()______**********");
		
		ArrayList arr=new ArrayList<>();
		arr.add(100);
		arr.add("Belal");
		arr.add(67.0);
		System.out.println(arr);
		Collection<Integer> checked=Collections.checkedCollection(arr, Integer.class);
		System.out.println(checked);
		
		arr.add("Faizi");
		checked.add(789);
		System.out.println(arr);
		System.out.println(checked);
		System.out.println("freq:"+Collections.frequency(checked, 100));
		

	}

}
