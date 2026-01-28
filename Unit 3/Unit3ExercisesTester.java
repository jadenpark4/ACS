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

        // PART 2

        // Test Case - Main Case
        int[] nums = { 1, 2, 3, 4, 5 };
        System.out.println("Expected 55: " + Unit3Exercises.calculateSumOfSquares(nums));

        // Test Case - Edge Case: Null array
        try {
            int[] nums2 = null;
            // expected output: 0
            System.out.println("Expected exception: " + Unit3Exercises.calculateSumOfSquares(nums2));
        } catch (Exception e) {
            System.out.println(e.toString());
            System.out.println("The method threw an exception when the array was null, as intended");
        }

        // Test Case - Main Case
        int fib = 5;
        System.out.println("Expected 5: " + Unit3Exercises.getNthFibonacci(fib));

        // Test Case - Main Case
        int fib2 = 7;
        System.out.println("Expected 13: " + Unit3Exercises.getNthFibonacci(fib2));

        // Test Case - Edge Case: Negative number
        try {
            int fib3 = -3;
            // expected output: 0
            System.out.println("Expected exception: " + Unit3Exercises.getNthFibonacci(fib3));
        } catch (Exception e) {
            System.out.println(e.toString());
            System.out.println("The method threw an exception when the array was null, as intended");
        }

        // Test Case - Main Case (Unsorted Array)
        int[] sortArray = { 3, 1, 2, 4, 5 };
        Unit3Exercises.sortArrayDescending(sortArray);
        System.out.println("Expected: [5, 4, 3, 2, 1]: ");
        for (int n : sortArray) {
            System.out.println(n + " ");
        }
        System.out.println();

        // Test Case - Main Case (Negative Values)
        int[] sortArrayNeg = { 2, -3, -5, -6, 0 };
        Unit3Exercises.sortArrayDescending(sortArrayNeg);
        System.out.println("Expected: [2, 0, -3, -5, -6]: ");
        for (int n : sortArrayNeg) {
            System.out.println(n + " ");
        }
        // System.out.println();

        // Test Case - Edge Case: Null array
        try {
            int[] sortArrayNull = null;
            Unit3Exercises.sortArrayDescending(sortArrayNull);
        } catch (Exception e) {
            System.out.println(e.toString());
            System.out.println("The method threw an exception when the array was null, as intended");
        }

        // Test Case - Main Case
        String phrase = "I love playing volleyball at the beach";
        System.out.println("Expected volleyball: " + Unit3Exercises.findLongestWord(phrase));

        // Test Case - Main Case
        String phrase2 = "The capital of Denmark is Copenhagen";
        System.out.println("Expected Copenhagen: " + Unit3Exercises.findLongestWord(phrase2));

        // Test Case - Edge Case: Null string
        try {
            String phrase3 = null;
            Unit3Exercises.findLongestWord(phrase3);
        } catch (Exception e) {
            System.out.println(e.toString());
            System.out.println("The method threw an exception when the string was null, as intended");
        }

        // Test Case - Main Case
        double value = 1000;
        double valuerate = 5;
        int valueyrs = 2;
        System.out.println("Expected 1102.5: " + Unit3Exercises.calculateInterest(value, valuerate, valueyrs));

        // Test Case - Main Case
        double value2 = 500;
        double valuerate2 = 10;
        int valueyrs2 = 3;
        System.out.println("Expected 665.5: " + Unit3Exercises.calculateInterest(value2, valuerate2, valueyrs2));

        // Test Case - Edge Case: Negative principal amount
        try {
            System.out.println("Expected exception: " + Unit3Exercises.calculateInterest(-10, valuerate, valueyrs));
        } catch (Exception e) {
            System.out.println(e.toString());
            System.out.println("The method threw an exception when the principal was negative, as intended");
        }

        // Test Case - Edge Case: Negative interest rate
        try {
            System.out.println("Expected exception: " + Unit3Exercises.calculateInterest(value, -11, valueyrs));
        } catch (Exception e) {
            System.out.println(e.toString());
            System.out.println("The method threw an exception when the interest rate was negative, as intended");
        }

        // Test Case - Edge Case: Zero years
        try {
            System.out.println("Expected exception: " + Unit3Exercises.calculateInterest(value, valuerate, 0));
        } catch (Exception e) {
            System.out.println(e.toString());
            System.out.println("The method threw an exception when the year count was zero, as intended");
        }

        // Test Case - Main Case
        String checkpos = "67";
        System.out.println("Expected 67: " + Unit3Exercises.parsePositiveInteger(checkpos));

        // Test Case - Main Case
        String checkneg = "-11";
        System.out.println("Expected 1: " + Unit3Exercises.parsePositiveInteger(checkneg));

        // Test Case - Main Case
        String[] fruits = { "apple", "banana", "cherry" };
        System.out.println("Expected 'banana': " + Unit3Exercises.getArrayElement(fruits, 1));

        // Test Case - Edge Case (null index)
        System.out.println("Expected exception (null): " + Unit3Exercises.getArrayElement(fruits, 5));

        // Test Case - Main Case
        System.out.println("Expected 4.0: " + Unit3Exercises.calculateSquareRoot(16));

        // Test Case - Edge Case (Negative number)
        System.out.println("Expected exception (NaN): " + Unit3Exercises.calculateSquareRoot(-9));

        // Test Case - Main Case
        int[] arraysum = { 1, 3, 5 };
        System.out.println("Expected 9: " + Unit3Exercises.sumArrayElements(arraysum));

        // Test Case - Edge Case
        System.out.println("Expected exception (0): " + Unit3Exercises.sumArrayElements(null));

        // Test Case - Main Case
        System.out.println("Expected 8.0: " + Unit3Exercises.calculatePower(2, 3));

        // Test Case - Edge Case (Negative number)
        System.out.println("Expected exception (1.0): " + Unit3Exercises.calculatePower(2, -2));
    }
}
