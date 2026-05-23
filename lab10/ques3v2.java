// package assignment.lab10;

class Demo extends Thread {
  private boolean suspended = false;
  private boolean stopped = false;

  public synchronized void suspendThread() {
    suspended = true;
  }
  public synchronized void resumeThread() {
    suspended = false;
    notify(); // wake up the waiting thread
  }
  public synchronized void stopThread() {
    stopped = true;
    notify(); // in case the thread is waiting
  }

  public void run() {
    for (int i = 0; i < 10; i++) {

      synchronized(this) {
        while(suspended) {
          try {
            wait();
          }
          catch(Exception e) {
            System.out.println(e);
          }
        }
        if (stopped) {
          break;
        }
      }

      System.out.println(i);

      try {
        Thread.sleep(500);
      }
      catch(Exception e) {
        System.out.println(e);
      }

    }
  }

}

/**
 * ques3v2
 */
public class ques3v2 extends Thread {

  public static void main(String[] args) {
    Demo t1 = new Demo();
    t1.start();

    try {
      Thread.sleep(2000);

      System.out.println("Thread suspended");
      t1.suspendThread();

      Thread.sleep(2000);

      System.out.println("Thread resumed");
      t1.resumeThread();
      
      Thread.sleep(2000);

      System.out.println("Thread stopped");
      t1.stopThread();
    }
    catch(Exception e) {
      System.out.println(e);
    }

  }
}
