package Lab6;

import java.util.Scanner;

public class Primes {
  public static void main(String[] args) {
    // // exercise 1
    // System.out.println("Part 1");
    // System.out.println(isPrime(3));
    // System.out.println(isPrime(4));
    // System.out.println(isPrime(5));
    // System.out.println("\n\n\n");

    // // part 2
    // System.out.println("part 2");
    // System.out.println(twinPrime(5));
    // System.out.println(twinPrime(7));
    // System.out.println(twinPrime(23));
    // System.out.println(twinPrime(4));

    // part 3
    Scanner scan = new Scanner(System.in);

    System.out.print("Enter a number: ");
    int number = scan.nextInt();

    if (isPrime(number)) {
      int twin = twinPrime(number);
      System.out.print("" + number + " is a prime number and it ");
      if (twin != -1) {
        System.out.print("has a twin " + twin);
      } else {
        System.out.print("has no twin");
      }
    } else {
      System.out.println("" + number + " is not a prime number");
    }

    scan.close();

  }

  public static boolean isPrime(int n) {
    if (n == 2)
      return true; // special case for only even prime number
    if ((n > 1) && (n % 2 != 0)) {

      // square root of number since that is the largest possible factor where the
      // other one is not smaller
      int maxFactor = (int) (Math.ceil(Math.sqrt(n)));

      // check all odd numbers for factorization
      for (int i = 3; i <= maxFactor; i += 2) {
        if (n % i == 0)
          return false;
      }
      return true;
    }

    return false;
  }

  public static int twinPrime(int n) {
    if (isPrime(n)) {
      if (isPrime(n - 2)) {
        return n - 2;
      } else if (isPrime(n + 2)) {
        return n + 2;
      }

    }

    return -1;

  }
}
