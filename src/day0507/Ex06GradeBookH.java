package day0507;

// 학생 5명의 번호, 이름, 국어, 영어, 수학 점수를 입력 받아서 예쁘게 출력하는 프로그램을 작성하시오
// 단 한번에 5명의 정보를 모두 다 입력하는 것이 아니라 메뉴를 만들어서 입력 메뉴를 통해 들어갔을 떄
// 한명의 정보만 입력을 하되, 만약 5명의 정보를 모두 다 입력했을 경우
// 더이상 입력이 안되게 만드시고 출력할 때에는 현재 입력된 학생들만 출력이 되게 만드시오

// 심화 : 만약 5명 모두 다 입력했을 경우 새로운 입력 시
// 가장 먼저 입력된 정보를 없애고 현재 정보가 들어갈 수 있도록 코드를 작성하시오

import java.util.Scanner;

public class Ex06GradeBookH {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final int STUDENT_NUMBER = 5;
        int[] studentId = new int[STUDENT_NUMBER];
        String[] studentName = new String[STUDENT_NUMBER];
        int[] koreanGrade = new int[STUDENT_NUMBER];
        int[] englishGrade = new int[STUDENT_NUMBER];
        int[] mathGrade = new int[STUDENT_NUMBER];
        int i = 0;
        while (true) {
            System.out.println("작업할 내용을 고르시오");
            System.out.println("1. 입력 ");
            System.out.println("2. 점수 보기 ");
            System.out.println("3. 그만두기 ");
            System.out.print(">");
            int menuNumber = scanner.nextInt();
            if (menuNumber == 1) {
                if (i < STUDENT_NUMBER) {
                    System.out.print("번호를 입력하세요 : ");
                    studentId[i] = scanner.nextInt();
                    System.out.print("이름를 입력하세요 : ");
                    studentName[i] = scanner.next();
                    System.out.print("국어 성적을 입력하세요 : ");
                    koreanGrade[i] = scanner.nextInt();
                    System.out.print("영어 성적을 입력하세요 : ");
                    englishGrade[i] = scanner.nextInt();
                    System.out.print("수학 성적을 입력하세요 : ");
                    mathGrade[i] = scanner.nextInt();
                    System.out.println("==========================");
                    i++;

                } else {
                    System.out.println("데이터가 가득찼습니다. 오래된 데이터부터 삭제한 후 새로운 정보를 저장합니다.");
                    for (int j = 1; j < studentId.length; j++) {
                        studentId[j - 1] = studentId[j];
                        studentName[j - 1] = studentName[j];
                        koreanGrade[j - 1] = koreanGrade[j];
                        englishGrade[j - 1] = englishGrade[j];
                        mathGrade[j - 1] = mathGrade[j];
                    }
                    int lastIndex = studentId.length - 1;
                    System.out.print("번호를 입력하세요 : ");
                    studentId[lastIndex] = scanner.nextInt();
                    System.out.print("이름를 입력하세요 : ");
                    studentName[lastIndex] = scanner.next();
                    System.out.print("국어 성적을 입력하세요 : ");
                    koreanGrade[lastIndex] = scanner.nextInt();
                    System.out.print("영어 성적을 입력하세요 : ");
                    englishGrade[lastIndex] = scanner.nextInt();
                    System.out.print("수학 성적을 입력하세요 : ");
                    mathGrade[lastIndex] = scanner.nextInt();
                    System.out.println("==========================");
                }
            } else if (menuNumber == 2) {
                if (i == 0) {
                    System.out.println("아직 입력된 정보가 없습니다");
                    System.out.println("==========================");
                } else {
                    for (int j = 0; j < i; j++) {
                        int sum = koreanGrade[j] + englishGrade[j] + mathGrade[j];
                        double average = (double) sum / 3;
                        System.out.println("번호 : " + studentId[j]);
                        System.out.println("이름 : " + studentName[j]);
                        System.out.println("국어 점수 : " + koreanGrade[j]);
                        System.out.println("영어 점수 : " + englishGrade[j]);
                        System.out.println("수학 점수 : " + mathGrade[j]);
                        System.out.println("평균 : " + average);
                        System.out.println("==========================");
                    }
                }
            } else if (menuNumber == 3) {
                System.out.println("프로그램을 종료합니다.");
                break;
            } else {
                System.out.println("잘못 입력하셨습니다");
            }
        }
    }
}
