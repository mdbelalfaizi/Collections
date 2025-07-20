package TestPreparation;

public class GenericClass<X>{
	
	private X firstName;
	private String lastname;
	private Integer age;
	
	public GenericClass(X firstName, String lastname, Integer age) {
		super();
		this.firstName = firstName;
		this.lastname = lastname;
		this.age = age;
	}
	public X getFirstName() {
		return firstName;
	}
	public void setFirstName(X firstName) {
		this.firstName = firstName;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	
	

}
