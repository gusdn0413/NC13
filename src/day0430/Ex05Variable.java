package day0430;
// 변수
// 변ㄱ수란, 우리가 값을 여러번 덮어씌울 수 있는 공간을 변수라고 한다.
// 변수를 사용하기 위해서는 선언과 초기화가 필요하다.
// 변수의 선언방법 : 데이터 타입 변수이름;
// 변수의 초기화 방법 : 변수 이름 = 값;
public class Ex05Variable {
    public static void main(String[] args) {
        // int 타입의 변수 myNumber 선언
        int myNumber;
        // myNumber 는 현재 선언만 된 상태이므로 초기화를 하기 전 까지는 사용을 할 수 없다.
//        System.out.println(myNumber); -> myNumber 에 아무런 값이 없으므로
        myNumber = 5;
        System.out.println("myNumber 에 현재 저장된 값");
        System.out.println(myNumber);
    }

}
