package lv_1.CodingTest6;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.List;

public class S65_물탱크설치하기 {
    public static void main(String[] args) throws Exception {
    	
    	// 모든 수로는 단방향 수로이며, 물이 나가는 수로는 여러 개 설치 가능하지만 물이 들어오는 수로는 1개만 설치할 수 있으므로
    	// LinkedList collection 을 사용해 물이 나가는 수로만을 노드로 연결했습니다.
    	
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int num = Integer.parseInt(br.readLine());
        List<String> list = new LinkedList<>();
        
        for (int i = 0; i < num - 1; i++) {
        	String[] split = br.readLine().split(" ");
        	
        	if (list.size() > 0 && !list.contains(split[0])) {
        		
        		// 만약 가진 숫자가 list 에 존재한다면 확인 후 사이에 넣어 주는 코드
        		if (list.contains(split[1])) {
        			int index = list.indexOf(split[1]);
        			list.add(index, split[0]);
        		}
        		
        	}else {
        		list.add(split[0]);
        	}
        }
        
        System.out.println(list.get(0));
    }
}
