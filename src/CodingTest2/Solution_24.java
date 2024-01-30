package CodingTest2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Solution_24 {
	/*
	자연수 n을 뒤집어 각 자리 숫자를 원소로 가지는 배열 형태로 리턴해주세요. 
	예를 들어 n이 12345이면 [5,4,3,2,1]을 리턴합니다.
	 */
	
    private List<Integer> turnToList(long n){
        List<Integer> list = new ArrayList<>();
        while (n > 0) {
        	int x = (int)(n%10);
            n /= 10;
        	list.add(x);
        }
        return list;
    }
    
    public int[] solution(long n) {
        List<Integer> list = turnToList(n);
        int answer[] = list.stream().mapToInt(i -> i).toArray();
        
        return answer;
    }
}
