package BEAKJOON.step.브루트포스;

import java.util.Scanner;

public class 블랙잭 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        int num[] = new int[n];
        int ans = 0;

        for (int i = 0; i < n; i++) {
            num[i] = sc.nextInt();
        }

        // 완전탐색
        for (int i = 0; i < n; i++) {
            for (int j = i+1; j < n; j++) {
                for (int k = j+1; k < n; k++) {
                    if (num[i] + num[j] + num[k] <= m && num[i] + num[j] + num[k] > ans) {
                        ans = num[i] + num[j] + num[k];
                    }
                }
            }
        }

        System.out.println(ans);

    }
}

/*
왜 완전 탐색일까?
> 완전탐색, 브루트포스가 더 자연스럽고 효율적인 이유

 - 조합 수가 작고, 모든 조합의 수를 계산해 봤을 때 161700 개이므로 0.1초도 안 걸리는 수준
 - 시간 복잡도는 O(n^3) 이니까 널널함

 - 또한 구조가 단순함.

 */