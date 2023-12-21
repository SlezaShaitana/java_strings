package practice.string;

public class SequentialWordsNumbers {

    public static String sequentialWordsNumbers(String text){
        StringBuilder line = new StringBuilder();
        if (text.isEmpty()) {
            System.out.println("Строка пуста");
        } else {
            int number = 1;
            int begin = 0;
            int end;
            for (int i = 0; i < text.length(); i++) {
                end = text.indexOf(" ", begin);
                if (end < 0) {
                    return line.append("(").append(number).append(") ").append(text.substring(begin)).toString();
                } else {
                    line.append("(").append(number).append(") ").append(text.substring(begin, end)).append(" ");
                    begin = end + 1;
                    number++;
                }
            }
        }
        return line.toString().trim();
    }
}
