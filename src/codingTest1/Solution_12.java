package codingTest1;

import java.util.Arrays;
import java.util.HashMap;


public class Solution_12 {
	/*
	얀에서는 매년 달리기 경주가 열립니다. 
	해설진들은 선수들이 자기 바로 앞의 선수를 추월할 때 추월한 선수의 이름을 부릅니다. 
	예를 들어 1등부터 3등까지 "mumu", "soe", "poe" 선수들이 순서대로 달리고 있을 때, 
	해설진이 "soe"선수를 불렀다면 2등인 "soe" 선수가 1등인 "mumu" 선수를 추월했다는 것입니다. 
	즉 "soe" 선수가 1등, "mumu" 선수가 2등으로 바뀝니다.
	
	선수들의 이름이 1등부터 현재 등수 순서대로 담긴 문자열 배열 players와 
	해설진이 부른 이름을 담은 문자열 배열 callings가 매개변수로 주어질 때, 
	경주가 끝났을 때 선수들의 이름을 1등부터 등수 순서대로 배열에 담아 return 하는 solution 함수를 완성해 주세요.
	*/

    public String[] solution(String[] players, String[] callings) {
    	HashMap<String, Integer> hm = new HashMap<>();
    	for (int i = 0; i < players.length; i++) {
    		hm.put(players[i], i);
    	}
    	
        for (String called : callings) {
            int i = hm.get(called);
            players[i] = players[i-1];
            players[i-1] = called;
            
            hm.put(players[i], i);
            hm.put(players[i-1], i-1);
        }
        
    	return players;
    }
    
    public static void main(String[] args) {
    	Solution_12 sol = new Solution_12();
    	String[] players = {"mumu", "soe", "poe", "kai", "mine"};
    	String[] callings = {"kai", "kai", "mine", "mine"};
    	String[] answer = sol.solution(players, callings);
    	System.out.println(Arrays.toString(answer));
    	
    }
    
    /*
     * 
    public String[] solution(String[] players, String[] callings) {
    	List<String> list = Arrays.asList(players);
    	for (int i = 0; i < callings.length; i++) {
    		int index = list.indexOf(callings[i]);
    		list.set(index, list.get(index-1));
    		list.set(index-1, callings[i]);
    	}
    	 int arrListSize = list.size();
    	players = list.toArray(new String[arrListSize]);
        return players;
    }
    
    처음엔 이렇게 풀었다. 그러나 이건 시간복잡도상 O(n) 이기 때문에 너무 오래 걸린다.
    찾아보니 HashMap 을 사용하는 것은 시간복잡도상 O(1) 이기 때문에 좋은 방법인 것 같아 
    hashMap 을 사용하기로 결정.
    
    이 문제를 풀면서 시간 복잡도에 대해 조금 감을 잡은 느낌.
    하지만 여ㅕㅕㅕ전히 어렵다아.
     */
}
