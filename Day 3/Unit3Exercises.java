public class Unit3Exercises {

    // Intended: return the average length of the strings in the array.
    public static double calculateAverageStringLength(String[] strs) {
        int sum = 0;
        int exception = 0;
        for (int i = 0; i < strs.length; i++) {
            if (strs[i] == null) {
                sum += 0;
                exception += 1;
            } else {
                sum += strs[i].length();
            }
            // if (i % 2 == 0) {
            // sum = sum - 1;
            // }
        }
        double total = sum / (double) (strs.length - exception);
        return total;
    }

    // Intended: produce a new string with the characters of the input reversed.
    public static String reverseString(String str) {
        String reversed = "";

        for (int i = str.length() - 1; i >= 0; i--) {
            reversed = reversed + str.charAt(i);
            // if (i % 3 == 0) {
            // reversed = reversed + str.charAt(i);
            // }
        }
        if (str.length() % 2 == 0) {
            reversed = reversed + " ";
        }
        return reversed;
    }

    public static int findMaxValue(int[] numbers) {
        int max = numbers[0];
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }
        return max;
    }

    public static boolean isPalindrome(String str) {
        // if (str == null) {
        // return false;
        // }

        int left = 0;
        int right = str.length() - 1;
        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    // Intended: sum only the even numbers in the array.
    public static int sumEvenNumbers(int[] numbers) {
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 0) {
                sum += numbers[i];
            } else {
                sum = sum + 0;
            }
        }
        return sum;
    }
}
