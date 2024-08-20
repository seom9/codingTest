package lv_1.CodingTest7;

public class S72_숫자짝꿍 {
    /*
    두 정수 X, Y의 임의의 자리에서 공통으로 나타나는 정수 k(0 ≤ k ≤ 9)들을 이용하여 만들 수 있는 가장 큰 정수를 두 수의 짝꿍이라 합니다
    (단, 공통으로 나타나는 정수 중 서로 짝지을 수 있는 숫자만 사용합니다).
    X, Y의 짝꿍이 존재하지 않으면, 짝꿍은 -1입니다. X, Y의 짝꿍이 0으로만 구성되어 있다면, 짝꿍은 0입니다.

    예를 들어, X = 3403이고 Y = 13203이라면,
    X와 Y의 짝꿍은 X와 Y에서 공통으로 나타나는 3, 0, 3으로 만들 수 있는 가장 큰 정수인 330입니다.

    다른 예시로 X = 5525이고 Y = 1255이면 X와 Y의 짝꿍은 X와 Y에서 공통으로 나타나는 2, 5, 5로 만들 수 있는 가장 큰 정수인 552입니다
    (X에는 5가 3개, Y에는 5가 2개 나타나므로 남는 5 한 개는 짝 지을 수 없습니다.)
    두 정수 X, Y가 주어졌을 때, X, Y의 짝꿍을 return하는 solution 함수를 완성해주세요.

    제한사항
    1. 3 ≤ X, Y의 길이(자릿수) ≤ 3,000,000입니다.
    2. X, Y는 0으로 시작하지 않습니다.
    3. X, Y의 짝꿍은 상당히 큰 정수일 수 있으므로, 문자열로 반환합니다.
    */

    /*
    [생각 정리]
    1. 몇 개씩 있는지 배열로 만듦 => int[10] 해서 몇 개당 몇 개씩 존재하는지
    2. 배열을 서로 비교해서 더 낮은 숫자대로 새 배열 만듦
    3. 해당 배열을 역으로 추적하여 StringBuilder 로 숫자를 만들어 주기
     */

    /*
    [후기]
    1. 생각을 안 하고 하는 게 문제임 나
     */

    public String solution(String X, String Y) {

        StringBuilder answer = new StringBuilder();

        int[] numX = new int[10];
        int[] numY = new int[10];

        for (int i = 0; i < X.length(); i++) {
            int num = X.charAt(i) - '0';
            numX[num]++;
        }

        for (int i = 0; i < Y.length(); i++) {
            int num = Y.charAt(i) - '0';
            numY[num]++;
        }

        for (int i = 9; i >= 0; i--) {
            if (i == 0) {
                if (answer.length() == 0) {
                    if (numX[i] == 0 && numY[i] == 0) {
                        return "0";
                    } else if (numX[i] > 0 || numY[i] > 0) {
                        return "0"; // i = 0 일 때는 여기서 걸림
                    } else {
                        return "-1";
                    }
                }
            }

            if (numX[i] == 0 || numY[i] == 0) {

            } else if (numX[i] >= numY[i]) {
                for (int j = 0; j < numY[i]; j++) answer.append(i);
            } else if (numX[i] < numY[i]) {
                for (int j = 0; j < numX[i]; j++) answer.append(i);
            }
        }

        return answer.toString();
    }

    public static void main(String agrs[]) {
        S72_숫자짝꿍 solution = new S72_숫자짝꿍();
        String answer = solution.solution("100", "203045");

        System.out.println(answer);

    }
}
