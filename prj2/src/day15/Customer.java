package day15;

public class Customer {
	String id;
	String pw;

	
	public Customer() {
		// TODO Auto-generated constructor stub
	}

	public Customer(String id, String pw) {
		this.id = id;
		this.pw = pw;
	}


	public String getInfo() {
		return id + " / " + pw;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return id + " / " + pw;
	}
	
	@Override
	public boolean equals(Object obj) {
		
		if(obj instanceof Customer) {
			
		Customer c =(Customer)obj;
		if(this.id.equals(c.id) && this.pw.equals(c.pw))
		return true;
		else
		return false;
		}
		return false;
		
		
	}

//	@Override
//	public boolean equals(Object obj) {
//
//		Customer c = (Customer) obj;
////		if (obj instanceof Customer) {
////
////		}
//		if (this.id.equals(c.id) && this.pw.equals(c.pw)) {
//			return true;
//		} else {
//			return false;
//		}
//	}

}
