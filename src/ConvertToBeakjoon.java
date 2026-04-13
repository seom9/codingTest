import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class ConvertToBeakjoon {
    public static void main(String[] args) throws IOException {

        // 1. 파일 경로 입력
        String filePath = "C:\\workspace\\codingTest\\src\\BEAKJOON\\step\\정렬\\커트라인.java"; // ← 변경: 여기만 바꾸면 됨

        // 2. 파일 내용 읽기
        String inputCode = Files.readString(Path.of(filePath)); // ← 변경

        // 3. package 제거
        String result = inputCode.replaceAll("(?m)^package .*;\\s*", ""); // ← 변경

        // 4. class 이름 Main으로 변경
        result = result.replaceAll("(public\\s+)?class\\s+[^\\s{]+", "public class Main"); // ← 변경        // 5. 출력

        System.out.println(result);
    }
}