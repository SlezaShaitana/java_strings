package practice.regex;

public class SplitText {

  public static void main(String[] args) {

  }

  public static String splitTextIntoWords(String text) {
    //TODO реализуйте метод
    StringBuilder result = new StringBuilder();
    String regex = "[^A-Za-z\\s]";
    text = text.replaceAll(regex, "");
    String[] words = text.split("\\s+");
    for (int i = 0; i < words.length; i++) {
      result.append(words[i]).append(System.lineSeparator());
    }
    return result.toString().strip();
  }
}