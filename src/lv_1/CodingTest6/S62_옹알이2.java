package lv_1.CodingTest6;

public class S62_옹알이2 {
	/*
	머쓱이는 태어난 지 11개월 된 조카를 돌보고 있습니다. 
	조카는 아직 "aya", "ye", "woo", "ma" 네 가지 발음과 네 가지 발음을 조합해서 
	만들 수 있는 발음밖에 하지 못하고 연속해서 같은 발음을 하는 것을 어려워합니다. 
	
	문자열 배열 babbling이 매개변수로 주어질 때, 
	머쓱이의 조카가 발음할 수 있는 단어의 개수를 return하도록 solution 함수를 완성해주세요.
	*/
	
	class Solution {
	    public int solution(String[] babbling) {
	        // 발음 가능 {"aya", "ye", "woo", "ma"}
	        // 연속해서 발음x 
	    	// 약간 어려움 일단 눈이 
	        int answer = 0; // babbling 중 발음 가능한 단어 개수
	        
	        for(int i=0; i<babbling.length; i++){
	            // 연속발음될 경우 예외처리 
	            if(babbling[i].contains("ayaaya") 
	               || babbling[i].contains("yeye") 
	               || babbling[i].contains("woowoo")
	               || babbling[i].contains("mama")){
	                continue;
	            }
	            
	            babbling[i] = babbling[i].replace("aya", " ");
	            babbling[i] = babbling[i].replace("ye", " ");
	            babbling[i] = babbling[i].replace("woo", " ");
	            babbling[i] = babbling[i].replace("ma", " ");
	            babbling[i] = babbling[i].replace(" ", "");

	            if(babbling[i].length()  == 0) answer++;
	        }
	        
	        return answer;
	    }
	}
}
