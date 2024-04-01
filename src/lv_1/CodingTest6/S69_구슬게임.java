package lv_1.CodingTest6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
public class S69_구슬게임 {
	
	public static int answer = 0;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken()); // 구름이
        int m = Integer.parseInt(st.nextToken()); // 상대방
        int k = Integer.parseInt(st.nextToken()); // 게임 수

        bfs(n, m, k);
        
        System.out.println(answer);
        
    }

    public static void bfs(int n, int m, int k) {

        // 둘 중 한명이 끝나거나, 게임 수가 없을때
        if (n == 0 || m == 0 || k == 0) {
            // 게임이 종료됐는데 둘 중 한명이
            if (n == 0 || m == 0) {
                answer++;
            }
            return;
        }

        // 무승부인 경우
        bfs(n, m, k - 1);

        // 구름이가 이기는 경우
        bfs(n - 1, m + 1, k - 1);

        // 상대방이 이기는 경우
        bfs(n + 1, m - 1, k - 1);
    }
}