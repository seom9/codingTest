package lv_1.codingTest1;

public class Solution_14 {
	/*
	지나다니는 길을 'O', 장애물을 'X'로 나타낸 직사각형 격자 모양의 공원에서 로봇 강아지가 산책을 하려합니다. 
	산책은 로봇 강아지에 미리 입력된 명령에 따라 진행하며, 명령은 다음과 같은 형식으로 주어집니다.
	
	["방향 거리", "방향 거리" … ]
	예를 들어 "E 5"는 로봇 강아지가 현재 위치에서 동쪽으로 5칸 이동했다는 의미입니다. 
	로봇 강아지는 명령을 수행하기 전에 다음 두 가지를 먼저 확인합니다.
	
	주어진 방향으로 이동할 때 공원을 벗어나는지 확인합니다.
	주어진 방향으로 이동 중 장애물을 만나는지 확인합니다.
	위 두 가지중 어느 하나라도 해당된다면, 로봇 강아지는 해당 명령을 무시하고 다음 명령을 수행합니다.
	공원의 가로 길이가 W, 세로 길이가 H라고 할 때, 공원의 좌측 상단의 좌표는 (0, 0), 
	우측 하단의 좌표는 (H - 1, W - 1) 입니다.
	
	공원을 나타내는 문자열 배열 park, 로봇 강아지가 수행할 명령이 담긴 문자열 배열 routes가 매개변수로 주어질 때, 
	로봇 강아지가 모든 명령을 수행 후 놓인 위치를 [세로 방향 좌표, 가로 방향 좌표] 순으로 배열에 담아 return 하도록 
	solution 함수를 완성해주세요.
	 */
	
	private int[] nowLocation(String[] park) {
        for (int i = 0; i < park.length; i++) {
        	for (int j = 0; j < park[i].length(); j++) {
        		if (park[i].charAt(j) == 'S') {
        			int[] now = {i, j};
        			return now;
        		}
        	}
        }
        return null;
	}
	
    public int[] solution(String[] park, String[] routes) {
        int[] answer = nowLocation(park);
        int w = park[0].length();
        int h = park.length;
        for (int i = 0; i < routes.length; i++) {
        	String[] route = routes[i].split(" ");
        	int go = Integer.parseInt(route[1]);
        	switch(route[0]) {
        		case "E" : 
        			if (answer[1] + go < w) {
        				for (int k = 1; k <= go; k++) {
        					answer[1] += 1;
        					if (park[answer[0]].charAt(answer[1]) == 'X') {
        						answer[1] -= k;
        						break;
        					}
        				}
        			}
        			break;
        		case "S" : 
        			if (answer[0] + go < h) {
        				for (int k = 1; k <= go; k++) {
        					answer[0] += 1;
        					if (park[answer[0]].charAt(answer[1]) == 'X') {
        						answer[0] -= k;
        						break;
        					}
        				}
        			}
        			break;
        		case "W" :
        			if (answer[1] - go >= 0) {
        				for (int k = 1; k <= go; k++) {
        					answer[1] -= 1;
        					if (park[answer[0]].charAt(answer[1]) == 'X') {
        						answer[1] += k;
        						break;
        					}
        				}
        			}
        			break;
        		case "N" :
        			if (answer[0] - go >= 0) {
        				for (int k = 1; k <= go; k++) {
        					answer[0] -= 1;
        					if (park[answer[0]].charAt(answer[1]) == 'X') {
        						answer[0] += k;
        						break;
        					}
        				}
        			}
        			break;
        	}
        }
        return answer;
    }
    
    // 너무나 하드 코딩인데...?
    // 마음에 안 드는데 너무
	// 스레기 같은 하드 코딩이라고 생각했는데 +9 점이나 받았다. 
	// 코딩의 세계는 무엇일까?
}
