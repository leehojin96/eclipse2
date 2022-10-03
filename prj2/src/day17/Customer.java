package day17;


public class Customer  implements MyComparable{
	 int age;
	 String name;
	
	 
	public Customer() {
		// TODO Auto-generated constructor stub
	}
	 
	public Customer(int age, String name) {		 
		this.age = age;
		this.name = name;
	}

	

	@Override
	public String toString() {
		return "Customer [age=" + age + ", name=" + name + "]";
	}

	@Override
	public int compareTo(Object o) {
		
		Customer c = (Customer)o;
		return this.age -c.age ;
	}	 
	 
	 

}
