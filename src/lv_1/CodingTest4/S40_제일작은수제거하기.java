package lv_1.CodingTest4;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class S40_제일작은수제거하기 {
	/*
	프로그래머스 모바일은 개인정보 보호를 위해 고지서를 보낼 때 고객들의 전화번호의 일부를 가립니다.
	전화번호가 문자열 phone_number로 주어졌을 때, 
	전화번호의 뒷 4자리를 제외한 나머지 숫자를 전부 *으로 가린 문자열을 리턴하는 함수, solution을 완성해주세요.
	 */
    public int[] solution(int[] arr) {
    	// 스트림으로 array to List
        List<Integer> list =Arrays.stream(arr)
                			.boxed()     
                			.collect(Collectors.toList());
        
        if (list.size() == 0) return new int[]{-1};

        Arrays.sort(arr);
        int index = list.indexOf(arr[0]);
        list.remove(index);
        return list.stream().mapToInt(Integer::intValue).toArray();
    }
}
