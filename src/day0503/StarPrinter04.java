package day0503;

import java.util.Scanner;

public class StarPrinter04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("======================================");
        System.out.println("             별찍기 4번");
        System.out.println("======================================");
        System.out.println("\n출력할 줄 수를 입력해주세요.");
        System.out.print("> ");
        int userNumber = scanner.nextInt();

        int height = userNumber;
        for (int i = 1; i <= height; i++) {
            String stars = "";
            // 공백을 담당하는 j for문
            for (int j = 1; j <= i - 1; j++) {
                stars += " ";
            }

            // 별을 담당하는 j for문
            for (int j = i; j <= userNumber; j++) {
                stars += "*";
            }

            System.out.println(stars);
        }
    }
}
