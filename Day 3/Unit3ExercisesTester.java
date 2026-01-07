public class Unit3ExercisesTester {
    public static void main(String[] args) {

        // Test Case - Main Case
        String[] letters = { "abc", "cde", "efg", "hij" };
        // expected output: 3.0
        System.out.println("Expected 3.0: " + Unit3Exercises.calculateAverageStringLength(letters));

        // Test Case - Edge Case: Null element array
        letters = new String[] { "abc", "cde", "efg", null, "hij" };
        // expected output: 3.0
        System.out.println("Expected 3.0: " + Unit3Exercises.calculateAverageStringLength(letters));

        // Test Case - Edge Case: Null array
        try {
            letters = null;
            // expected output: 0
            System.out.println("Expected exception: " + Unit3Exercises.calculateAverageStringLength(letters));
        } catch (Exception e) {
            System.out.println(e.toString());
            System.out.println("The method threw an exception when the array was null, as intended");
        }

        // Test Case - Main Case
        String testString = "abc";
        System.out.println("Expected cba: " + Unit3Exercises.reverseString(testString));

        // Test Case - Edge Case: String with spaces at the end and in the middle
        testString = " ab c ";
        System.out.println("Expected ' c ba ': " + Unit3Exercises.reverseString(testString));

        // Test Case - Edge Case: String with special characters
        testString = "a1b!c&";
        System.out.println("Expected '&c!b1a': " + Unit3Exercises.reverseString(testString));

        // Test Case - Edge Case: Null string
        try {
            testString = null;
            System.out.println("Expected exception: " + Unit3Exercises.reverseString(testString));
        } catch (Exception e) {
            System.out.println(e.toString());
            System.out.println("The method threw an exception when the string was null, as intended");
        }

        // Test Case - Main Case
        int[] positive = { 6, 7, 4, 1 };
        System.out.println("Expected 7: " + Unit3Exercises.findMaxValue(positive));

        // Test Case - Edge Case: Negative #s + Zero
        int[] zero = { -4, -6, 0, -11 };
        System.out.println("Expected 0: " + Unit3Exercises.findMaxValue(zero));

        // Test Case - Edge Case: Negative #s
        int[] negative = { -4, -3, -88, -11 };
        System.out.println("Expected -3: " + Unit3Exercises.findMaxValue(negative));

        // Test Case - Edge Case: Null array
        try {
            int[] testArray = null;
            System.out.println("Expected exception: " + Unit3Exercises.findMaxValue(testArray));
        } catch (Exception e) {
            System.out.println(e.toString());
            System.out.println("The method threw an exception when the array was null, as intended");
        }

        // Test Case - Main Case
        String palindrome = "racecar";
        System.out.println("Expected true: " + Unit3Exercises.isPalindrome(palindrome));

        // Test Case - Main Case
        String non_palindrome = "hello";
        System.out.println("Expected false: " + Unit3Exercises.isPalindrome(non_palindrome));

        // Test Case - Edge Case: Null string
        try {
            String testString2 = null;
            System.out.println("Expected exception: " + Unit3Exercises.isPalindrome(testString2));
        } catch (Exception e) {
            System.out.println(e.toString());
            System.out.println("The method threw an exception when the string was null, as intended");
        }

        // Test Case - Edge Case: Empty string
        String emptyString = "";
        System.out.println("Expected true: " + Unit3Exercises.isPalindrome(emptyString));

        // Test Case - Main Case
        int[] pos = { 1, 2, 3, 4, 5, 6 };
        System.out.println("Expected 12: " + Unit3Exercises.sumEvenNumbers(pos));

        // Test Case - Edge Case: all negative numbers array
        int[] neg = { -1, -2, -3, -4, -7, -8 };
        System.out.println("Expected -14: " + Unit3Exercises.sumEvenNumbers(neg));

        // Test Case - Edge Case: both negative and positive numbers array
        int[] both = { 6, -3, -2, 5, 1, -4 };
        System.out.println("Expected 0: " + Unit3Exercises.sumEvenNumbers(both));

        // Test Case - Edge Case: Null array
        try {
            int[] testArray = null;
            System.out.println("Expected exception: " + Unit3Exercises.findMaxValue(testArray));
        } catch (Exception e) {
            System.out.println(e.toString());
            System.out.println("The method threw an exception when the array was null, as intended");
        }
    }
}
