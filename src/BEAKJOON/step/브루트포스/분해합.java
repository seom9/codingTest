package BEAKJOON.step.브루트포스;

import java.util.Scanner;

public class 분해합 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int sang = 0;
        int answer = 0;

        for (int i = 1; i < n; i++) {
            int temp = i;
            int sum = i;

            while (temp > 0) {
                sum += temp % 10;
                temp /= 10;
            }

            if (sum == n) {
                answer = i;
                break;
            }
        }

        System.out.print(answer);
    }
}
