public class PangramChecker {

    public static boolean isPangram(String input) {
        input = input.toLowerCase();
        boolean[] presentLetters = new boolean[26];
        for (char c : input.toCharArray()) {
            if (c >= 'a' && c <= 'z') {
                presentLetters[c - 'a'] = true;
            }
        }
        for (boolean present : presentLetters) {
            if (!present) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String input = "The quick brown fox jumps over the lazy dog.";

        boolean isPangram = isPangram(input);

        if (isPangram) {
            System.out.println("The input string is a pangram.");
        } else {
            System.out.println("The input string is not a pangram.");
        }
    }
}
