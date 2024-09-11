package BEAKJOON.눈높이개발코딩테스트챌린지4기;

import java.util.Scanner;

public class 부분수열의합 {

    /*
    N개의 정수로 이루어진 수열이 있을 때, 크기가 양수인 부분수열 중에서
    그 수열의 원소를 다 더한 값이 S가 되는 경우의 수를 구하는 프로그램을 작성하시오.

    첫째 줄에 정수의 개수를 나타내는 N과 정수 S가 주어진다.
    (1 ≤ N ≤ 20, |S| ≤ 1,000,000) 둘째 줄에 N개의 정수가 빈 칸을 사이에 두고 주어진다.
    주어지는 정수의 절댓값은 100,000을 넘지 않는다.
     */

    /*
    [idea]
    1. 트리구조로 해결
    
    [틀린 이유]
    1. static 값을 밑에서 또 선언해서
    2. tree 구조로 풀면 쉬울 걸 백트래킹으로 돌아가려고 했다
     */

    static int[] num;
    private static int N;
    private static int S;
    private static int answer = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 수열의 크기와 정수 S 받기
        N = sc.nextInt();
        S = sc.nextInt();

        num = new int[N];

        for (int i = 0; i < N; i++) {
            num[i] = sc.nextInt();
        }

        dfs(0, 0);
        if (S == 0) System.out.println(answer - 1);
        else  System.out.println(answer);
    }

    private static void dfs(int depth, int sum) {
        if (depth == N) {
            if (sum == S) answer++;
            return;
        }
        
        // tree 구조
        dfs(depth + 1, sum + num[depth]);
        dfs(depth + 1, sum);
    }
}
