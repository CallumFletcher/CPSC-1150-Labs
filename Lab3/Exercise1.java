import java.util.Scanner;

public class Exercise1 {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    final double GRAVITY_ACCELERATION = 9.8;

    System.out.print("Enter the mass of the cart: ");
    double mass = scan.nextDouble();
    System.out.print("Enter the angle of the ramp: ");
    double angle = Math.toRadians(scan.nextDouble());

    double force = mass * GRAVITY_ACCELERATION * Math.sin(angle);

    System.out.println("The force needed to push the cart is " + force + " Newtons");

    scan.close();
  }
}