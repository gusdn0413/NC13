package day0509;

// 로또 번호 제작기
// ArrayUtil을 사용한 버젼

import java.util.Random;
import java.util.Scanner;

import util.ArrayUtil;
import util.ScannerUtil;

public class Ex01Lotto {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        // 컴퓨터의 숫자를 저장할 배열
        int[] computerNumbers = new int[0];

        // 중복되지 않은 랜덤 숫자 6개를 computerNumbers에 추가한다.
        while (ArrayUtil.size(computerNumbers) < 6) {
            // 1~45까지의 랜덤한 숫자를 하나 뽑는다.
            int temp = random.nextInt(45) + 1;
            // 만약 temp가 computerNumbers에 없으면
            // temp를 computerNumbers에 추가한다.
            if (!ArrayUtil.contains(computerNumbers, temp)) {
                computerNumbers = ArrayUtil.add(computerNumbers, temp);
            }
        }

        // 정렬하기
        for (int i = 0; i < ArrayUtil.size(computerNumbers) - 1; i++) {
            if (ArrayUtil.get(computerNumbers, i) >
                    ArrayUtil.get(computerNumbers, i + 1)) {
                int temp = ArrayUtil.get(computerNumbers, i);
                computerNumbers[i] = ArrayUtil.get(computerNumbers, i + 1);
                computerNumbers[i + 1] = temp;
                i = -1;
            }
        }

        for (int i = 0; i < ArrayUtil.size(computerNumbers); i++) {
            System.out.println(ArrayUtil.get(computerNumbers, i));
        }
    }
}
