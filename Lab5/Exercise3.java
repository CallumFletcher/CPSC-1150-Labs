package Lab5;

import java.util.Scanner;

public class Exercise3 {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.print("Enter integer x: ");
    int x = scan.nextInt();
    System.out.print("Enter integer y: ");
    int y = scan.nextInt();
    if (x > y) { // swap values if y < x
      int temp = x;
      x = y;
      y = temp;
    }

    // for loop
    int forLoopSum = 0;
    for (int i = x; i <= y; i++) {
      forLoopSum += i;

    }
    // while loop
    int whileLoopSum = 0;
    int j = x;
    while (j <= y) {
      whileLoopSum += j;

      j++;
    }

    // do while
    int doWhileSum = 0;
    int k = x;
    do {
      doWhileSum += k;
      k++;
    } while (k <= y);

    System.out.println("For Loop: The sum is " + forLoopSum);
    System.out.println("While Loop: The sum is " + whileLoopSum);
    System.out.println("Do-While Loop: The sum is " + doWhileSum);

    scan.close();
  }
}
