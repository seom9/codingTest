package BEAKJOON.눈높이개발코딩테스트챌린지4기;

import java.util.Scanner;

public class 두스티커 {
    /*
    크기가 H×W인 모눈종이와 스티커 N개가 있다. i번째 스티커의 크기는 Ri×Ci이다.
    모눈종이는 크기가 1×1인 칸으로 나누어져 있으며, 간격 1을 두고 선이 그어져 있다.

    오늘은 모눈종이에 스티커 2개를 붙이려고 한다. 스티커의 변은 격자의 선과 일치하게 붙여야 하고, 두 스티커가 서로 겹치면 안 된다.
    단, 스티커가 접하는 것은 가능하다. 스티커를 90도 회전시키는 것은 가능하다. 스티커가 모눈종이를 벗어나는 것은 불가능하다.

    두 스티커가 붙여진 넓이의 최댓값을 구해보자.

     */

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 모눈종이의 크기와 스티커 개수 입력받기
        int H = sc.nextInt();
        int W = sc.nextInt();
        int N = sc.nextInt();

        // 스티커 크기를 저장할 배열
        int[][] stickers = new int[N][2];
        for (int i = 0; i < N; i++) {
            stickers[i][0] = sc.nextInt(); // 스티커의 행 크기 (Ri)
            stickers[i][1] = sc.nextInt(); // 스티커의 열 크기 (Ci)
        }

        int maxArea = 0; // 최댓값을 저장할 변수

        // 두 개의 스티커를 선택
        for (int i = 0; i < N; i++) {
            for (int j = i + 1; j < N; j++) {
                // 스티커 i와 스티커 j의 4가지 배치 경우의 수 계산 (각각 회전 포함)
                maxArea = Math.max(maxArea, getMaxArea(stickers[i], stickers[j], H, W));
            }
        }

        // 결과 출력
        System.out.println(maxArea);
    }

    // 두 스티커의 배치 가능한 최대 넓이를 계산하는 함수
    public static int getMaxArea(int[] sticker1, int[] sticker2, int H, int W) {
        int maxArea = 0;

        // 스티커의 모든 회전 경우를 고려 (회전하지 않은 상태, 90도 회전한 상태)
        int[][] sticker1Rotations = {sticker1, new int[]{sticker1[1], sticker1[0]}};
        int[][] sticker2Rotations = {sticker2, new int[]{sticker2[1], sticker2[0]}};

        // 첫 번째 스티커와 두 번째 스티커의 모든 경우에 대해 확인
        for (int[] s1 : sticker1Rotations) {
            for (int[] s2 : sticker2Rotations) {
                // 가로로 나란히 배치 가능한지 확인
                if (s1[0] <= H && s2[0] <= H && s1[1] + s2[1] <= W) {
                    maxArea = Math.max(maxArea, s1[0] * s1[1] + s2[0] * s2[1]);
                }
                // 세로로 나란히 배치 가능한지 확인
                if (s1[1] <= W && s2[1] <= W && s1[0] + s2[0] <= H) {
                    maxArea = Math.max(maxArea, s1[0] * s1[1] + s2[0] * s2[1]);
                }
            }
        }

        return maxArea;
    }



}
