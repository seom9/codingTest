package lv_1.CodingTest7;

public class S71_삼총사 {
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
	public static void getCombination(int[] numAry, boolean[] visited, int depth, int n, int r) {
		if (r == 0) { // 뽑아야하는 만큼 뽑았으므로, 출력 후 종료
			print(numAry, visited);
			return;
		}
		if (depth == n) { // 모든 원소를 둘러보았으므로, 종료
			return;
		}

		visited[depth] = true; // 현재 원소를 뽑았을 때
		getCombination(numAry, visited, depth + 1, n, r - 1); // n-1Cr-1

		visited[depth] = false; // 현재 원소를 뽑지 않았을 때
		getCombination(numAry, visited, depth + 1, n, r); // n-1Cr
	}

	// 뽑은 원소를 출력하는 메서드
	private static void print(int[] numAry, boolean[] visited) {
		System.out.print("{");
		for (int i = 0; i < visited.length; i++) {
			if (visited[i]) {
				System.out.print(numAry[i] + " ");
			}
		}
		System.out.print("}\n");
	}
	
    public int solution(int[] number) {
        int answer = 0;
        
        int[] numAry = {-2, 3, 0, 2, -5};
        
        getCombination();
        return answer;
        
        삼총사 중.
    }
    
}
