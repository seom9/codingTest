package BEAKJOON.step.정렬;

import java.io.*;
import java.util.Arrays;
import java.util.Collections;

public class 소트인사이드 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String input = br.readLine();
        Character[] arr = new Character[input.length()];

        for (int i = 0; i < input.length(); i++) {
            arr[i] = input.charAt(i);
        }

        Arrays.sort(arr, Collections.reverseOrder());

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        for (char c : arr) {
            bw.write(c);
        }
        bw.flush();
    }
}
