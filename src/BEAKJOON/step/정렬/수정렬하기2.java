package BEAKJOON.step.정렬;

import java.io.*;
import java.util.Arrays;

public class 수정렬하기2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }
        Arrays.sort(arr);
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); // ← 변경

        for (int i : arr) {
            bw.write(i + "\n");
        }

        bw.flush();
    }


}
