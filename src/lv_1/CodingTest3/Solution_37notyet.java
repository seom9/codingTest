package lv_1.CodingTest3;

public class Solution_37notyet {
	/*
	크기가 작은 부분 문자열
	숫자로 이루어진 문자열 t와 p가 주어질 때, t에서 p와 길이가 같은 부분문자열 중에서, 
	이 부분문자열이 나타내는 수가 p가 나타내는 수보다 작거나 같은 것이 나오는 횟수를 return하는 함수 solution을 완성하세요.
	
	예를 들어, t="3141592"이고 p="271" 인 경우, t의 길이가 3인 부분 문자열은 314, 141, 415, 159, 592입니다. 
	이 문자열이 나타내는 수 중 271보다 작거나 같은 수는 141, 159 2개 입니다.
	*/
	
	 public int solution1(String t, String p) {
		 // str.substring(int beginIndex, int endIndex) 사용했는데 에러 뜸.
		 return 0;
	 }
	
	// 2번째 시도. 이래도 런타임 에러 남.
	// 시간 복잡도 더 줄일 수 있는 방법 생각해야 함.
    public int solution2(String t, String p) {
        int answer = 0;
        int tLeng = t.length();
        int pLeng = p.length();
        int pInt = Integer.parseInt(p);
        
        int[] hi = new int[tLeng - pLeng + 1];
        
        // subString 대신 사용해 보기
        for (int i = 0; i < hi.length; ++i) {
        	String str = "";
        	for (int j = i; j < i + pLeng; j++) {
        		str += t.charAt(i);
        	}
        	hi[i] = Integer.parseInt(str);
        }
        
        for (int i = 0; i < hi.length; ++i) {
        	if (hi[i] > pInt) answer++;
        }
        
        return answer;
    }
    
    // 이 방법도 런타임 에러 뜸... 그럼 대체 무슨 방법이 런타임 에러가 안 뜨는 걸까
    public int solution3(String t, String p) {
        int answer = 0;
        int tLeng = t.length();
        int pLeng = p.length();
        
        // subString 대신 사용해 보기
        for (int i = 0; i < tLeng-pLeng-1; ++i) {
        	for (int j = i; j < i + pLeng -1; j++) {
        		if (t.charAt(j) > p.charAt(j)) {
        			answer++;
        			break;
        		}else if (t.charAt(j) == p.charAt(j)) {
        			continue;
        		}else {
        			break;
        		}
        	}
        }
        
        return answer;
    }
    
    
    public int solution(String t, String p) {
    	int answer = 0;
        int pLeng=p.length();
        long intP = Long.parseLong(p);
        for(int i=0; i<t.length()-pLeng+1; i++){
            int intSubT=Integer.parseInt(t.substring(i, i+pLeng));
            if(intP>=intSubT) answer++;
        }
        return answer;
    }


}
