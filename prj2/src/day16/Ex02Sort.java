package day16;


public class Ex02Sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] strs = {"spring","summer","fall","winter"};
		
		//정렬
		
		for(int i = 0 ; i < strs.length ; i++) {
			for(int j = i+1 ; j< strs.length ; j++) {
				//반환정보 0 양수 : 기준이 큰경우(사전상 뒤에위치) 음수 :작다(사전상 앞에)
				
				if(strs[i].compareTo(strs[j])>0) {
					String tmp = strs[i];
					strs[i] = strs[j];
					strs[j] = tmp;
				}
			}
		}
		
		
		for(int i = 0 ; i < strs.length ; i++) {
			System.out.println(strs[i]);
		}
		
	}

}
