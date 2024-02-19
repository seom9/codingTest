package lv_1.codingTest1;

public class Solution_4 {
    public int solution(int n) {
        int i = 1;
        int co = 1;
        while (true){
        	co *= i;
            if (n < co) return i-1;
            if (n == co) return i;
            i++;
        }
    }
    
    public static void main(String[] args) {
    	Solution_4 sol = new Solution_4();
    	System.out.println(sol.solution(3628800));
    	System.out.println(sol.solution(7));
    }
}
