package TestPreparation;
import java.util.*;
import java.util.Map.Entry;
import java.util.stream.*;
import java.util.function.Function;  
import java.util.function.*;
import java.util.function.Supplier;  
public class Demo implements MulInterfaceDeclaration,SumInterface {
	
	 static MulInterfaceDeclaration mul=(x)->{
		return x*3;
	};

	@Override
	public Integer mul(int a) {
		return a*3;
	}

	@Override
	public int sum(int a, int b) {
		
		return a+b;
	}
	

	public static void main(String[] args) {
		
		Book b1=new Book(3,"name1","A1","p1",6);
		Book b2=new Book(2,"name2","A2","p2",8);
		Book b3=new Book(2,"name2","A2","p2",8);
		Book b4=new Book(5,"name4","A4","p4",9);
		
		 Stream.Builder<Book> builder = Stream.builder();
		 List<Book> books=builder.add(b1).add(b2).add(b3).add(b4).build().collect(Collectors.toList());
         books.forEach(x->System.out.println(x));
        
        Map<Integer,Book> map=new HashMap<>();
        map.put(4, b4); map.put(1, b1); map.put(3, b3); map.put(2, b2);
         
        
        
	
		//Demo d=new Demo();
		List<String> words = Arrays.asList("Java", "Stream", "Method", "References");  
        
        ArrayList<String> upperCaseWords =  (ArrayList<String>) words.stream()  
                                           .map(String::toUpperCase).collect(Collectors.toList()) ;
        System.out.println("Uppercase Words: " + upperCaseWords);  
          
        System.out.println("Printing each word:");  
        words.forEach(System.out::println); // instance method reference  
        
        Supplier<List<String>> listSupplier = ArrayList::new; 
        List<String> newList = listSupplier.get();  
        newList.addAll(words);  
        System.out.println("New List: " + newList);  
       
        Function<String, Integer> stringToInteger = Integer::new; 
        Integer number = stringToInteger.apply("100");  
        System.out.println("String to Integer: " + number);  
        
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);  
        int num= numbers.stream().mapToInt(x->{
        	return x*3;
        	}).reduce(0,new Demo()::sum);
        
        System.out.println(num);
        numbers.stream().collect(()->new ArrayList<Integer>(),
        		                     (list,b)->{
        		                    	 list.add(b);
        		                     }, (list1,list2)->list1.addAll(list2)).forEach(System.out::println);;
        
        
		
		   books.stream()
		  .sorted(new BookIDComparator())
		  .forEach(System.out::println);
		   
		   Integer[] arr=numbers.toArray(new Integer[numbers.size()]);
		   
		  Stream<ArrayList<Integer>> s= Stream.generate(()->new ArrayList<Integer>());
		 // Stream st=Stream.iterate(0,(x)-> {return ++x;});
		 // st.forEach(x->System.out.println(x));
		 TreeMap<Integer,List<Book>> m =books.stream().collect(Collectors.groupingBy(Book::getId,TreeMap::new,Collectors.toList()));
         Map<Integer,String> bt=books.stream().collect(Collectors.toMap(Book::getId,Book::getName,(x,y)->{
        	 return x;
         },LinkedHashMap::new));
		  System.out.println(bt);
		  
	}
	
	
}
