package BEAKJOON.눈높이개발코딩테스트챌린지4기;

import java.util.Scanner;

public class 햄버거분배 {
    /*
    그리디란?
    -> 지금 당장 가질 수 있는 최고의 이익을 따라가는 알고리즘을 의미
    -> 모든 경우 최적해를 보장하진 못하지만 드물게 최적해를 결과로 내는 경우도 있다.
    -> 보통은 이전의 선택이 이후의 선택에 영향을 주지 않는 구조가 많다.

    /*
    [idea]
    1. 햄버거를 자기가 먹을 수 있는 최대로 앞으로 멀리 있는 햄버거를 먹어야 함
    2. 없다? 그럼 먹을 수 있는 범위에서 먹음
    3. 못 먹는다? => 다음 사람이 먹음
    4. 그렇게 해서 구하기
     */

    static int n;
    static int k;
    static String str;
    static boolean[] eaten;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();
        k = sc.nextInt();

        str = sc.next();
        eaten = new boolean[n];
        int answer = 0;

        for (int i = 0; i < n; i++) {
            for (int j = Math.max(0, i - k); j <= Math.min(n - 1, i + k); j++) {
                if (str.charAt(i) == 'P' && str.charAt(j) == 'H' && eaten[j] == false) {
                    eaten[j] = true;
                    answer++;
                    break;
                }
            }
        }

        System.out.println(answer);

    }
}
