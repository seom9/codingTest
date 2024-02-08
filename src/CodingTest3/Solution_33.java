package CodingTest3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Solution_33 {
	/*
	고객의 약관 동의를 얻어서 수집된 1~n번으로 분류되는 개인정보 n개가 있습니다. 
	약관 종류는 여러 가지 있으며 각 약관마다 개인정보 보관 유효기간이 정해져 있습니다. 
	당신은 각 개인정보가 어떤 약관으로 수집됐는지 알고 있습니다. 수집된 개인정보는 유효기간 전까지만 보관 가능하며, 
	유효기간이 지났다면 반드시 파기해야 합니다.

	예를 들어, A라는 약관의 유효기간이 12 달이고, 2021년 1월 5일에 수집된 개인정보가 A약관으로 수집되었다면 
	해당 개인정보는 2022년 1월 4일까지 보관 가능하며 2022년 1월 5일부터 파기해야 할 개인정보입니다.
	당신은 오늘 날짜로 파기해야 할 개인정보 번호들을 구하려 합니다.

	모든 달은 28일까지 있다고 가정합니다.

	다음은 오늘 날짜가 2022.05.19일 때의 예시입니다.

	약관 종류	유효기간
	A		6 달
	B		12 달
	C		3 달
	번호	개인정보 수집 일자	약관 종류
	1	2021.05.02		A
	2	2021.07.01		B
	3	2022.02.19		C
	4	2022.02.20		C
	첫 번째 개인정보는 A약관에 의해 2021년 11월 1일까지 보관 가능하며, 유효기간이 지났으므로 파기해야 할 개인정보입니다.
	두 번째 개인정보는 B약관에 의해 2022년 6월 28일까지 보관 가능하며, 유효기간이 지나지 않았으므로 아직 보관 가능합니다.
	세 번째 개인정보는 C약관에 의해 2022년 5월 18일까지 보관 가능하며, 유효기간이 지났으므로 파기해야 할 개인정보입니다.
	네 번째 개인정보는 C약관에 의해 2022년 5월 19일까지 보관 가능하며, 유효기간이 지나지 않았으므로 아직 보관 가능합니다.
	따라서 파기해야 할 개인정보 번호는 [1, 3]입니다.

	오늘 날짜를 의미하는 문자열 today, 약관의 유효기간을 담은 1차원 문자열 배열 terms와 
	수집된 개인정보의 정보를 담은 1차원 문자열 배열 privacies가 매개변수로 주어집니다. 
	이때 파기해야 할 개인정보의 번호를 오름차순으로 1차원 정수 배열에 담아 return 하도록 solution 함수를 완성해 주세요.
	*/
	
	private int[] privacy(String ter, int mon) {
		String[] hi = ter.split("\\.");
		
		int[] hi2 = new int[3];
		
		hi2[2] = Integer.parseInt(hi[2]);
		hi2[1] = (Integer.parseInt(hi[1]) + mon) % 12;
		hi2[0] = Integer.parseInt(hi[0]) + ((Integer.parseInt(hi[1]) + mon)/12);		
		
	    return hi2;
	}
	
    public int[] solution(String today, String[] terms, String[] privacies) {
        List<Integer> an = new ArrayList<>();
        
        // 1. term 바로 꺼내 쓸 수 있게 hashMap 으로 넣어 주기
        HashMap<String, Integer> term = new HashMap<>();
        for (String i : terms) {
        	String[] hi = i.split(" ");
        	term.put(hi[0], Integer.parseInt(hi[1]));
        }
       
        // 2. privacies 에 약관 날짜 더해서 today보다 더 간다? false
        // 3. today 랑 비교해 주는 과정이 없음
        for (int i = 0; i < privacies.length; i++) {
        	String[] hi = privacies[i].split(" ");
        	int[] hi2 = privacy(hi[0], term.get(hi[1]));
        	String[] to = today.split(".");
        	for (int j = 0; j < 3; j++) {
            	if (Integer.parseInt(to[j]) > hi2[j]) {
            		an.add(i); 
            		break;
            	} else if (Integer.parseInt(to[j]) < hi2[j]) {
            		break;
            	}
        	}
        }
    	
    	return an.stream().mapToInt(Integer::intValue).toArray();
    }
}
