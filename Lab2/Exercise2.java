import java.util.Scanner;

public class Exercise2 {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.print("Enter Minutes as an int: ");
    int minutes = scan.nextInt();

    final int MINUTES_IN_YEAR = 525_600;
    final int MINUTES_IN_DAY = 1440;

    int years = minutes / MINUTES_IN_YEAR;

    int days = (minutes % MINUTES_IN_YEAR) / MINUTES_IN_DAY;

    System.out.println(minutes + " minutes is about " + years + " years and " + days + " days");

    scan.close();
  }
}
