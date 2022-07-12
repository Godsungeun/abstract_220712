interface Animall {
    public abstract void cry();
}
interface Pet {
    void play();
}

class Dogg implements Animall, Pet {
    public void cry(){
        System.out.println("멍멍!");
    }
    public void play(){
        System.out.println("원반 던지기");
    }
}
class Catt implements Animall, Pet {
    public void cry(){
        System.out.println("야옹~!");
    }
    public void play(){
        System.out.println("쥐 잡기");
    }
}
public class MultiInheritance {
    public static void main(String[] args) {
        Dogg dog = new Dogg();
        Catt cat = new Catt();

        dog.cry();
        dog.play();
        cat.cry();
        cat.play();
    }
}
