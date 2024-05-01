package day0501;
// 연산자
// 연산자란 수학적 기호에 프로그래밍 기능을 정의한 것 이다
// 연산자에는 산술, 증감, 할당, 논리, 비트 5가지가 있음(비트 안배움)
// 산술연산자 : 두개의 값에 대한 기본적인 산수 계산을 하는 연산자 + - * / %
// 논리연산자 : == || !=

public class Ex01Operator {
    public static void main(String[] args) {
        int korean = 91;
        int english = 90;
        int math = 90;
        int sum = korean + english + math;
        double average = sum / 3.0; // 3 x 3.0 o int 로 나누면 int 반환
        System.out.println("average = " + average);
    }
}
