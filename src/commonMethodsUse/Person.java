package commonMethodsUse;

import java.util.Comparator;

public class Person implements Comparable<Person>{
   
	private String name;
	private int data;
	private double age;
	public Person(String name, int data, double age) {
		super();
		this.name = name;
		this.data = data;
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getData() {
		return data;
	}
	public void setData(int data) {
		this.data = data;
	}
	public double getAge() {
		return age;
	}
	public void setAge(double age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", data=" + data + ", age=" + age + "]";
	}

	
	  @Override 
	  public int compareTo(Person o1) { return
	  name.compareTo(o1.getName()); }
	 
/*	@Override
	public int compare(Person o1, Person o2) {
		if(o1.age==o2.age)
			return 0;
		else if(o1.age>o2.age)
			return 1;
		else
			return -1;
	}*/
	
}
