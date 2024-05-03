package day0503;

import java.util.Scanner;

public class HStarPrinter07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("숫자 입력 : ");
        int i = scanner.nextInt();
        String stars;

        for (int j = 0; j < i; j++) {
            stars = "";
            for (int k = 0; k <= j; k++) {
                stars += "*";
            }
            System.out.println(stars);
        }
        for (int j = 1; j <= i; j++) {
            stars = "";
            for (int k = i; j < k; k--) {
                stars += "*";
            }
            System.out.println(stars);
        }
    }
}
