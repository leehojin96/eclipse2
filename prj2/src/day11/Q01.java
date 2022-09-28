package day11;

//1.주문정보는 다음과 같다. 

//주문정보를 담을 수 있는 클래스를 작성하고
//다음과 같이 출력될 수 있도록  프로그램을 작성하시오
//
//주문번호 : 20220519001
//주문자아이디: abc123
//주문날짜 :2022년5월19일
//주문자이름:홍길순
//주문상품번호: PM0345-12
//배송주소: 서울시 중구 을지로 299
//

public class Q01 {

	private String orderNumber;
	private String userId;
	private String orderDay;
	private String userName;
	private String productNumber;
	private String userAddress;

	Q01() {

	}

	public void input(String orderNumber, String userId, String orderDay, String userName, String productNumber, String userAddress) {
		this.orderNumber = orderNumber;
		this.userId = userId;
		this.orderDay = orderDay;
		this.userName = userName;
		this.productNumber = productNumber;
		this.userAddress = userAddress;
	}

	public void output() {
		System.out.println("주문 번호 : "+orderNumber);
		System.out.println("주문자아이디 : "+userId);
		System.out.println("주문날짜 : "+orderDay);
		System.out.println("주문자이름 : "+userName);
		System.out.println("주문상품번호 : "+productNumber);
		System.out.println("배송주소 : "+userAddress);
	}

}