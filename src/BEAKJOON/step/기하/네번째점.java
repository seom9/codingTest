package BEAKJOON.step.기하;

import java.util.HashMap;
import java.util.Scanner;

public class 네번째점 {

    /*
    문제
    세 점이 주어졌을 때, 축에 평행한 직사각형을 만들기 위해서 필요한 네 번째 점을 찾는 프로그램을 작성하시오.

    입력
    세 점의 좌표가 한 줄에 하나씩 주어진다. 좌표는 1보다 크거나 같고, 1000보다 작거나 같은 정수이다.

    출력
    직사각형의 네 번째 점의 좌표를 출력한다.
     */

    /*
    [idea]
    1. hashmap 에 넣어서 %2 해서 나머지가 0보다 크면

     */

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] num = new int[6];
        HashMap<Integer, Integer> Xmap = new HashMap<>();
        HashMap<Integer, Integer> Ymap = new HashMap<>();

        for (int i = 0; i < 6; i++) {
            num[i] = sc.nextInt();
        }

        for (int i = 0; i < 3; i++) {
            if (Xmap.containsKey(num[i*2])) {
                Xmap.put(num[i*2], Xmap.get(num[i*2]) + 1);
            } else {
                Xmap.put(num[i*2], 1);
            }

            if (Ymap.containsKey(num[(2*i)+1])) {
                Ymap.put(num[(2*i)+1], Ymap.get(num[(2*i)+1]) + 1);
            } else {
                Ymap.put(num[(2*i)+1], 1);
            }
        }

        for (int hi : Xmap.keySet()) {
            if (Xmap.get(hi) % 2 == 1) {
                System.out.print(hi + " ");
            }
        }

        for (int hi : Ymap.keySet()) {
            if (Ymap.get(hi) % 2 == 1) {
                System.out.print(hi);
            }
        }
    }

}
