package Assignment8;


public class findlongestWordString {
    public static String findLongestWord(String s) {
        if (s == null || s.trim().isEmpty()) {
            return "";
        }

        String[] words = s.trim().split("\\s+");
        String longestWord = "";

        for (String word : words) {
            if (word.length() > longestWord.length()) {
                longestWord = word;
            }
        }
        return longestWord;
    }

    public static void main(String[] args) {
        String inputString = "I love programming";
        String result = findLongestWord(inputString);
        System.out.println("Longest Word in String is: " + result);
    }

}
