package day0503;

import java.util.Scanner;

public class HStarPrinter09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("정수 입력 : ");
        int i = scanner.nextInt();
        String stars;
        for (int j = 0; j < i; j++) {
            stars = "";
            for (int k = i-1; j < k; k--) {
                stars += "0";
            }
            for (int k = 0; k <= 2 * j; k++) {
                stars += "*";
            }
            for (int k = i-1; j < k; k--) {
                stars += "0";
            }
            System.out.println(stars);
        }
        for (int j = 1; j < i; j++) {
            stars = "";
            for (int k = 0; k < j; k++) {
                stars += "0";
            }
            for (int k = (2 * i) - 1; k > 2 * j; k--) {
                stars += "*";
            }
            for (int k = 0; k < j; k++) {
                stars += "0";
            }
            System.out.println(stars);
        }
        System.out.println("===============================");
    }
}
