abstract class Animal{
    public String kind;
    public abstract void sound(); // 추상메서드 정의
}

class Dog extends Animal { // Animal 클래스로부터 상속, 추상메서드있음
    public Dog(){
        this.kind = "포유류";
    }
    public void sound(){ // 메서드 오버라이딩 -> 구현부 완성
        System.out.println("멍멍");
    }
}

class Cat extends Animal {
    public Cat(){
        this.kind = "포유류";
    }
    public void sound() {
        System.out.println("야옹");
    }
}

public class DogExample {
    public static void main(String[] args) {
        Animal dog = new Dog();
        dog.sound();

        Cat cat = new Cat();
        cat.sound();
    }
}
