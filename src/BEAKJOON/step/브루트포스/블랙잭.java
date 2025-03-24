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
