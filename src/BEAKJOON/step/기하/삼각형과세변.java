package BEAKJOON.step.기하;

import java.util.Arrays;
import java.util.Scanner;

public class 삼각형과세변 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            int z = sc.nextInt();

            // 세 변이 모두 0이면 종료
            if (x == 0 && y == 0 && z == 0) {
                break;
            }

            String answer;

            int tra[] = {x, y, z};

            Arrays.sort(tra); // 오름차순 정렬

            // 삼각형이 될 수 없는 경우
            if (tra[0] == 0 || tra[0] + tra[1] <= tra[2]) {
                answer = "Invalid";
            } else {
                if (tra[0] == tra[1] && tra[1] == tra[2]) {
                    answer = "Equilateral";
                } else if (tra[0] == tra[1] || tra[1] == tra[2] || tra[0] == tra[2]) {
                    answer = "Isosceles";
                } else {
                    answer = "Scalene";
                }
            }

            System.out.println(answer);
        }
    }

}