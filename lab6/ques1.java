import java.util.Scanner;

class Teacher {
    String name;
    int age;

    public Teacher(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void displayInfo() {
        System.out.println("Name: " + name + "\nAge: " + age);
    }
}

class Student extends Teacher {
    int rollNumber;

    public Student(String name,int age, int rollNumber) {
        super(name, age);
        this.rollNumber = rollNumber;
    }

    public void displayInfo() {
        super.displayInfo();
        System.out.println("Roll Number: " + rollNumber);
    }
}

public class ques1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter teacher's name: ");
        String name = sc.nextLine();
        System.out.print("Enter teacher's age: ");
        int age = sc.nextInt();
        sc.nextLine(); // Consume newline left-over

        Teacher teacher = new Teacher(name, age);
        System.out.println("Teacher Information:");
        teacher.displayInfo();

        System.out.print("Enter student's name: ");
        String sName = sc.nextLine();
        System.out.print("Enter student's age: ");
        int sAge = sc.nextInt();
        System.out.print("Enter student's roll number: ");
        int rollNumber = sc.nextInt();

        Student student = new Student(sName, sAge, rollNumber);
        System.out.println("Student Information:");
        student.displayInfo();
    }
}

