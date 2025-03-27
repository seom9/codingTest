package BEAKJOON.step.브루트포스;

import java.util.Scanner;

public class 수학은비대면강의입니다 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        int e = sc.nextInt();
        int f = sc.nextInt();

        int denominator = a * e - b * d;

        // 혹시라도 분모가 0이면 종료 (문제에선 절대 없음)
        if (denominator == 0) {
            return;
        }

        int x = (c * e - b * f) / denominator;
        int y = (a * f - c * d) / denominator;

        System.out.println(x + " " + y);
    }
}
