package day0502;

import java.util.Random;
import java.util.Scanner;

public class Ex14RandomGame {
    public static void main(String[] args) {
        // 컴퓨터가 1~100 사이의 랜덤한 숫자를 뽑으면 사용자가 그 숫자를 맞추는 게임
        // 만약 사용자가 입력한 숫자가 컴퓨터의 숫자보다 크면 down 작으면 up이 출력
        // 만약 사용자가 컴퓨터의 숫자를 맞추면 축하 메세지를 띄우고 몇번 만에 맞췄는지 보여준다
        // 무한 반복문으로 해당 게임을 계속 즐길 수 있게
        // 최고 점수를 갱신하게 만들어서 사용자가 최고 점수를 갱신하면 축하해주고 최고 점수를 갱신하게 프로그램을 작성하시오
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        int answer = random.nextInt(100) + 1;
        int input;
        int score = 0;
        // 사용자가 입력한횟수
        int cnt = 0;
        while (true) {
            System.out.print("숫자를 입력하세요 : ");
            input = scanner.nextInt();
            cnt++;
            if (input > answer) {
                System.out.println("down");
            } else if (input < answer) {
                System.out.println("up");
            } else {
                System.out.println("정답입니다");
                System.out.println("당신의 점수는 : " + cnt + " 점 입니다");
                if (score == 0) {
                    score = cnt;
                } else if (score >= cnt) {
                    score = cnt;
                }
                System.out.print("1번 다시하기 2번 그만두기 3번 최고기록 보기 : ");

                int retry = scanner.nextInt();
                if (retry == 1) {
                    answer = random.nextInt(100);

                } else if (retry == 2) {
                    break;
                } else if (retry == 3) {
                    System.out.println("당신의 최고 점수는 : " + score + " 점 입니다");
                }
            }
        }
    }
}
