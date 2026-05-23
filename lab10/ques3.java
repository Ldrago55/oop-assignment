// package assignment.lab10;

class Demo extends Thread {
  public void run() {
    for (int i = 0; i < 100; i++) {
      System.out.println(i);

      try {
        Thread.sleep(500);
      }
      catch(InterruptedException e) {
        System.out.println("Exception: " + e);
      }
    }
  }
}

/**
 * ques3
 */
public class ques3 {

  public static void main(String[] args) {
    Demo t = new Demo();
    t.start();

    try {
      Thread.sleep(2000);

      System.out.println("Thread suspended");
      try {
        t.suspend();
      }
      catch(Exception e) {
        System.out.println(e);
      }

      Thread.sleep(2000);

      System.out.println("Thread resumed");
      try {
        t.resume();
      }
      catch(Exception e) {
        System.out.println(e);
      }

      Thread.sleep(2000);

      System.out.println("Thread stopped");
      try {
        t.stop();
      }
      catch(Exception e) {
        System.out.println(e);
      }

    }
    catch(InterruptedException e) {
      System.out.println("Exception: " + e);
    }
  }
}
