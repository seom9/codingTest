package lv_1.CodingTest7;

import java.util.TreeSet;

public class S75_두개뽑아서더하기 {

    /*
    정수 배열 numbers가 주어집니다.
    numbers에서 서로 다른 인덱스에 있는 두 개의 수를 뽑아 더해서 만들 수 있는 모든 수를
    배열에 오름차순으로 담아 return 하도록 solution 함수를 완성해주세요.
     */

    /*
    [생각 정리]
    1. 조합이다
    2. 조합 - 백트래킹 구현하면 된다
    3. 중복 제거 => TreeSet 자료구조를 사용하여 중복을 자동으로 제거한다
     */

    public int[] solution(int[] numbers) {

        int r = 2; // 조합을 만들 원소의 개수
        boolean[] visited = new boolean[numbers.length];

        TreeSet<Integer> com = combination(numbers, visited, 0, numbers.length, r, new TreeSet<>());

        int[] answer = new int[com.size()];
        int j = 0;
        for (int i : com) {
            answer[j] = i;
            j++;
        }

        return answer;
    }


    // 백트래킹을 이용한 조합 생성 메서드
    static TreeSet<Integer> combination(int[] arr, boolean[] visited, int start, int n, int r, TreeSet<Integer> ts) {
        if (r == 0) {
            int answer = 0;
            for (int i = 0; i < n; i++) {
                if (visited[i]) {
                    answer += arr[i];

                }
            }
            ts.add(answer);
            return ts;
        }

        for (int i = start; i < n; i++) {
            visited[i] = true;
            TreeSet<Integer> com = combination(arr, visited, i + 1, n, r - 1, ts);
            visited[i] = false;
        }
        return ts;
    }


    public static void main(String[] args) {
        int[] arr = {5,0,2,7};
        int r = 2; // 조합을 만들 원소의 개수
        boolean[] visited = new boolean[arr.length];

        TreeSet<Integer> com = combination(arr, visited, 0, arr.length, r, new TreeSet<>());

        for (int i : com) {
            System.out.print(i + ", ");
        }
    }

}
