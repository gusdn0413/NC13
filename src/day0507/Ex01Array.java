package day0507;

// 배열이란 똑같은 종류의 데이터타입을 한번에 여러개씩 제어하는 데이터타입
// 컴퓨터는 0부터 세게 된다
// 따라서 인덱스의 최대 값은 해당 배열의 길이 -1이 된다
// 만약 유효하지 않은 인덱스를 접근하게 된다면
// ArrayIndexOutOfBoundsException 이라는 에러가 발생
// 배열의 n번째 인덱스에 있는 요소를 접근할때(=값을 저장하거나 호출할 때)에는 배열이름 [n] 으로 접근하게 된다.


public class Ex01Array {
    public static void main(String[] args) {
        // int 배열의 길이를 저장할 int 변수
        int length = 4;
        // int 배열 intArray 를 선언하고, 길이는 4로 지정
        int[] intArray = new int[length];
        intArray[0] = 20;

        // 기본형 데이터타입의 배열과, 참조형 데이터타입의 다른 점은
        // 기본형 데이터타입의 배열은 선언과 초기호ㅓㅏ가 되면
        // 모든 요소는 0으로 초기화가 된다.
        // 참조형 데이터타입의 배열은 null 이라는 값으로 초기화가 된다

        // 또한 배열의 인덱스는 우리가 변수를 넣어서 특정 요소를 가리킬 수 있다.
        // 그렇다면, 우리가 모든 요소의 값을 출력하고 싶다면 어떤 방법을 쓰면 될까?
        System.out.println(intArray[0]);
        System.out.println(intArray[1]);
        System.out.println(intArray[2]);
        System.out.println(intArray[3]);
        for (int i = 0; i < intArray.length; i++) {
            System.out.println(intArray[i]);
        }
    }
}
