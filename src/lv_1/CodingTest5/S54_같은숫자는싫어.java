package lv_1.CodingTest5;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

// 스택과 큐로 풀이해 볼 것
public class S54_같은숫자는싫어 {
	
	/*
	배열 arr가 주어집니다. 배열 arr의 각 원소는 숫자 0부터 9까지로 이루어져 있습니다. 
	이때, 배열 arr에서 연속적으로 나타나는 숫자는 하나만 남기고 전부 제거하려고 합니다. 
	단, 제거된 후 남은 수들을 반환할 때는 배열 arr의 원소들의 순서를 유지해야 합니다. 예를 들면,
	
	arr = [1, 1, 3, 3, 0, 1, 1] 이면 [1, 3, 0, 1] 을 return 합니다.
	arr = [4, 4, 4, 3, 3] 이면 [4, 3] 을 return 합니다.
	배열 arr에서 연속적으로 나타나는 숫자는 제거하고 남은 수들을 return 하는 solution 함수를 완성해 주세요.
	*/
	
	// 그냥 이렇게 스택으로 자료 구조 변경해도 int 랑 똑같이 나옴
    public Stack<Integer> solution(int []arr) {

        Stack<Integer> stack = new Stack<>();

        for(int num : arr){
            if(stack.size() == 0 || stack.peek() != num){
                stack.push(num);
            }
        }

        return stack;
    }
	
	public int[] solution2(int []arr) {
		Stack<Integer> stackInt = new Stack<Integer>();

		for (int i = 0; i < arr.length; i++) {
			try {stackInt.peek();} 
			catch(Exception e) {continue;}
			
			if (arr[i] != stackInt.peek()) {
				stackInt.push(arr[i]);
			}
		}
		
		int[] answer = new int[stackInt.size()];

        for (int i = answer.length; i >= 0; i--) {
        	answer[i] = stackInt.pop();
        }
        
        return answer;
    }
	
	// 모르고 문제 대충 읽어서 queue로 풀어 버림... 하 제발요 ㅠㅠ
	// 문제 대충 읽는 버릇은 언제 고쳐질까....
	public int[] solution1(int []arr) {
		Queue<Integer> queInt = new LinkedList<Integer>();
		
		for (int i = 0; i < arr.length; i++) {
			boolean isExist = queInt.contains(arr[i]);
			if (!isExist) queInt.offer(arr[i]);
		}
		
		int[] answer = new int[queInt.size()];

        for (int i = 0; i < answer.length; i++) {
        	answer[i] = queInt.poll();
        }
        
        return answer;
    }
	
}
