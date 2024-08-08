package lv_1.CodingTest7;

public class S71_sam {
	/*
	한국중학교에 다니는 학생들은 각자 정수 번호를 갖고 있습니다. 
	이 학교 학생 3명의 정수 번호를 더했을 때 0이 되면 3명의 학생은 삼총사라고 합니다. 
	예를 들어, 5명의 학생이 있고, 각각의 정수 번호가 순서대로 -2, 3, 0, 2, -5일 때, 
	첫 번째, 세 번째, 네 번째 학생의 정수 번호를 더하면 0이므로 세 학생은 삼총사입니다. 
	또한, 두 번째, 네 번째, 다섯 번째 학생의 정수 번호를 더해도 0이므로 세 학생도 삼총사입니다. 
	따라서 이 경우 한국중학교에서는 두 가지 방법으로 삼총사를 만들 수 있습니다.

	한국중학교 학생들의 번호를 나타내는 정수 배열 number가 매개변수로 주어질 때, 
	학생들 중 삼총사를 만들 수 있는 방법의 수를 return 하도록 solution 함수를 완성하세요.
	*/

	// 백트래킹 사용
	private int combination(int[] arr, boolean[] visited, int start, int n, int r, int depth) {
		if (r == 0) {
			int sum = 0;
			for (int i = 0; i < n; i++) {
				if (visited[i]) sum += arr[i];
			}
			return sum == 0 ? 1 : 0;
		}
		if (start == n) return 0;

		int count = 0;
		for (int i = start; i < n; i++) {
			visited[i] = true;
			count += combination(arr, visited, i + 1, n, r - 1, depth + 1);
			visited[i] = false;
		}

		return count;
	}

	public int solution(int[] number) {
		int people = 3;
		boolean[] visited = new boolean[number.length];
		return combination(number, visited, 0, number.length, people, 0);
	}

	public static void main(String[] args) {
		S71_sam sam = new S71_sam();
		int[] numAry = {-2, 3, 0, 2, -5};
		int answer = sam.solution(numAry);

		System.out.println(answer);
	}
}
