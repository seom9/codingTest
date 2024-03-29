package lv_1.CodingTest6;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.List;

public class S67_케이크먹기 {
    public static void main(String[] args) throws Exception {
    	
    	// 코드 설계
    	// 

    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    	String[] goorm = br.readLine().split(" ");
    	int n = Integer.parseInt(goorm[0]);
        int k = Integer.parseInt(goorm[1]);
        
        List<Integer> cake = new LinkedList<>();
        
        for (int i = 1; i <= n; i++) {
            cake.add(i);
        }

        
        int idx = 0; 
        while (cake.size() > 2) {
            if (idx > cake.size() - 1) {
            	idx = idx - cake.size(); 
            }
            cake.remove(idx);
            idx += k-1;
        }

        for (int piece : cake) {
            System.out.print(piece + " ");
        }
    }

	
}
