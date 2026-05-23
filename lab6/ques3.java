class Animal {
    void eat() {
        System.out.println("The animal eats.");
    }

    void eat(String food) {
        System.out.println("The animal eats " + food + ".");
    }
}

class Cat extends Animal {
    void eat() {
        System.out.println("The cat eats food.");
    }

    void eat(String food, int quantity) {
        System.out.println("The cat eats " + quantity + " " + food);
    }
}

public class ques3 {
    public static void main(String[] args) {
        Animal myAnimal = new Animal();
        Cat myCat = new Cat();

        myAnimal.eat();
        myAnimal.eat("fruits");

        myCat.eat();
        myCat.eat("fish", 2);
    }
}

