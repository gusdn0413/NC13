package day0507;
// 로또 번호 제작기 ver 1.0
// 중복되지 않는 랜덤한 숫자 6개를 정렬하여 보여주는 프로그램

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

        // numbers 정렬하기
        // 우리가 i for문을 사용하여 i번째 인덱스의 값과
        // i+1번째 인덱스의 값을 비교할 것이므로
        // i for문의 반복 조건식은 numbers.length - 1 이 되어야
        // 4<->5까지 비교하고 i for문이 종료가 된다.
        for (int i = 0; i < numbers.length - 1; i++) {
            // numbers의 i번째와 i+1번째를 비교하여
            // i번째가 더 크면 실행되는 if문을 만들어준다.
            if (numbers[i] > numbers[i + 1]) {
                int temp = numbers[i];
                numbers[i] = numbers[i + 1];
                numbers[i + 1] = temp;
                // i for문 내부의 코드가 전부 실행되고 나서
                // 실행되는 코드는 for문의 i++이기 때문에
                // i를 -1로 초기화 해야
                // i++이 실행, i가 0으로 변화된다.
                i = -1;
            }
        }


        // 결과값 출력
        for (int i = 0; i < numbers.length; i++) {
            System.out.printf("numbers[%d]: %d\n", i, numbers[i]);
        }
    }
}
