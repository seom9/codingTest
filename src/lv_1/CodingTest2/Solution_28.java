package lv_1.CodingTest2;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Solution_28 {
    public long solution(long n) {
    	long answer = 0;
    	long co = 1;
        String[] array = String.valueOf(n).split("");
        Arrays.sort(array);
        
        for (String i : array) {
        	answer += (long) Integer.parseInt(i) * co;
        	co *= 10;
        }
        return answer;
        
    }
}
