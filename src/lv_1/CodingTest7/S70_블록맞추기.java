package lv_1.CodingTest7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class S70_블록맞추기 {
	
	// dfs 재구
	
	public static int answer = 0;
    
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	String[] goorm = br.readLine().split(" ");
    	
    	int a = Integer.parseInt(goorm[0]);
        int b = Integer.parseInt(goorm[1]);
        
        int dp[][] = new int[a][b];

        // DFS 호출
        dfs(dp, 0, 0);

        // 결과 출력
        System.out.println(answer);
    }

    public static void dfs(int[][] dp, int x, int y) {
    	int a = -1;
    	int b = -1;

    	Loop1 :
    	for (int i = 0; i < dp.length; i++) {
    		for (int j = 0; j < dp[0].length; j++) {
    			if (dp[i][j] == 0) {
    				a = i;
    				b = j;    				
    				break Loop1;
    			}
    		}
    	}
    	
		if (a + x > dp.length || b + y > dp[0].length) {
			// 넘쳐요
			return;
		}

    	if (x != 0) {
        	if (a == -1 || b == -1) {
        		// 꽉 참
        		answer++;
        		return;
        	}
    	}

    	for (int i = a; i < a + x; i++) {
    		for (int j = b; j < b + y; j++) {
    			if (dp[i][j] == 1) {
    				System.out.println("리턴 햇음");
    				return;
    			} else {
    				dp[i][j] = 1;
    				System.out.println("칠함");
    			}
    		}
    	}

    	
        // 1X1 확인
        dfs(dp, 1, 1); 
        
        // 2X2
        dfs(dp, 2, 2);
        
        // 4X2
        dfs(dp, 4, 2);
        
        // 4X4
        dfs(dp, 4, 4);
    }
}
