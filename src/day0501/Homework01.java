package day0501;

import java.util.Scanner;

public class Homework01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 1. 사용자로부터 숫자를 입력받아서
        //    양의 정수이면 "양의 정수입니다" 가 출력되는
        //    코드를 작성하시오.
        System.out.println("숫자 : ");
        double num = scanner.nextDouble();
        if (num > 0 && num % 1 == 0) {
            System.out.println("양의 정수입니다.");
        }

        // 2. 사용자로부터 나이를 입력받아서 미성년자일 경우 "미성년자입니다" 가 출력되는 코드를 작성하시오.
        System.out.println("나이 : ");
        int age = scanner.nextInt();
        if (age < 20) {
            System.out.println("미성년자입니다.");
        }

        // 3. 사용자로부터 국어, 영어, 수학 점수를 입력받아서 평균이 60점 이상이고, 모든 과목이 50점 초과일때 합격입니다. 가 출력되는 코드를 작성하시오
        final int SUBJECT_SIZE = 3;
        System.out.println("국어 : ");
        int korean = scanner.nextInt();
        System.out.println("영어 : ");
        int english = scanner.nextInt();
        System.out.println("수학 : ");
        int math = scanner.nextInt();
        int sum = korean + english + math;
        double avg = sum / (double) SUBJECT_SIZE;
        if (avg >= 60 && korean > 50 && english > 50 && math > 50) {
            System.out.println("합격입니다.");
        }

        // 4. 사용자로부터 아이디와 비밀번호를 입력받아서
        //    아이디가 "admin", 비밀번호가 "!Q@W3e4r" 일 경우
        //    "로그인 성공" 이 출력되는 코드를 작성하시오
        System.out.println("ID : ");
        String id = scanner.next();
        System.out.println("password");
        String password = scanner.next();
        if (id.equals("admin") && password.equals("!Q@W3e4r")) {
            System.out.println("로그인 성공");
        }

        // 5. 사용자가 숫자를 입력했을 때
        //    0~100 사이의 숫자가 입력됬을 경우
        //    "올바른 시험 점수입니다" 가 출력되는 코드를 작성하시오
        System.out.println("숫자 : ");
        int number = scanner.nextInt();
        if (number>=0&&number<=100) {
            System.out.println("올바른 시험 점수 입니다.");
        }
    }
}
