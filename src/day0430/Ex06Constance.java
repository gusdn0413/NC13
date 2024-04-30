package day0430;
//상수
//상수란 한번 값이 초기화가 되면 더이상 새로운 값을 저장할 수 없는 공간을 뜻함
//상수의 경우 선언할 때 맨 앞에 final 이라는 키워드를 붙여주면 해당 공간은 상수로 설정이 된다.
public class Ex06Constance {
    public static void main(String[] args) {
        // int 타입 상수 MY_NUMBER 선언
        final int MY_NUMBER;
        MY_NUMBER = 20;

        System.out.println("MY_NUMBER 의 현재 값");
        System.out.println(MY_NUMBER);

    }
}
