package day0430;
// 형 변환 : 특정 데이터타입의 값을 다른 데이터타입으로 바꾸는 것을 뜻함
// 암시적 형변환 : 우리가 직접적으로 형변환을 하는 명령어를 적어주지 않더라도 인터프리터가 알아서 형변환을 자동으로 해준다.
// 더 작은 데이터타입의 값을 더 큰 데이터타입으로 변환하거나 데이터 손실이 발생하지 않을 경우에 암시적 형변환이 발생된다.
// 명시적 형변환 : 명시적 형변환은 반드시 명령어를 적어서 강제로 형변환을 해주는 것을 뜻한다
// 더 큰 데이터타입의 값을 더 작은 데이터타입으로 변환하거나 데이터 손실이 발생할 경우 반드시 명시적 형변환을 통해서 형변환을 해주어야 한다
public class Ex11TypeCast {
    public static void main(String[] args) {
        // 1-1. byte 변수 myByte 를 선언하고 30을 저장해보자
        byte myByte = 30;
        // 1-2. int 변수 myNumber 를 선언하고 myByte 의 현재 값으로 초기화해보자
        int myNumber = myByte;
        // 1-3. myNumber 출력
        System.out.println("myNumber 의 현재 값 ");
        System.out.println(myNumber);

        // 2. 정수를 실수로 바꿔보자
        // double 변수 myDouble 에 myNumber 의 현재 값을 저장해보자
        double myDouble = myNumber;
        // myDouble 의 현재 값을 출력해보자
        System.out.println("myDouble 의 현재 값");
        System.out.println(myDouble);

        // 명시적 형변환
        myByte = (byte) myNumber;
        System.out.println("myByte 의 현재 값");
        System.out.println(myByte);

        // 실수를 정수로바꿀 때에도 명시적 형변환이 필요하다.
        myNumber = (int) myDouble;
        System.out.println("myNumber 의 현재 값");
        System.out.println(myNumber);
        // overflow underflow
        myByte = (byte) 128;
        System.out.println("myByte 의 현재 값");
        System.out.println(myByte);

        myByte = (byte) -129;
        System.out.println("myByte 의 현재 값");
        System.out.println(myByte);
    }
}
