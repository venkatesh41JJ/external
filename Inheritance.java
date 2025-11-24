class Animal {

    void run() {
        System.out.println("animal make sound");
    }
}
class bird extends Animal {
    void sound() {
        System.out.println("birds make sound");
    }
}

public class Inheritance {
    public static void main(String[] args) {
        
        bird myDog = new bird();
        myDog.run();

        myDog.sound();
    }
}
