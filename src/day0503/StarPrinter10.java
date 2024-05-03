package day0503;

import java.util.Scanner;

public class StarPrinter10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("======================================");
        System.out.println("             별찍기 10번");
        System.out.println("======================================");
        System.out.println("\n출력할 줄 수를 입력해주세요.");
        System.out.print("> ");
        int userNumber = scanner.nextInt();
        int height = 2 * userNumber - 1;
        int totalWidth = 2 * userNumber - 1;
        for (int i = 1; i <= height; i++) {
            String stars = "";
            if (i == 1 || i == height) {
                for (int j = 1; j <= totalWidth; j++) {
                    stars += "*";
                }
            } else {
                int spaceWidth = 0;
                int starWidth = 0;

                if (i < userNumber) {
                    // 윗부분
                    int upperI = i - 1;
                    starWidth = userNumber - upperI;
                } else {
                    // 아랫부분
                    int lowerI = i - userNumber + 1;
                    starWidth = lowerI;
                }

                spaceWidth = totalWidth - 2 * starWidth;


                for (int j = 1; j <= starWidth; j++) {
                    stars += "*";
                }
                for (int j = 1; j <= spaceWidth; j++) {
                    stars += " ";
                }
                for (int j = 1; j <= starWidth; j++) {
                    stars += "*";
                }
            }

            System.out.println(stars);
        }
    }
}
