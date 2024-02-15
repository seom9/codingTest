package CodingTest4;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class S43_수박수박수박수박수박수 {
	/*
	길이가 n이고, "수박수박수박수...."와 같은 패턴을 유지하는 문자열을 리턴하는 함수, solution을 완성하세요. 
	예를들어 n이 4이면 "수박수박"을 리턴하고 3이라면 "수박수"를 리턴하면 됩니다.
	*/
	
    public String solution(int n) {
        String answer = "";
        for (int i = 0; i < n / 2; i++) {
        	answer += "수박";
        }
        if (n % 2 == 0) answer += "수";
        return answer;
    }
    
    public static String streamsolution(int n) {
        return IntStream.range(0, n / 2)
                .mapToObj(i -> "수박")
                .collect(Collectors.joining()) + (n % 2 == 0 ? "수" : "");
    }
}
