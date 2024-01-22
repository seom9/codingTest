package codingTest1;

public class Solution_2 {
	// 약수의 개수가 세 개 이상인 수를 합성수라고 합니다. 
	// 자연수 n이 매개변수로 주어질 때 n이하의 합성수의 개수를 return하도록 solution 함수를 완성해 주세요.
    public int solution(int n) {
        int answer = 0;
        
        
        for (int i = 3; i <= n; i++) {
        	if (i % 2 == 0) {
        		answer++;
        	}else {
        		// 약수의 개수가 3개 이상인 수 구분
            	int root = (int)Math.sqrt(i);
            	for (int j = 3; j <= root; j++) {
            		if (i % j == 0) {
            			answer++;
            			break;
            		}
            	}
        	}
        }
      
        return answer;
        
    }
    
    public static void main(String[] args) {
    	Solution_2 sol = new Solution_2();
    	System.out.println(sol.solution(10));
    	System.out.println(sol.solution(15));
    }
    
}
