package codingTest1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution_6 {
    public int[] solution(String my_string) {
    	// 문자열 my_string이 매개변수로 주어질 때, 
    	// my_string 안에 있는 숫자만 골라 오름차순 정렬한 리스트를 return 하도록 solution 함수를 작성해보세요.
    	List<Integer> answer = new ArrayList<>();
        for (int i = 0; i < my_string.length(); i++) {
        	String c = Character.toString(my_string.charAt(i));
        	boolean result = c.matches("[0-9]+");
        	if (result) {
        		answer.add(Integer.parseInt(c));
        	}
        }
        
        int arrListSize = answer.size();        
        int[] answer2 = new int[arrListSize];
        
        for (int i = 0; i < answer.size(); i++) {
        	answer2[i] = answer.get(i); 
        	System.out.println(answer.get(i));
        }
        Arrays.sort(answer2);
        
        return answer2;
    }
    
    public int[] solution2(String my_string) {
    	// 코딩은 이런 거라는 걸 깨달음...

        my_string = my_string.replaceAll("[a-z]","");

        int[] answer = new int[my_string.length()];

        for(int i =0; i<my_string.length(); i++){
            answer[i] = my_string.charAt(i) - '0';
        }
        
        // Java에서 char 타입은 실제로 정수 값을 가지고 있으며, 
        // 이 값은 유니코드 표에 정의된 문자의 코드값을 나타냅니다. 
        //  들어, 문자 '0'의 유니코드 값은 48이고, '1'은 49, '2'는 50 등입니다.

        // 따라서, 문자열에서 특정 문자를 가져올 때 (my_string.charAt(i)), 
        // 이는 실제로 해당 문자의 유니코드 정수 값을 가져오는 것입니다. 
        // 만약 이 문자가 숫자라면, 이 숫자 문자의 유니코드 값에서 '0'의 유니코드 값을 빼면 실제 숫자 값을 얻을 수 있습니다.

        Arrays.sort(answer);

        return answer;
    }

    
    public static void main(String args[]) {
    	String my_string = "hi12392";
    	Solution_6 sol = new Solution_6();
    	System.out.println(Arrays.toString(sol.solution(my_string)));
    }
}
