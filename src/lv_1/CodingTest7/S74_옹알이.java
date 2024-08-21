package lv_1.CodingTest7;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class S74_옹알이 {
    /*
    머쓱이는 태어난 지 6개월 된 조카를 돌보고 있습니다.
    조카는 아직 "aya", "ye", "woo", "ma" 네 가지 발음을 최대 한 번씩 사용해 조합한(이어 붙인) 발음밖에 하지 못합니다.
    문자열 배열 babbling이 매개변수로 주어질 때, 머쓱이의 조카가 발음할 수 있는 단어의 개수를 return하도록 solution 함수를 완성해주세요.
     */

    /*
    [생각 정리]
    1. 모르겠음 -> 태주한테 물어보자
    2. 정규식 / 재귀함수로 풀면 될 듯?

    1. 정규식으로 확인 후 맞다면 해당 StringBulider 에서 제외
    2. 내부 String 하나를 첫 글자부터 조사 -> 정규식에 해당하면 true 반환, 정규식에 해당하지 않으면 false 반환, 글자가 끝났다면 true 반환

     */

    public boolean babble(String str) {

        if (str.equals("")) return true;

        StringBuilder sb = new StringBuilder();
        sb.append(str);

        Pattern pattern = Pattern.compile("^(aya|ye|woo|ma)");
        Matcher matcher = pattern.matcher(str);

        if (!matcher.matches()) {
            return false;
        }

        sb.delete(0, matcher.group().length());

        return babble(sb.toString());
    }

    public int solution(String[] babbling) {
        int answer = 0;

        for (String word : babbling) {
            boolean bab = babble(word);
            if (bab) answer++;
        }

        return answer;
    }

    public static void main(String[] args) {
        S74_옹알이 bab = new S74_옹알이();
        String[] babb = {"aya", "yee", "u", "maa", "wyeoo"};
        int answer = bab.solution(babb);
        System.out.println(answer);
    }
}
