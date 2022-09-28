package day15;

public class Customer {
	String id;
	String pw;

	public Customer() {
	}

	public Customer(String id, String pw) {
		this.id = id;
		this.pw = pw;
	}

	public String getInfo() {
		return id + "/ " + pw;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return id + "/ " + pw;
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
