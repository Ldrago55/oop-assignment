class Animal {
    String name;

    public Animal(String name) {
        this.name = name;
    }

    void eat() {
        System.out.println(this.name + " eats.");
    }
}

class Dog extends Animal {
    public Dog(String name) {
        super(name); // Calls Animal's constructor
    }

    void displayInfo() {
        System.out.println("Name: " + super.name); // Accessing parent class member
        super.eat(); // Calling parent class method
    }
}

public class ques4 {
    public static void main(String[] args) {
        Dog myDog = new Dog("Bob");
        myDog.displayInfo();
    }
}

