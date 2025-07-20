package TestPreparation;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Parameter;
import java.util.Arrays;
import java.util.Optional;
import java.util.StringJoiner;
import java.util.List;

public class Java8Practice {
	
	public enum check {A,B,C,D}
	@MyAnnotation(value="Belal")
	private static String value;
	
	
	public static void main(String []args) throws NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchFieldException {
		
		int age = 0;
		StringJoiner joiner=new StringJoiner("-","*","#");
		joiner.add("Md");
		joiner.add("Belal");
		joiner.add("Faizi");
		System.out.println(value);
		
		assert age>=18:true;//:"Valid";
	
		System.out.println("Assert:"+age);
		
		Optional<StringJoiner> optional=Optional.ofNullable(joiner);
		Optional<List<String>> optInteger=Optional.ofNullable(null);
		optInteger=Optional.of(Arrays.asList("A","B","C","D"));
		
		if(optInteger.isPresent()) {
			System.out.println(optInteger.get());
			boolean flag=optInteger.get().stream().anyMatch(x->{
				
					return true;
			
			});
			System.out.println(flag);
			int [] a=new int[7];
	      //		Arrays.
			
			GenericClass<String> g=new GenericClass<String>("Md belal","Faizi",89);
			Java8Practice obj=new Java8Practice();
			Method []method=obj.getClass().getMethods();
			Class c=obj.getClass();
			obj.display(value);
			Method met=c.getMethod("add", Integer.class);
			int a1=(int) met.invoke(obj, 10); System.out.println("Reflection :"+a);
			for(Method m: method) {
				System.out.println(m.getName());
				Parameter []p=m.getParameters();
				for(Parameter par:p) {
					System.out.print(par.getName()+"  "+par.getModifiers()+"  "+par.getAnnotatedType());
				}
			}
		
			
		}
		
		 Class<?> clazz = Java8Practice.class;
	        
	        // Access the static field 'value'
	        java.lang.reflect.Field field = clazz.getDeclaredField("value");

	        // Get the annotation on the field
	        MyAnnotation annotation = field.getAnnotation(MyAnnotation.class);
	        
	        // Print the value from the annotation
	        if (annotation != null) {
	            System.out.println("Annotation value: " + annotation.value());
	        }
	        
	        // Set the field value to the annotation's value
	        field.setAccessible(true); // Access private field
	        field.set(null, annotation.value());  // Set static field value
	        
	        // Print the value of the static field
	        System.out.println("Field value: " + value);
	        
	       for(Day d: Day.values()) {
	    	 
	    	   System.out.println(d);
	    	   add(d);
	    	   
	       }
		
	       //System.out.println();
    	   //System.out.print(Day.FRIDAY);
    	   //System.out.print(Day.valueOf("FRIDAY").ordinal());;
		
		
	}
	public static void add(Day... d) {
		System.out.println(d);
		
	}
	
	@Deprecated
	public int add(Integer a) {
		return a;
		
	}
	@MyAnnotation(value="Faizi")
	public void display(String s) {
		System.out.println("Annoation value:"+s);
		
	}

}
