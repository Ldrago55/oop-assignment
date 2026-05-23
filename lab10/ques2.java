// package assignment.lab10;

class MyThread extends Thread {
  public void run() {
    System.out.println("Thread is running");
  }
}

/**
 * ques2
 */
public class ques2 {

  public static void main(String[] args) {
    MyThread thread = new MyThread();
    thread.start();
    System.out.println("hello world");
  }
}
