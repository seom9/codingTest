package BEAKJOON.step.기하;

import java.util.Arrays;
import java.util.Scanner;

public class 세막대 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        int y = sc.nextInt();
        int z = sc.nextInt();

        int[] arr = {x, y, z};

        Arrays.sort(arr);

        while (arr[0] + arr[1] <= arr[2]) {
            arr[2]--;
        }
        System.out.println(arr[0] + arr[1] + arr[2]);

    }
}
