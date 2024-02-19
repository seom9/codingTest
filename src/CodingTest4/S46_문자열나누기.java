package CodingTest4;

import java.util.HashMap;

public class S46_문자열나누기 {
	/*
	문자열 s가 입력되었을 때 다음 규칙을 따라서 이 문자열을 여러 문자열로 분해하려고 합니다.

	먼저 첫 글자를 읽습니다. 이 글자를 x라고 합시다.
	이제 이 문자열을 왼쪽에서 오른쪽으로 읽어나가면서, x와 x가 아닌 다른 글자들이 나온 횟수를 각각 셉니다. 
	처음으로 두 횟수가 같아지는 순간 멈추고, 지금까지 읽은 문자열을 분리합니다.
	s에서 분리한 문자열을 빼고 남은 부분에 대해서 이 과정을 반복합니다. 남은 부분이 없다면 종료합니다.
	만약 두 횟수가 다른 상태에서 더 이상 읽을 글자가 없다면, 역시 지금까지 읽은 문자열을 분리하고, 종료합니다.
	문자열 s가 매개변수로 주어질 때, 위 과정과 같이 문자열들로 분해하고, 분해한 문자열의 개수를 return 하는 함수 solution을 완성하세요.
	*/
	
    public int solution(String s) {
    	char index = 0;
        int answer = 0;
        
        HashMap<Character, Integer> hm = new HashMap<>();
        
        for (int i = 0; i < s.length(); i++) {
        	System.out.println(s.charAt(i));
        	if (hm.size() == 0) {
        		index = s.charAt(i);
        		hm.put(index, 1);
        		hm.put('1', 0);
        		answer++;
        		continue;
        	}
        	if (index == s.charAt(i)) {
        		hm.put(index, hm.get(index)+1);
        		System.out.println(hm.get(index));
        	}else {
        		hm.put('1', hm.get('1')+1);
        		if (hm.get('1') == hm.get(index)) {
        			hm.clear();
        		}
        	}
        }
        return answer;
    }
    
    public static void main(String[] args) {
    	S46_문자열나누기 s = new S46_문자열나누기();
    	int answer = s.solution("banana");
    	System.out.println(answer);
    }
    
    // HashMap 의 clear() remove() 
    // clear 는 전체 HashMap 이 삭제되는 것이고, remove() 는 key-value 한 쌍을 삭제하는 것이다. 
}
