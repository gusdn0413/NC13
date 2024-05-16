package types;
// IAnimal 인터페이스를 상속 받는
// Cat 클래스

public class Cat implements IAnimal {
    @Override
    public void info() {
        System.out.println("고양이는 동물이다.");
    }

    @Override
    public void move() {
        System.out.println("고양이가 움직입니다.");
    }

    @Override
    public void makeSound() {
        System.out.println("야옹");
    }
}
