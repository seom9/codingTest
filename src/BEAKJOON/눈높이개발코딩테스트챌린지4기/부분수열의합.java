package BEAKJOON.눈높이개발코딩테스트챌린지4기;

import java.util.Scanner;

public class 부분수열의합 {

    /*
    N개의 정수로 이루어진 수열이 있을 때,
    크기가 양수인 부분수열 중에서 그 수열의 원소를 다 더한 값이 S가 되는
    경우의 수를 구하는 프로그램을 작성하시오.

    첫째 줄에 정수의 개수를 나타내는 N과 정수 S가 주어진다.
    (1 ≤ N ≤ 20, |S| ≤ 1,000,000) 둘째 줄에 N개의 정수가 빈 칸을 사이에 두고 주어진다.
    주어지는 정수의 절댓값은 100,000을 넘지 않는다.
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
