package day0507;

import java.util.Random;

public class Ex04Lotto03 {
    public static void main(String[] args) {
        Random random = new Random();
        int[] numbers = new int[6];

        // 중복되지 않는 숫자 6개 뽑기
        for (int i = 0; i < numbers.length; ) {
            int temp = random.nextInt(45) + 1;
            boolean isDuplicated = false;
            for (int j = 0; j < numbers.length; j++) {
                if (numbers[j] == temp) {
                    isDuplicated = true;
                }
            }

            if (!isDuplicated) {
                numbers[i++] = temp;
            }
        }
        for (int i = 0; i < numbers.length - 1; i++) {
            if (numbers[i] > numbers[i + 1]) {
                int temp = numbers[i];
                numbers[i] = numbers[i + 1];
                numbers[i + 1] = temp;
                i = -1;
            }
        }

        // 결과값 출력
        for (int i = 0; i < numbers.length; i++) {
            System.out.printf("numbers[%d]: %d\n", i, numbers[i]);
        }
    }
}
