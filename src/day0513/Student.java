package day0513;

public class Student {
    public int id;
    public String name;
    public int korean;
    public int english;
    public int math;

    // 해당 클래스 변수가 실행시킬 수 있는 메서드

    public int calculateSum() {
        return korean + english + math;
    }

    public double calculateAverage() {
        return (double) calculateSum() / 3;
    }

    public void printInfo() {
        System.out.println("id = " + id);
        System.out.println("name = " + name);
        System.out.println("korean = " + korean);
        System.out.println("english = " + english);
        System.out.println("math = " + math);
        System.out.println("sum = " + calculateSum());
        System.out.println("average = " + calculateAverage());
    }

}
