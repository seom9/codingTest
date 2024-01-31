package CodingTest2;

public class Solution_27 {
	/*
	임의의 양의 정수 n에 대해, n이 어떤 양의 정수 x의 제곱인지 아닌지 판단하려 합니다.
	n이 양의 정수 x의 제곱이라면 x+1의 제곱을 리턴하고, n이 양의 정수 x의 제곱이 아니라면 -1을 리턴하는 함수를 완성하세요.
	*/
	
    public long solution(long n) {
        long answer = -1;
        double x = Math.sqrt(n);
        if (x % 1 == 0) return (long)Math.pow(x+1, 2);
        
        return answer;
    }
    
    // 이런 문제 푸는 거 의미 없다고 생각...
}
