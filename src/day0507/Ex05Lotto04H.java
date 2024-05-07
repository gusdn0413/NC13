package day0507;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

// 사용자로부터 1~45 숫자 6개를 입력받아서 컴퓨터의 당첨 숫자와 비교하여
// 사용자의 숫자, 컴퓨터의 숫자, 맞춘 개수를 출력하는 프로그램을 작성하시오.
// 단, 사용자가 잘못된 숫자를 입력하면 올바른 숫자가 입력될 때 까지 입력을 받으세요.

public class Ex05Lotto04H {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();

        final int LENGTH = 6;
        final int MIN_VALUE = 1;
        final int MAX_VALUE = 45;

        int[] lottoNumbers = new int[LENGTH];
        int[] userNumbers = new int[LENGTH];

        // 중복되지 않는 숫자 6개 뽑기
        for (int i = 0; i < LENGTH; ) {
            int randomNumber = random.nextInt(MAX_VALUE) + MIN_VALUE;

            boolean isDuplicated = false;

            for (int j = 0; j < LENGTH; j++) {
                if (lottoNumbers[j] == randomNumber) {
                    isDuplicated = true;
                }
            }

            if (!isDuplicated) {
                lottoNumbers[i++] = randomNumber;
            }
        }

        // 6개 숫자 오름차순 배열
        for (int i = 0; i < LENGTH - 1; i++) {
            if (lottoNumbers[i] > lottoNumbers[i + 1]) {
                int randomNumber = lottoNumbers[i];
                lottoNumbers[i] = lottoNumbers[i + 1];
                lottoNumbers[i + 1] = randomNumber;
                i = -1;
            }
        }

        // 사용자로부터 6개 숫자 받기
        for (int i = 0; i < LENGTH; i++) {
            System.out.print(i + 1 + "번째 번호 입력 : ");
            userNumbers[i] = scanner.nextInt();
            for (int j = 0; j < i; j++) {
                if (userNumbers[i] == userNumbers[j]) {
                    System.out.println("숫자는 중복 될 수 없습니다");
                    i = i - 1;
                }
            }
            if (userNumbers[i] > MAX_VALUE || userNumbers[i] < MIN_VALUE) {
                System.out.println(" 1~45까지의 번호를 입력해주세요");
                i = i - 1;
            }
        }

        // 사용자로 받은 숫자 오름차순 정리
        for (int i = 0; i < LENGTH - 1; i++) {
            if (userNumbers[i] > userNumbers[i + 1]) {
                int randomNumber = userNumbers[i];
                userNumbers[i] = userNumbers[i + 1];
                userNumbers[i + 1] = randomNumber;
                i = -1;
            }
        }

        // 결과값 출력
        int count = 0;
        int[] temp = new int[LENGTH];
        String answer = ("");
        // 사용자가 고른 숫자 출력
        System.out.print("사용자의 숫자 : [");
        StringBuilder userNumberBuilder = new StringBuilder();

        for (int i = 0; i < LENGTH; i++) {
            for (int j = 0; j < LENGTH; j++) {
                if (lottoNumbers[i] == userNumbers[j]) {
                    count = count + 1;
                    temp[j] = lottoNumbers[i];
                }
            }
            userNumberBuilder.append(userNumbers[i]).append(" ");
        }
        String userNumberString = userNumberBuilder.toString().trim(); // .trim 공백 제거
        System.out.print(userNumberString);
        System.out.println("]");

        // 컴퓨터의 랜덤 숫자 출력
        System.out.print("컴퓨터의 숫자 : [");
        StringBuilder lottoNumberBuilder = new StringBuilder();
        for (int i = 0; i < LENGTH; i++) {
            lottoNumberBuilder.append(lottoNumbers[i]).append(" ");
        }
        String lottoNumberString = lottoNumberBuilder.toString().trim();
        System.out.print(lottoNumberString);
        System.out.println("]");

        // 맞춘 번호가 없을 때
        if (Arrays.stream(temp).allMatch(x -> x == 0)) {
            System.out.println("맞는 숫자가 없습니다");
        // 맞춘 번호가 있을 때
        } else {
            System.out.println("맞춘 개수 : " + count);
            System.out.print("맞춘 숫자 : [");
            StringBuilder correctNumberBuilder = new StringBuilder();
            for (int i = 0; i < LENGTH; i++) {
                // 맞춘 경우
                if (temp[i] != 0) {
                    correctNumberBuilder.append(temp[i]).append(" ");
                }
            }
            String correctNumberString = correctNumberBuilder.toString().trim();
            System.out.print(correctNumberString);
            System.out.println("]");
        }
    }
}
