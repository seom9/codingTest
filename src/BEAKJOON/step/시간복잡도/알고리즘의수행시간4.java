package BEAKJOON.step.시간복잡도;

import java.util.Scanner;

public class 알고리즘의수행시간4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong(); // 입력을 long으로 받기!

        // 공식 사용: n(n-1)/2
        System.out.println((n * (n - 1)) / 2);
        System.out.println(2);
    }
}
