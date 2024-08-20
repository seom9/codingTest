package lv_1.CodingTest7;

public class S73_비밀지도 {
    /*
    네오는 평소 프로도가 비상금을 숨겨놓는 장소를 알려줄 비밀지도를 손에 넣었다.
    그런데 이 비밀지도는 숫자로 암호화되어 있어 위치를 확인하기 위해서는 암호를 해독해야 한다.
    다행히 지도 암호를 해독할 방법을 적어놓은 메모도 함께 발견했다.

    지도는 한 변의 길이가 n인 정사각형 배열 형태로, 각 칸은 "공백"(" ") 또는 "벽"("#") 두 종류로 이루어져 있다.
    전체 지도는 두 장의 지도를 겹쳐서 얻을 수 있다. 각각 "지도 1"과 "지도 2"라고 하자.
    지도 1 또는 지도 2 중 어느 하나라도 벽인 부분은 전체 지도에서도 벽이다.

    지도 1과 지도 2에서 모두 공백인 부분은 전체 지도에서도 공백이다.
    "지도 1"과 "지도 2"는 각각 정수 배열로 암호화되어 있다.
    암호화된 배열은 지도의 각 가로줄에서 벽 부분을 1, 공백 부분을 0으로 부호화했을 때 얻어지는 이진수에 해당하는 값의 배열이다.
     */

    /*
    [생각정리]
     1. 각 숫자를 2진수로 변환하여 저장
     2. 이진수가 n 개 저장된 배열 2개 생성
     3. 배열의 각자 char(i) 를 비교하여 answer 배열 생성
     */

    /*
    [후기]
     제대로 못 푼 건가?
     */

    public String toBinary(int number, int n) {
        // 이진수를 저장할 변수
        StringBuilder binary = new StringBuilder();

        while (n > 0) {
            // 현재 숫자의 마지막 비트를 가져오기 위해 2로 나눈 나머지를 구함
            binary.append(number % 2);
            // 숫자를 오른쪽으로 한 비트 시프트 (즉, 2로 나눔)
            number = number / 2;
            n--;
        }
        return binary.reverse().toString();
    }

    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[arr1.length];
        String[] arrA = new String[arr1.length];
        String[] arrB = new String[arr2.length];

        // 새로운 배열 생성
        for (int i = 0; i < arr1.length; i++) {
            arrA[i] = toBinary(arr1[i], n);
            arrB[i] = toBinary(arr2[i], n);
        }

        for (int i = 0; i < n; i++) {
            StringBuilder sb = new StringBuilder();
            for (int j = 0; j < n; j++) {
                if (arrA[i].charAt(j) == '0' && arrB[i].charAt(j) == '0') {
                    sb.append(" ");
                } else {
                    sb.append("#");
                }
                answer[i] = sb.toString();
            }
        }

        return answer;
    }

    /* gpt 한테 코드 향상시켜 달라함.
    * 어이가 없어짐. */
    public String[] solution1(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];

        for (int i = 0; i < n; i++) {
            // 각 배열의 값을 OR 연산하여 하나라도 1이면 벽(#)이 되도록 함
            int combined = arr1[i] | arr2[i];
            // 2진수 문자열로 변환한 후, 길이가 n이 되도록 앞에 0을 채움
            String binaryString = String.format("%" + n + "s", Integer.toBinaryString(combined)).replace('1', '#').replace('0', ' ');

            answer[i] = binaryString;
        }

        return answer;
    }


    public static void main(String[] args) {
        S73_비밀지도 secret = new S73_비밀지도();

        int arr1[] = {9, 20, 28, 18, 11};
        int arr2[] = {30, 1, 21, 17, 28};

        String[] arrA = secret.solution(5, arr1, arr2);
        for (int i = 0; i < arrA.length; i++) {
            System.out.println(arrA[i]);

        }
    }
}
