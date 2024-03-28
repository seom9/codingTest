package lv_1.CodingTest6;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class S66_카드관리 {
    public static void main(String[] args) throws Exception {
    	
    	// 대기 리스트는 큐 자료구조로 선택하여 FIFO 로 예약 금액을 결제하게 작성하였습니다.
    	// 결제 진행은 swich ~ case 구문을 이용하여 O(1) 의 시간 복잡도를 가지게 작성하였습니다.
    	// 삼항 연산자로 코드의 가독성을 높여 협업에 용이하게 작성하였습니다.
    	
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	
    	String[] goorm = br.readLine().split(" ");
    	int deposit = Integer.parseInt(goorm[0]);
        int num = Integer.parseInt(goorm[1]);
        
        // 대기 리스트
        Queue<Integer> reservationList = new LinkedList<>();
        
        // buffer 에 입력이 들어올 때마다 결제 진행 
        for (int i = 0; i < num; i++) {
            String[] check = br.readLine().split(" ");
            String type = check[0];
            int amount = Integer.parseInt(check[1]);
            	
            switch (type) {
            case "deposit":
                deposit += amount;
                break;
            case "pay":
                if (deposit >= amount) deposit -= amount;
                break;
            case "reservation":
                if (deposit >= amount && reservationList.isEmpty()) deposit -= amount;
                else  reservationList.offer(amount);
                break;
            }

            // while 문으로 대기 목록을 처리하여 예약금이 소진될 때까지 예약 리스트를 결제하도록 작성
            while (!reservationList.isEmpty() && deposit >= reservationList.peek()) {
                deposit -= reservationList.poll();
            }
        }

        System.out.println(deposit);
        
    }
}
