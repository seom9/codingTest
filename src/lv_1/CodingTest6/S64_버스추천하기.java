package lv_1.CodingTest6;

import java.util.*;
import java.io.*;

public class S64_버스추천하기 {
    public static void main(String[] args) throws Exception {
		
    	// 시간을 분으로 변경해 배열 구성, 
    	// sort 메서드를 사용하여 조건식으로 가장 짧게 남은 시간을 구하였습니다.
    	
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	
    	// 현재 시간을 분으로 변경
        String[] time = br.readLine().split(":");
        int nowTime = Integer.parseInt(time[0]) * 60 + Integer.parseInt(time[1]);
    	
        // 버스 시간 별 남은 시간
        String[] split = br.readLine().split(" ");
        int[] bus = new int[split.length];
		
		for (int i = 0; i < split.length; i++) {
            String[] splitBus = split[i].split(":");
            bus[i] = Integer.parseInt(splitBus[0]) * 60 + Integer.parseInt(splitBus[1]);
		}
		
		Arrays.sort(bus);
		
		for (int i = 0; i < 5; i++) {
			if (bus[i] > nowTime) {
				System.out.println(bus[i] - nowTime);
				break;
			}
		}
    }

}
