final class Demo {
  final int x = 100;
  final void display() {
    System.out.println("Final Method");
    System.out.println("Value of x: " + x);
  }
}

class ques2 {
  public static void main(String[] args) {
    Demo d = new Demo();
    d.display();

    return;
  }
}
