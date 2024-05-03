package day0503;

import java.util.Scanner;

public class StarPrinter02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("======================================");
        System.out.println("             별찍기 2번");
        System.out.println("======================================");
        System.out.println("\n출력할 줄 수를 입력해주세요.");
        System.out.print("> ");
        int userNumber = scanner.nextInt();

        // 출력할 총 줄의 숫자를 저장할 int 변수
        int height = userNumber;
        for (int i = 1; i <= height; i++) {
            // 해당 줄의 출력 내용을 저장할 String 변수
            String stars = "";
            for (int j = i; j <= userNumber; j++) {
                stars += "*";
            }
            System.out.println(stars);
        }
    }
}
