package lv_1.codingTest1;

import java.util.Arrays;

public class Solution_11 {
	/*
	[PCCE 기출문제] 10번 / 데이터 분석
	
	AI 엔지니어인 현식이는 데이터를 분석하는 작업을 진행하고 있습니다. 
	데이터는 ["코드 번호(code)", "제조일(date)", "최대 수량(maximum)", "현재 수량(remain)"]으로 구성되어 있으며 
	현식이는 이 데이터들 중 조건을 만족하는 데이터만 뽑아서 정렬하려 합니다.
	
	예를 들어 다음과 같이 데이터가 주어진다면
	data = [[1, 20300104, 100, 80], [2, 20300804, 847, 37], [3, 20300401, 10, 8]]
	
	이 데이터는 다음 표처럼 나타낼 수 있습니다.
	
	code	date		maximum		remain
	1		20300104	100			80
	2		20300804	847			37
	3		20300401	10			8
	
	주어진 데이터 중 "제조일이 20300501 이전인 물건들을 현재 수량이 적은 순서"로 정렬해야 한다면 
	조건에 맞게 가공된 데이터는 다음과 같습니다.
	
	data = [[3,20300401,10,8],[1,20300104,100,80]]
	정렬한 데이터들이 담긴 이차원 정수 리스트 data와 어떤 정보를 기준으로 데이터를 뽑아낼지를 의미하는 문자열 ext, 
	뽑아낼 정보의 기준값을 나타내는 정수 val_ext, 정보를 정렬할 기준이 되는 문자열 sort_by가 주어집니다.
	
	data에서 ext 값이 val_ext보다 작은 데이터만 뽑은 후, sort_by에 해당하는 값을 기준으로 
	오름차순으로 정렬하여 return 하도록 solution 함수를 완성해 주세요. 
	단, 조건을 만족하는 데이터는 항상 한 개 이상 존재합니다.
	*/
	private int[][] selectionSort(int[][] data, int sortBy){
		for(int i = 0; i < data.length; i++) {
			for (int j = i+1; j < data.length; j++) {
				if (data[i][sortBy] > data[j][sortBy]) {
					int[] min = data[j];
					data[j] = data[i];
					data[i] = min;
				}
			}
		}
		return data;
	}

    public int[][] solution(int[][] data, String ext, int val_ext, String sort_by) {
        int co = 0;
        String[] code = {"code", "date", "maximum", "remain"};
        
        int num = Arrays.asList(code).indexOf(ext);
        int sortBy = Arrays.asList(code).indexOf(sort_by);
		int i = 0;
		
        for (int[] da : data) {
        	if (da[num] < val_ext) {
        		co++;
        	}
        }
        
		int[][] answer = new int[co][4];
		
        for (int[] da : data) {
        	if (da[num] < val_ext) {
        		answer[i] = da;
        		i++;
        	}
        }
        
        answer = selectionSort(answer, sortBy);
		
        return answer;
    }
    
    public static void main(String[] args) {
        Solution_11 sol = new Solution_11();
        int[][] data = {{1, 20300104, 100, 80}, {2, 20300804, 847, 37}, {3, 20300401, 10, 8}};
        String ext = "date";
        int val_ext = 20300501;
        String sort_by = "remain";

        int[][] result = sol.solution(data, ext, val_ext, sort_by);

        for (int[] row : result) {
            System.out.println(Arrays.toString(row));
        }
    }
    
    // 선택 정렬로 구현
    // 선택 정렬이란? 첫 번째 값과 나머지 값 비교
    // 그래서 제일 작은 숫자를 첫 번째로 끌고 옴
    // 나머지 숫자들 중에서 제일 작은 숫자로 비교
}
