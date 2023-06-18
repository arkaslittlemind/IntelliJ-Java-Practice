package AbstractClass;



abstract class Animal {
    public void soundmade() {
        System.out.println("Dog Bark!");
    }
    public abstract void run();
}

class Dog extends Animal {
    public void run() {
        System.out.println("Dog runs!");
    }
}
public class Abstract1 {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.soundmade();
        dog.run();
    }
}
