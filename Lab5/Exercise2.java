package Lab5;

public class Exercise2 {
  public static void main(String[] args) {

    for (int i = 0; i < 100; i += 20) {
      for (int j = 0; j < 20; j += 2) {
        System.out.print(i + j + " ");
      }
      System.out.println("");
    }
  }
}
