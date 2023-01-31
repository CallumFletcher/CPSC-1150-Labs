package Lab4;

import java.util.Scanner;

public class Exercise2 {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    System.out.print("Enter a month: ");
    String month = scan.nextLine().toLowerCase();

    switch (month) {
      case "january":
      case "march":
      case "may":
      case "july":
      case "august":
      case "october":
      case "december":
        System.out.println("31 days in " + month);
        break;

      case "february":
        System.out.println("28 days in " + month);
        break;
      case "april":
      case "june":
      case "september":
      case "november":
        System.out.println("30 days in " + month);
        break;
      default:
        System.out.println("month not recognized");
        break;
    }
    scan.close();
  }
}