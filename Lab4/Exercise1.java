package Lab4;

import java.util.Scanner;

public class Exercise1 {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    System.out.print("Enter your first and last name: ");
    String name = scan.nextLine();

    String initials = "" + name.charAt(0) + name.charAt(name.indexOf(" ") + 1);

    System.out.println("Initials are: " + initials);

    scan.close();
  }
}