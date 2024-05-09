package day0507;
// 로또 번호 제작기 ver 0.1
// 1~45까지 랜덤한 숫자 6개를 배열에 저장하고
// 출력하는 프로그램을 작성하시오
// 10시 40분까지

import java.util.Random;

public class Ex02Lotto01 {
    public static void main(String[] args) {
        // 랜덤한 숫자를 뽑을 때 사용할 랜덤 변수
        Random random = new Random();
        // 랜덤 숫자를 저장할 int[]
        int[] numbers = new int[6];

        // for문을 사용하여, 랜덤한 숫자 1~45를 배열에 6개 저장한다.
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt(45) + 1;
        }

        for (int i = 0; i < numbers.length; i++) {
            System.out.printf("numbers[%d]: %d\n", i, numbers[i]);
        }
    }
}










