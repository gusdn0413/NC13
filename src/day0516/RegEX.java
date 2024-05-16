package day0516;

// 정규식 표현 : 어떠한 String 값이 특정 패턴을 만족하는지 확인할 때 사용하는 특정 패턴을 식으로 표현한 것

public class RegEX {
    public static void main(String[] args) {
        // 정규식표현의 경우
        // 시작은 ^ 끝은 $ 표현
        // 만약 검사할 String 값이 "ABC" 인지 확인하고 싶다면 ^ABC$ 라고 적어주게 된다
        String a = "ABC";
        System.out.println(a.matches("^ABC$"));
        System.out.println("\"AaBbCc\"->" + "AaBbCcD".matches("^[A-Za-z]+$"));
        System.out.println("\"qqq333\".matches(\"^[A-Za-z]+$\") = " + "qqq333".matches("^[A-Za-z]+$"));

        System.out.println("\"123i45\".matches(\"^\\\\d+$\") = " + "123i45".matches("^\\d+$"));
    }
}
