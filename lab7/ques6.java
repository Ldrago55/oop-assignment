// package assignment.lab7;

class parent {
  void message() {
    System.out.println("This is parent class");
  }
}

interface Test {
  void display();
}

class Child extends parent implements Test {
  public void display() {
    System.out.println("interface implemented");
  }
}

/**
 * ques6
 */
public class ques6 {

  public static void main(String[] args) {

    Child ch = new Child();
    ch.message();
    ch.display();

    return;
  }
}
