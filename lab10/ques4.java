// package assignment.lab10;

class MyThread extends Thread {
  public void run() {
    System.out.println("Thread is running...");
  }
}

/**
 * ques4
 */
public class ques4 {

  public static void main(String[] args) {
    MyThread t = new MyThread();

    System.out.println("Default priority: " + t.getPriority());

    t.setPriority(8);
    
    System.out.println("Changed priority: " + t.getPriority());

    t.start();
  }
}
