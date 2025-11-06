abstract class Animal {
    public void walk() {
        
    }
}
//important jinis dekhabe only, rest willl be hidden. think as per properties of abstraction
class Dog extends Animal {
    public void walk() {
        System.out.println("Walks on 4 legs.");
    }
}

class Chicken extends Animal {
    public void walk() {
        System.out.println("Walks on 2 legs.");
    }
}


public class hidden {
    public static void main(String args[]) {
        Dog dog = new Dog();
        dog.walk();
    }
}
