package BEAKJOON.step.브루트포스;

import java.util.Scanner;

public class 체스판다시칠하 {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);

        int height = sc.nextInt(); // ← 입력 순서: height 먼저
        int width = sc.nextInt();
        char[][] chess = new char[height][width]; // ← 배열 순서도 맞춰 줘야 해

        for (int i = 0; i < height; i++) {
            String line = sc.next(); // 한 줄씩 읽고
            for (int j = 0; j < width; j++) {
                chess[i][j] = line.charAt(j); // ← 공백 없이 입력됨
            }
        }

        int minPaint = Integer.MAX_VALUE; // 최소 칠해야 하는 수

        // 8x8 크기로 자르기
        for (int i = 0; i <= height - 8; i++) {
            for (int j = 0; j <= width - 8; j++) {
                int paintW = 0; // W로 시작하는 경우
                int paintB = 0; // B로 시작하는 경우

                for (int x = 0; x < 8; x++) {
                    for (int y = 0; y < 8; y++) {
                        // 체스판 규칙에 맞는 색상
                        char expectedW = ((x + y) % 2 == 0) ? 'W' : 'B';
                        char expectedB = ((x + y) % 2 == 0) ? 'B' : 'W';

                        if (chess[i + x][j + y] != expectedW) paintW++;
                        if (chess[i + x][j + y] != expectedB) paintB++;
                    }
                }

                minPaint = Math.min(minPaint, Math.min(paintW, paintB));
            }
        }

        System.out.println(minPaint); // 최솟값 출력
    }
}
