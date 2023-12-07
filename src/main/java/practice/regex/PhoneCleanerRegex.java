package practice.regex;

import java.util.Scanner;

public class PhoneCleanerRegex {

  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
    while (true) {
      String input = scanner.nextLine();
      if (input.equals("0")) {
        scanner.close();
        break;
      }

      // TODO:напишите ваш код тут, результат вывести в консоль.
      String regex = "[^0-9]";
      input = input.replaceAll(regex, "");

      if (input.length() == 10) {
        System.out.println("7" + input);
      } else if (input.length() > 11 || input.length() < 10) {
        System.out.println("Неверный формат номера");
      } else if (input.length() == 11 && input.charAt(0) != '7' && input.charAt(0) != '8') {
        System.out.println("Неверный формат номера");
      } else if(input.length() == 11) {
        System.out.println(input.replaceAll("8", "7"));
      }
    }
  }

}
