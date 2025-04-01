package BEAKJOON.step.브루트포스;

import java.util.Scanner;

public class 영화감독숌 {
    public static void main(String[] args) {
        // 브루트 포스 알고리즘! 규칙이 없는 문제인 것이다.
        // 생각 방향은 1부터 늘려가면서 666 이 들어가는 숫자 중 가장 큰 것부터 쭉 늘리면 됨.
        Scanner sc = new Scanner(System.in);

        int n =  sc.nextInt(); // 입력값
        int count = 0;
        int number = 666;

        while (true) {
            if (String.valueOf(number).contains("666")) {
                count++;
                if (count == n) {
                    System.out.println(number);
                    break;
                }
            }
            number++;
        }

    }
}
