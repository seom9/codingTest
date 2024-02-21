package lv_1.CodingTest4;

public class S49_문자열다루기기본 {
	/*
	문자열 s의 길이가 4 혹은 6이고, 숫자로만 구성돼있는지 확인해주는 함수, solution을 완성하세요. 
	예를 들어 s가 "a234"이면 False를 리턴하고 "1234"라면 True를 리턴하면 됩니다.
	*/
	
    public boolean solution(String s) {
        if(s.length() != 4 && s.length() != 6){
            return false;
        }
        
        try {
            Integer a = Integer.parseInt(s);
            return true;
        } catch (Exception e) {
            return false;
        }
    }
    // exception 으로 코드를 작성하고 싶었는데 도저히 안 되더라... 
    // 첫 번째 조건을 빼 먹은 거였음...
    // 바보
    // 그런데 현업에서는 exception 으로 코드를 짜면 안 혼난다는 의견을 보았다
    
    // 그래서 정규 표현식 방법
    public boolean solution1(String s) {
        if (s.length() == 4 || s.length() == 6) return s.matches("(^[0-9]*$)");
        return false;
  }
}
