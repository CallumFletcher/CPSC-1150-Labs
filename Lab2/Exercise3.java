
import java.util.Scanner;

public class Exercise3 {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.print("Enter a numnber to be turned into hexadecimal, octal, binary: ");
    int number = scan.nextInt();

    String hex = Integer.toHexString(number);
    String oct = Integer.toOctalString(number);
    String bin = Integer.toBinaryString(number);

    System.out.println("In hex: " + hex);
    System.out.println("In oct: " + oct);
    System.out.println("In bin: " + bin);

    scan.close();
  }
}
