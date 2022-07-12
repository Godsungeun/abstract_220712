interface Cover { // 인터페이스 정의
    public abstract void call();
}

public class InterfaceExample {
    public static void main(String[] args) {
        User user = new User(); // User 클래스 객체 생성
        user.callProvider(new Provider2()); // Provider2 객체 생성 후에 매개변수로 전달
        user.callProvider(new Provider());
    }
}

class User {
    public void callProvider(Cover cover){ //매개변수의 다형성 활용
        cover.call(); // 매개변수가 이전이랑 달라졌으니 provider->cover로 바꿔줬음
    }
}

class Provider implements Cover { // 인터페이스 구현
    public void call() {
        System.out.println("무야호~");
    }
}

class Provider2 implements Cover{ // 인터페이스 구현
    public void call() {
        System.out.println("야호~");
    }
}
// 출력값
// 야호~
// 무야호~