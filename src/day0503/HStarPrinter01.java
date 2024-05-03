package day0503;

import java.util.Scanner;

public class HStarPrinter01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("숫자 입력 : ");
        int i = scanner.nextInt();

        for(int j = 0; j < i; j++){
            for(int k = 0; k <= j; k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
