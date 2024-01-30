package CodingTest2;

public class Solution_25 {
	/*
	정수를 담고 있는 배열 arr의 평균값을 return하는 함수, solution을 완성해보세요.
	 */
    public double solution(int[] arr) {
        double answer = 0;
        for(int i : arr) {
        	answer += (double)i;
        }
        return answer/arr.length;
    }
}
