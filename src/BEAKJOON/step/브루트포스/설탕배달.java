package BEAKJOON.step.브루트포스;

import java.util.Scanner;

public class 설탕배달 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int sugar = sc.nextInt();

        int count = Integer.MAX_VALUE;

        for (int i = 0; i <= sugar/3; i++) {

            if ((sugar - i*3)%5 == 0) {
                int fiveKg = (sugar - i*3)/5;
                count = Math.min(count, fiveKg + i);
            }
        }

        if (count == Integer.MAX_VALUE) System.out.println(-1);
        else System.out.println(count);

    }
}
