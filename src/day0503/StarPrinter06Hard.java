package day0503;

import java.util.Scanner;

public class StarPrinter06Hard {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("======================================");
        System.out.println("             별찍기 6번 어려운 버젼");
        System.out.println("======================================");
        System.out.println("\n출력할 줄 수를 입력해주세요.");
        System.out.print("> ");
        int userNumber = scanner.nextInt();

        int height = userNumber;
        for (int i = 1; i <= height; i++) {
            String stars = "";
            int spaceWidth = i - 1;
            int starWidth = -2 * i + 2 * userNumber + 1;
            // 공백을 담당하는 j for 문
            for (int j = 1; j <= spaceWidth; j++) {
                stars += " ";
            }
            // 별을 담당하는 j for 문
            for (int j = 1; j <= starWidth; j++) {
                stars += "*";
            }

            System.out.println(stars);
        }
    }
}
