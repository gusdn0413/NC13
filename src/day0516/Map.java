package day0516;

// 자바에서 특정 데이터타입의 여러 개체를 한번에 다루는 클래스는 모두 Collection 이라는 인터페이스를 상속받는다.
// Collection 인터페이스를 상속받는 3가지 종류는
// List : 중복이 가능한 배열 형태의 클래스
// Set : 중복이 불가능한 배열 형태의 클래스
// Map : 중복되지 않는 Key 로 Value 를 컨트롤 하는 클래스

import types.Student;

import java.util.HashMap;

public class Map {
    public static void main(String[] args) {
        HashMap<String, Student> map = new HashMap<>();
        Student s1 = new Student();
        s1.name = "박현우";
        s1.id = 1;
        s1.korean = 80;
        s1.english = 81;
        s1.math = 81;

        Student s2 = new Student();
        s2.name = "박현우2";
        s2.id = 2;
        s2.korean = 81;
        s2.english = 82;
        s2.math = 82;

        Student s3 = new Student();
        s3.name = "박현우3";
        s3.id = 3;
        s3.korean = 82;
        s3.english = 83;
        s3.math = 83;

        Student s4 = new Student();
        s4.name = "박현우4";
        s4.id = 3;

        map.put("박현우", s1);
        map.put("박현우2", s2);
        map.put("박현우3", s3);
        map.put("박현우3", s4);

        System.out.println("map.get(\"박현우\").id = " + map.get("박현우").id);
        System.out.println("map.get(\"bbb\") = " + map.get("bbb"));
        System.out.println("map.get(\"박현우\").name = " + map.get("박현우3").name);

        System.out.println("map.keySet() = " + map.keySet());
        for (String k : map.keySet()) {
            System.out.println(map.get(k).id);
        }

        System.out.println(map.containsKey("박현우"));
        System.out.println(map.containsKey("박현우4"));
    }
}
