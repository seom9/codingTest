package BEAKJOON.step.정렬;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 수정렬하기 {
    public static void main(String[] args) throws IOException {
        // d
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int line = Integer.parseInt(br.readLine());
        int[] arr = new int[line];

        for (int i = 0; i < line; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        // 삽입 정렬
        // - 이유 : 1000보다 작음
        // - 오랜만에 삽입 정렬 연습

        // 삽입 정렬 시작
        for (int i = 1; i < line; i++) {
            int key = arr[i];     // 현재 삽입할 값
            int j = i - 1;

            // 왼쪽부터 key보다 큰 값을 한 칸씩 뒤로 밀기
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }

            // 적절한 위치에 key 삽입
            arr[j + 1] = key;
        }

        // 출력
        for (int i = 0; i < line; i++) {
            System.out.println(arr[i]);
        }
    }
}
