package day0503;

import java.util.Scanner;

public class StarPrinter06Easy {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("======================================");
        System.out.println("             별찍기 6번 쉬운 버젼");
        System.out.println("======================================");
        System.out.println("\n출력할 줄 수를 입력해주세요.");
        System.out.print("> ");
        int userNumber = scanner.nextInt();

        int height = userNumber;

        for (int i = height; i >= 1; i--) {
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
    }
}
