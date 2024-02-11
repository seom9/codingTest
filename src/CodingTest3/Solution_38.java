package CodingTest3;

import java.util.Arrays;

public class Solution_38 {
	/* 없는 숫자 더하기
	0부터 9까지의 숫자 중 일부가 들어있는 정수 배열 numbers가 매개변수로 주어집니다. 
	numbers에서 찾을 수 없는 0부터 9까지의 숫자를 모두 찾아 더한 수를 return 하도록 solution 함수를 완성해주세요.
	 */
	
    public int solution(int[] numbers) {
        int answer = 0;
        int j = 0;
        
        Arrays.sort(numbers);
        
        for (int i = 0; i < 9; i++) {
        	if (numbers[j] == i) {
        		j++;
        		if (j > numbers.length) break;
        	}else {
        		answer += i;
        	}
        }
        
        return answer;
    }
}
