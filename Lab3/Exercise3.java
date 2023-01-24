public class Exercise3 {
  public static void main(String[] args) {

    System.out.println("Welcome to the random password generator");

    char capital = (char) ('A' + (Math.random() * 26));
    char number = (char) ('0' + Math.random() * 10);
    char lowercase = (char) ('a' + (Math.random() * 26));
    char lowercase2 = (char) ('a' + (Math.random() * 26));
    char specialCharacter = (char) ('#' + (Math.random() * 4));

    String password = "" + capital + number + lowercase + lowercase2 + specialCharacter;

    System.out.println("Today's random password is : " + password);

  }
}
