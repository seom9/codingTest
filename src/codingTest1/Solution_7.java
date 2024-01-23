package codingTest1;

public class Solution_7 {
    public int solution(String my_string) {
    	// 문자열 my_string이 매개변수로 주어집니다. 
    	// my_string안의 모든 자연수들의 합을 return하도록 solution 함수를 완성해주세요.
        int answer = 0;
        
        my_string = my_string.replaceAll("[^0-9]", "");
        System.out.println(my_string);
        
        for (int i = 0; i < my_string.length(); i++) {
        	answer += my_string.charAt(i) - '0';
        }
        
        return answer;
    }
    
    public static void main(String args[]) {
    	Solution_7 sol = new Solution_7();
    	String my_string = "aAb1B2cC34oOp";
    	System.out.println(sol.solution(my_string));
    }
}
