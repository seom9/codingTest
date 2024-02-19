package lv_1.CodingTest4;

import java.util.Arrays;
import java.util.Collections;

public class S47_문자열내림차순으로배치하기 {
    public String solution(String s) {
        String[] arr = s.split("");
        StringBuilder stringBuilder = new StringBuilder();

        Arrays.sort(arr, Collections.reverseOrder());
        for (int i = 0; i < arr.length; i++){
            stringBuilder.append(arr[i]);
        }
        return stringBuilder.toString();
    }
}
