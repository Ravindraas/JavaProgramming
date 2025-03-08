package Sprint100;

public class FirstAndLastCapitalize {
    
    public static void main(String[] args) {
        String inputString = "capitalize the first and last character";
        String result = capitalizeFirstLast(inputString);
        System.out.println(result);
    }

    public static String capitalizeFirstLast(String s) {
        String[] words = s.split(" ");
        StringBuilder result = new StringBuilder();

        for (String word : words) {
            if (word.length() > 1) {
                result.append(Character.toUpperCase(word.charAt(0)))
                      .append(word.substring(1, word.length() - 1))
                      .append(Character.toUpperCase(word.charAt(word.length() - 1)));
            } else {
                result.append(Character.toUpperCase(word.charAt(0)));
            }
            result.append(" ");
        }

        return result.toString().trim();
    }
}
