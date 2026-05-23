class Animal {
    void sound() {
        System.out.println("The animal makes a sound.");
    }
}

class Dog extends Animal {
    void sound() {
        System.out.println("The dog barks.");
    }
}

public class ques2 {
    public static void main(String[] args) {
        Animal myAnimal = new Animal();
        Dog myDog = new Dog();

        myAnimal.sound();
        myDog.sound();
    }
}

