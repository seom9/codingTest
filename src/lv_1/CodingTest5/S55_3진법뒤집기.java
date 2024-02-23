package lv_1.CodingTest5;

public class S55_3진법뒤집기 {
	/*
	자연수 n이 매개변수로 주어집니다. 
	n을 3진법 상에서 앞뒤로 뒤집은 후, 이를 다시 10진법으로 표현한 수를 return 하도록 solution 함수를 완성해주세요.
	 */
	
    public int solution(int n) {
        int answer = 0;
        
        String three = Integer.toString(n, 3);
        StringBuilder stringBuilder = new StringBuilder();
        
        // new StringBuilder(a).reverse().toString();
        // 이런 방법도 있음
        for (int i = 0; i < three.length(); i++) {
        	stringBuilder.append(three.charAt(i));
        }
        
        return Integer.parseInt(stringBuilder.toString(),3);
    }
    
}
