package codingTest1;

public class Solution_1 {
    public int solution(int[] box, int n) {
        int[] answer = new int[3];
        int num = 1;
        for (int i = 0; i < 3; i++){
            answer[i] = (int)box[i]/n;
            num *= answer[i];
        }
        return num;
    }
}
