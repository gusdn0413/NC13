package day0503;

import java.util.Scanner;

public class HStarPrinter06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("정수 입력 : ");
        int i = scanner.nextInt();
        String stars;
        for (int j = 0; j < i; j++) {
            for (int k = 0; k < j; k++) {
                System.out.print(" ");
            }
            for (int k = (2 * i) - 1; k > 2 * j; k--) {
                System.out.print("*");
            }
            for (int k = 0; k < j; k++) {
                System.out.print(" ");
            }
            System.out.println();
        }
        System.out.println("==========================");
        for (int j = 0; j < i; j++) {
            stars = "";
            for (int k = 0; k < j; k++) {
                stars += " ";
            }
            for (int k = (2 * i) - 1; k > 2 * j; k--) {
                stars += "*";
            }
            for (int k = 0; k < j; k++) {
                stars += "";
            }
            System.out.println(stars);

        }
    }
}
