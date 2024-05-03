package day0503;

import java.util.Scanner;

public class StarPrinter09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("======================================");
        System.out.println("             별찍기 9번");
        System.out.println("======================================");
        System.out.println("\n출력할 줄 수를 입력해주세요.");
        System.out.print("> ");
        int userNumber = scanner.nextInt();

        for (int i = 1; i <= userNumber; i++) {
            String stars = "";
            int spaceWidth = userNumber - i;
            int starWidth = 2 * i - 1;
            for (int j = 1; j <= spaceWidth; j++) {
                stars += " ";
            }
            for (int j = 1; j <= starWidth; j++) {
                stars += "*";
            }

            System.out.println(stars);
        }

        for (int i = userNumber - 1; i >= 1; i--) {
            String stars = "";
            int spaceWidth = userNumber - i;
            int starWidth = 2 * i - 1;
            for (int j = 1; j <= spaceWidth; j++) {
                stars += " ";
            }
            for (int j = 1; j <= starWidth; j++) {
                stars += "*";
            }

            System.out.println(stars);
        }

        // 1개의 커다란 i for 문
        int height = 2 * userNumber - 1;
        for (int i = 1; i <= height; i++) {
            String stars = "";
            int spaceWidth = 0;
            int starWidth = 0;

            if (i < userNumber) {
                // 윗부분
                spaceWidth = userNumber - i;
                starWidth = 2 * i - 1;
            } else {
                // 아랫부분
                int lowerI = 2 * userNumber - i;
                spaceWidth = userNumber - lowerI;
                starWidth = 2 * lowerI - 1;
            }

            for (int j = 1; j <= spaceWidth; j++) {
                stars += " ";
            }

            for (int j = 1; j <= starWidth; j++) {
                stars += "*";
            }
            System.out.println(stars);

        }
    }
}
