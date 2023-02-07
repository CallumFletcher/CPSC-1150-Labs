package Lab5;

import java.util.Scanner;

public class Exercise1 {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    // inputs
    System.out.print("Please enter a String: ");
    String input = scan.nextLine().toLowerCase();
    int aVowel = 0;
    int eVowel = 0;
    int iVowel = 0;
    int oVowel = 0;
    int uVowel = 0;
    int nonVowels = 0;
    for (int i = 0; i < input.length(); i++) {
      switch (input.charAt(i)) {
        case 'a':
          aVowel++;
          break;
        case 'e':
          eVowel++;
          break;
        case 'i':
          iVowel++;
          break;
        case 'o':
          oVowel++;
          break;
        case 'u':
          uVowel++;
          break;
        default:
          nonVowels++;
          break;
      }
    }
    System.out.println("a: " + aVowel);
    System.out.println("e: " + eVowel);
    System.out.println("i: " + iVowel);
    System.out.println("o: " + oVowel);
    System.out.println("u: " + uVowel);
    System.out.println("non-vowels: " + nonVowels);

    scan.close();
  }

}
