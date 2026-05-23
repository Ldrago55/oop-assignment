class Animal {
    String name;

    public Animal(String name) {
        this.name = name;
        System.out.println("Animal constructor called.");
    }
}

class Dog extends Animal {
    String breed;

    public Dog(String name, String breed) {
        super(name); // Calls Animal's constructor
        this.breed = breed;
        System.out.println("Dog constructor called.");
    }

    void displayInfo() {
        System.out.println("Name: " + name + "\tBreed: " + breed);
    }
}

public class ques6 {
    public static void main(String[] args) {
        Dog myDog = new Dog("Max", "Golden Retriever");
        myDog.displayInfo();
    }
}

