package BEAKJOON.step.정렬;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class 커트라인 {
    public static void main(String[] agrs) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");

        int num = Integer.parseInt(input[0]);
        int cut = Integer.parseInt(input[1]);

        int[] arr = new int[num];

        String[] scores = br.readLine().split(" ");

        for (int i = 0; i < num; i++) {
            arr[i] = Integer.parseInt(scores[i]);
        }

        Arrays.sort(arr);

        System.out.println(arr[num - cut]);
    }
}
