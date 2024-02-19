package lv_1.CodingTest4;

public class S41_내적 {
	/*
	길이가 같은 두 1차원 정수 배열 a, b가 매개변수로 주어집니다. 
	a와 b의 내적을 return 하도록 solution 함수를 완성해주세요.
	
	이때, a와 b의 내적은 a[0]*b[0] + a[1]*b[1] + ... + a[n-1]*b[n-1] 입니다. (n은 a, b의 길이)
	 */
	
    public int solution(int[] a, int[] b) {
    	int answer = 0;
        for (int i = 0; i < a.length; i++) {
        	answer += a[i]*b[i];
        }
        return answer;
    }
    
    // 스트림 함수를 이용한 풀이와 해당 풀이에 대한 설명
    // 정리 : https://velog.io/@seoul788/CodingTest-Stream-%ED%95%A8%EC%88%98-%EA%B8%B0%EC%B4%88 
    public int solution1(int[] a, int[] b) {
    	int answer = 0;
        for (int i = 0; i < a.length; i++) {
        	answer += a[i]*b[i];
        }
        return answer;
    }
}
