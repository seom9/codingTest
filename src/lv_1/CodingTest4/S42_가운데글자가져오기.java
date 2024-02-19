package lv_1.CodingTest4;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class S42_가운데글자가져오기 {
	/*
	단어 s의 가운데 글자를 반환하는 함수, solution을 만들어 보세요. 
	단어의 길이가 짝수라면 가운데 두글자를 반환하면 됩니다.
	*/
	
	// 스트림 함수 공부 중...
	
	private String even(int num, String[] str) {
	    String answer = IntStream.range(0, str.length)
	                             .filter(i -> i == num || i == num - 1)
	                             .mapToObj(i -> str[i])
	                             .collect(Collectors.joining(""));
	    return answer;
	}
	
	private String odd(int num, String[] str) {
	    String answer = IntStream.range(0, str.length)
                .filter(i -> i == num)
                .mapToObj(i -> str[i])
                .collect(Collectors.joining(""));
	    return answer;
	}
	

	public String solution(String s) {
		String[] str = s.split(""); 
        String answer = (s.length() % 2 == 0) ? even(s.length() / 2, str) : odd(s.length() / 2, str);
        return answer;
    }
}
