package day0503;

import java.util.Scanner;

public class StarPrinter05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("======================================");
        System.out.println("             별찍기 5번");
        System.out.println("======================================");
        System.out.println("\n출력할 줄 수를 입력해주세요.");
        System.out.print("> ");
        int userNumber = scanner.nextInt();

        int height = userNumber;

        for (int i = 1; i <= userNumber; i++) {
            // 해당 줄의 출력 내용을 저장할 String 변수
            String stars = "";
            // 해당 줄의 공백의 갯수를 저장할 int 변수
            int spaceWidth = userNumber - i;
            // 해당 줄의 별의 갯수를 저장할 int 변수
            int starWidth = 2 * i - 1;
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







