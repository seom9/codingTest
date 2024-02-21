package lv_1.CodingTest5;

import java.util.Arrays;

public class S50_명예의전당1 {
	
	/*
	"명예의 전당"이라는 TV 프로그램에서는 매일 1명의 가수가 노래를 부르고, 
	시청자들의 문자 투표수로 가수에게 점수를 부여합니다. 
	매일 출연한 가수의 점수가 지금까지 출연 가수들의 점수 중 상위 k번째 이내이면 
	해당 가수의 점수를 명예의 전당이라는 목록에 올려 기념합니다. 
	즉 프로그램 시작 이후 초기에 k일까지는 모든 출연 가수의 점수가 명예의 전당에 오르게 됩니다. 
	k일 다음부터는 출연 가수의 점수가 기존의 명예의 전당 목록의 k번째 순위의 가수 점수보다 더 높으면, 
	출연 가수의 점수가 명예의 전당에 오르게 되고 기존의 k번째 순위의 점수는 명예의 전당에서 내려오게 됩니다.
	
	이 프로그램에서는 매일 "명예의 전당"의 최하위 점수를 발표합니다. 예를 들어, k = 3이고, 
	7일 동안 진행된 가수의 점수가 [10, 100, 20, 150, 1, 100, 200]이라면, 
	명예의 전당에서 발표된 점수는 아래의 그림과 같이 [10, 10, 10, 20, 20, 100, 100]입니다.
	
	그림1.png
	
	명예의 전당 목록의 점수의 개수 k, 1일부터 마지막 날까지 출연한 가수들의 점수인 score가 주어졌을 때, 
	매일 발표된 명예의 전당의 최하위 점수를 return하는 solution 함수를 완성해주세요.
	*/
	
	// 두 번째 방법 : 근데 왜 score j 가 출력이 안 되냐?
	// 알고리즘 문제 같은데 모르겠음...
	
    public int[] solution(int k, int[] score) {
        int[] answer = score;
        
        for (int i = 0; i < score.length; i++) {
        	int[] hi = new int[i+1];
            
        	for (int j = 0; j < i; j++) {
        		hi[j] = score[j];
                System.out.println(score[j]);
        	}
        	Arrays.sort(hi);
        	if (i < k) answer[i] = hi[0];
        	if (i >= k) {
        		answer[i] = hi[i-k];
        	}
        }
        return answer;
    }
	
	// 감은 잡았는데 이건 그냥 작은 수 줄 세우기임
    public int[] solution1(int k, int[] score) {
        int[] answer = score;
        int[] honor = new int[k];
        
        for (int i = 0; i < k; i++) {
            honor[i] = 2001;
        }
        
        for (int j = 0; j < score.length; j++) {
        	for (int i = 0; i < k; i++) {
        		if (honor[i] > score[j]) {
        			int num = i+1;
        			while (num > k) {
        				honor[num-1] = honor[num-2];
        				num--;
        			}
        			honor[i] = score[j];
                    break;
        		}
        	}
            System.out.println("첫번째:" + honor[0]);
            System.out.println(honor[1]);
            System.out.println(honor[2]);
        	answer[j] = honor[0];
        }
        return answer;
    }




}
