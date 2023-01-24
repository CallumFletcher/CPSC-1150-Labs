import java.util.Scanner;

public class Exercise1 {
      public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            System.out.print("Enter temperature (Celcius): ");
            double celcius = scan.nextDouble();

            double fahrenheit = (9.0 / 5.0) * celcius + 32.0;

            System.out.println(celcius + " Celcius is " + fahrenheit + " Fahrenheit");

            scan.close();
      }
}
