package day0503;

import java.util.Scanner;

public class HStarPrinter04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("숫자 입력 : ");
        int i = scanner.nextInt();
        String stars;
        for (int j = 0; j < i; j++) {
            for (int k = 0; k < j; k++) {
                System.out.print(" ");
            }
            for (int k = i; j < k; k--) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("======================");

        for (int j = 0; j < i; j++) {
            stars = "";
            for (int k = 0; k < j; k++) {
                stars += " ";
            }

            for (int k = j; k < i; k++) {
                stars += "*";
            }
            System.out.println(stars);
        }
    }
}
