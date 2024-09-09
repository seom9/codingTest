package lv_1.CodingTest7;

import java.util.HashMap;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class S76_숫자문자열과영단어 {
    /*
    네오와 프로도가 숫자놀이를 하고 있습니다.
    네오가 프로도에게 숫자를 건넬 때 일부 자릿수를 영단어로 바꾼 카드를 건네주면 프로도는 원래 숫자를 찾는 게임입니다.

    다음은 숫자의 일부 자릿수를 영단어로 바꾸는 예시입니다.

    1478 → "one4seveneight"
    234567 → "23four5six7"
    10203 → "1zerotwozero3"
    이렇게 숫자의 일부 자릿수가 영단어로 바뀌어졌거나, 혹은 바뀌지 않고 그대로인 문자열 s가 매개변수로 주어집니다.
    s가 의미하는 원래 숫자를 return 하도록 solution 함수를 완성해주세요.

    참고로 각 숫자에 대응되는 영단어는 다음 표와 같습니다.

    숫자	영단어
    0	zero
    1	one
    2	two
    3	three
    4	four
    5	five
    6	six
    7	seven
    8	eight
    9	nine

    [생각 정리]
    1. 배열로 one ~ ten 만들기 / 해시맵에 담아주기
    2. 첫 번째부터 검사.
    3. 만약 숫자라면 try - catch 문으로 잡아서 숫자냐 ? 정규식이냐 가늠
    4. 정규식일 경우 catch 문으로 잡아서 해시에 넣음. 숫자 반환 후 List 저장
     */

    public List<Character> number(String str, List<Character> chars) {

        if (str.equals("")) return chars;

        StringBuilder sb = new StringBuilder();
        sb.append(str);

        try {

        } catch (Exception e) {

        }

        Pattern pattern = Pattern.compile("^(zero|one|two|three|four|five|six|seven|eight|nine)");
        Matcher matcher = pattern.matcher(str);

        sb.delete(0, matcher.group().length());

        return number(sb.toString(), chars);
    }


    public int solution(String s) {
        int answer = 0;
        String numbers[] = {"zero","one","two","three","four","five","six","seven","eight","nine"};
        HashMap<String, Integer> map = new HashMap<String, Integer>();

        for (int i = 0; i < numbers.length; i++) {
            map.put(numbers[i], i);
        }

        return answer;
    }

    public static void main(String args[]) {
        S76_숫자문자열과영단어 number = new S76_숫자문자열과영단어();
        System.out.println("hello world");
        System.out.println(number.solution("one4seveneight"));

    }

}
