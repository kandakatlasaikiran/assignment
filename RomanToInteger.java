import java.util.HashMap;

public class RomanToInteger {

    public static int romanToInt(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);

        int total = 0;
        for (int i = 0; i < s.length(); i++) {
            char currentNumeral = s.charAt(i);
            int currentValue = map.get(currentNumeral);

            if (i + 1 < s.length()) {
                char nextNumeral = s.charAt(i + 1);
                int nextValue = map.get(nextNumeral);

                if (currentValue < nextValue) {
                    total -= currentValue;
                } else if (currentNumeral == 'I' || currentNumeral == 'V' || currentNumeral == 'X' && (nextNumeral == 'V' || nextNumeral == 'X')) {
                    total -= currentValue;
                } else {
                    total += currentValue;
                }
            } else {
                total += currentValue;
            }
        }

        return total;
    }

    public static void main(String[] args) {
        String romanNumeral = "IX";
        int integerValue = romanToInt(romanNumeral);

        System.out.println("The integer value of the Roman numeral " + romanNumeral + " is " + integerValue);
    }
}
