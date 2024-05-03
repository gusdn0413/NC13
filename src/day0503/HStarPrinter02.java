package day0503;

import java.util.Scanner;

public class HStarPrinter02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("숫자 입력 : ");
        int i = scanner.nextInt();

        for (int j = 0; j < i; j++) {
            for (int k = i; j < k; k--) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("=====================================");
        for (int j = 0; j < i; j++) {
            String star = "";
            for (int k = i; k > j; k--) {
                star = star + "*";
            }
            System.out.println(star);
        }
    }
}
