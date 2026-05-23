import java.util.Scanner;

class Bill {
  int units;
  double bill;

  public Bill(int units) {
    this.units = units;
  }
  double domesticBill() {
      // For domestic users
      if (units <= 100) {
          bill = units * 2.5;
      } else if (units <= 200) {
          bill = 250 + (units - 100) * 3.5;
      } else if (units <= 300) {
          bill = 250 + 350 + (units - 200) * 4.0;
      } else {
          bill = 250 + 350 + 400 + (units - 300) * 5.0;
      }

      return bill;
  }
  double commercialBill() {
      // For commercial users
      if (units <= 100) {
          bill = units * 5.0;
      } else if (units <= 200) {
          bill = 500 + (units - 100) * 7.0;
      } else if (units <= 300) {
          bill = 500 + 700 + (units - 200) * 9.0;
      } else {
          bill = 500 + 700 + 900 + (units - 300) * 10.0;
      }

      return bill;
  }
}

public class ques5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of units consumed: ");
        int units = scanner.nextInt();
        Bill b = new Bill(units);

        double dBill = b.domesticBill();
        double cBill = b.commercialBill();

        // System.out.printf("Domestic bill: $%.2f \nCommercial bill: $%.2f", dBill, cBill);
        System.out.println("Domestic bill: " + dBill);
        System.out.println("Commercial bill: " + cBill);
    }
}

