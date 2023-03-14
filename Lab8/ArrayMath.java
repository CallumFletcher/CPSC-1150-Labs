package Lab8;

import java.util.Arrays;

public class ArrayMath {
  public static void main(String[] args) {
    primeList(10);

    System.out.println(Arrays.toString(add(new int[] { 1, 2, 3, 4 }, new int[] { 4, 5, 6 })));

    int[] test = new int[] { 1, 2, 3, 4, 5 };

    mult(test, 5);
    System.out.println(Arrays.toString(test));
  }

  public static int[] primeList(int numberOfPrimes) {
    int[] primeList = new int[numberOfPrimes];
    if (numberOfPrimes > 0) {
      primeList[0] = 2;
      numberOfPrimes--;
      int i = 3;
      while (numberOfPrimes > 0) {
        if (prime(i)) {
          primeList[primeList.length - numberOfPrimes] = i;
          numberOfPrimes--;
        }
        i += 2;
      }
    }

    return primeList;

  }

  public static int[] add(int[] a, int[] b) {
    int[] sumArray = new int[Math.max(a.length, b.length)];
    for (int i = 0; i < a.length; i++) {
      sumArray[i] += a[i];
    }
    for (int i = 0; i < b.length; i++) {
      sumArray[i] += b[i];
    }

    return sumArray;
  }

  public static void mult(int[] arr, int multiplier) {
    for (int i = 0; i < arr.length; i++) {
      arr[i] = arr[i] * 3;

    }

  }

  public static boolean prime(int number) {
    for (int i = 2; i < number; i++) {
      if (number % i == 0) {
        return false;
      }
    }
    return true;
  }
}
