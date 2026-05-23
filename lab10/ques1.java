// package assignment.lab10;

class Demo implements Runnable {
  public void run() {
    for (int i = 0; i < 3; i++) {
      System.out.println("Thread is running " + i);
    }
  }
}

/**
 * ques1
 */
public class ques1 {

  public static void main(String[] args) {
    Thread thread = new Thread(new Demo());
    thread.start();
    for (int i = 0; i < 3; i++) {
      System.out.println("Main method: " + i);
    }
  }
}
