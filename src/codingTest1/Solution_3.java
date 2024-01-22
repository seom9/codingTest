package codingTest1;

import java.util.Arrays;

public class Solution_3 {
    public int solution(int[] numbers) {
    	// 정수 배열 numbers가 매개변수로 주어집니다. 
    	// numbers의 원소 중 두 개를 곱해 만들 수 있는 최댓값을 return하도록 solution 함수를 완성해주세요.
        Arrays.sort(numbers);
        
        return numbers[numbers.length-2] * numbers[numbers.length-1];
    }
    
    public static void main(String[] args) {
    	Solution_3 sol = new Solution_3();

    }
}
