package lv_1.CodingTest6;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class S68_구슬게임 {
    public static void main(String[] args) throws Exception {

       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       
        int myBeads = 2;
        int opponentBeads = 2;
        int round = 3;
        int length = (int) Math.pow(3, round);
        int answer = 0;
       
       int[][][] dp = new int[length][length][2];
        dp[0][0][0] = myBeads;
        dp[0][0][1] = opponentBeads;
       
        for (int i = 1; i < length; i++) {
            for (int j = 0; j < (int) Math.pow(3, i); j++) {
            	if (dp[i-1][j/3][0] != -1 || dp[i-1][j/3][1] != -1) {
	               if (j % 3 == 0) { // 이김
	                   dp[i][j][0] = dp[i-1][j/3][0] + 1;
	                   dp[i][j][1] = dp[i-1][j/3][1] - 1;
	               } else if (j % 3 == 1) { // 무승부
	                   dp[i][j][0] = dp[i-1][j/3][0];
	                   dp[i][j][1] = dp[i-1][j/3][1];
	               } else if (j % 3 == 2) { // 짐
	                   dp[i][j][0] = dp[i-1][j/3][0] - 1;
	                   dp[i][j][1] = dp[i-1][j/3][1] + 1;
	               }
	               if (dp[i][j][0] == 0 || dp[i][j][1] == 0) {
	                  answer++;
	                  dp[i][j][0] = -1;
	                  dp[i][j][1] = -1;
	               }
            	}
           }
           round--;
           if (round == 0) {
              System.out.println(answer);
              break;
           }
        }
        if (round != 0) System.out.println(answer);
    }
}