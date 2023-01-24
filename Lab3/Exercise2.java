import java.util.Scanner;

public class Exercise2 {
  public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);

    System.out.println("Hello, welcome to Langara College!");

    System.out.print("Enter your name and we will asssign your student number: ");

    String studentName = scan.nextLine();

    int studentNumber = 100_000_000 + (int) (Math.random() * 1_000_000);

    System.out.println("Student " + studentName + " has ID " + studentNumber);

    scan.close();

  }

}
