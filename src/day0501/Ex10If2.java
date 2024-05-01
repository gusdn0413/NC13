package day0501;

// 사용자로부터 숫자를 입력받아서
// 0보다 크면 자연수 입니다. 가 출력 되는 프로그램을
// 작성해보시오

import java.util.Scanner;

public class Ex10If2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 1. 사용자로부터 숫자를 입력 받는다.
        System.out.print("숫자: ");
        int number = scanner.nextInt();

        // 2. if문을 사용해 사용자의 숫자가 0보다 큰지 확인한다.

        // 2-1. 0보다 크면 "자연수입니다" 출력한다.
        if (number > 0) {
            System.out.println("자연수입니다.");
        }

    }
}
