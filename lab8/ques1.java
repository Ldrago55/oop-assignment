class ques1 {
  public static void main(String args[]) {
    try {
      int a = 10, b = 0;
      int result = a / b;

      System.out.println("Result: " + result);
    }
    catch(Exception e) {
      System.out.println("Exception caught: " + e);
    }
    finally {
      System.out.println("finally block always executes.");
    }
  }
}
