package day0507;

import java.util.Scanner;

public class Ex06GradeBook {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] studentId = new int[5];
        String[] studentName = new String[5];
        int[] koreanGrade = new int[5];
        int[] englishGrade = new int[5];
        int[] mathGrade = new int[5];
        int idx = 0;

        while (true) {
            System.out.println("1. 입력 2. 출력 3. 종료");
            System.out.print(">");
            int userChoice = scanner.nextInt();
            if (userChoice == 1) {
                if (idx < studentId.length) {
                    System.out.print("번호 : ");
                    studentId[idx] = scanner.nextInt();
                    System.out.print("이름 : ");
                    studentName[idx] = scanner.next();
                    System.out.print("국어 : ");
                    koreanGrade[idx] = scanner.nextInt();
                    System.out.print("영어 : ");
                    englishGrade[idx] = scanner.nextInt();
                    System.out.print("수학 : ");
                    mathGrade[idx] = scanner.nextInt();
                    System.out.println("==========================");
                    idx++;
                } else {
                    System.out.println("더이상 학생을 입력할 수 없습니다");

                }

            } else if (userChoice == 2) {
                if (idx == 0) {
                    System.out.println("입력된 정보가 없습니다");
                    System.out.println("==========================");
                } else {
                    for (int i = 0; i < idx; i++) {
                        int sum = koreanGrade[i] + englishGrade[i] + mathGrade[i];
                        double average = (double) sum / 3;
                    }
                }

            } else if (userChoice == 3) {

            }
        }

    }
}
