package Lab4;

import java.util.Scanner;

public class Exercise3 {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    System.out.print("Enter a year: ");

    int year = scan.nextInt();

    if ((year % 4 == 0) && !((year % 100 == 0) && (year % 400 != 0))) {
      System.out.println("The year is a leap year");

    } else {
      System.out.println("The year is not a leap year");
    }

    scan.close();

  }

}
