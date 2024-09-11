package BEAKJOON.눈높이개발코딩테스트챌린지4기;

import java.io.*;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class 숫자판점프 {
    /*
    5×5 크기의 숫자판이 있다. 각각의 칸에는 숫자(digit, 0부터 9까지)가 적혀 있다.
    이 숫자판의 임의의 위치에서 시작해서, 인접해 있는 네 방향으로 다섯 번 이동하면서,
    각 칸에 적혀있는 숫자를 차례로 붙이면 6자리의 수가 된다.
    이동을 할 때에는 한 번 거쳤던 칸을 다시 거쳐도 되며, 0으로 시작하는 000123과 같은 수로 만들 수 있다.

    숫자판이 주어졌을 때, 만들 수 있는 서로 다른 여섯 자리의 수들의 개수를 구하는 프로그램을 작성하시오.
     */


    static int[][] map;
    static Set<String> result;
    static int[] selected;

    static int[] dr = {-1, 1, 0, 0};
    static int[] dc = {0, 0, -1, 1};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        map = new int[5][5];
        result = new HashSet<>();
        selected = new int[6];

        for (int i=0; i<5; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            for(int j=0; j<5; j++) {
                int value = Integer.parseInt(st.nextToken());
                map[i][j] = value;
            }
        }

        for (int i=0; i<5; i++) {
            for(int j=0; j<5; j++) {
                dfs(0, i, j);
            }
        }
        bw.write(result.size() + "");
        bw.flush();
        bw.close();
        br.close();
    }

    static void dfs(int depth, int r, int c) {
        if(depth==6) {
            StringBuilder sb = new StringBuilder();
            for(int i=0; i<6; i++) {
                sb.append(selected[i]);
            }
            result.add(sb.toString());
            return;
        }

        for(int d=0; d<4; d++) {
            int nr = r + dr[d];
            int nc = c + dc[d];

            if(isValidPosition(nr, nc)) {
                selected[depth] = map[nr][nc];
                dfs(depth+1, nr, nc);
            }
        }
    }

    static boolean isValidPosition(int r, int c) {
        return 0<=r && r<5 && 0<=c && c<5;
    }


}
