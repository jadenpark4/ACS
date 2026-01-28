public class Unit3Exercises {

    // Intended: return the average length of the strings in the array.
    public static double calculateAverageStringLength(String[] strs) {
        // Bug: Used integer division (sum/counted), causing the average to lose decimal
        // precision
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
        // Bug: Incorrect index used when swapping characters, causing improper
        // reversal.
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
        // Bug: Assigned the wrong array index when updating max and added unnecessary
        // conditions
        int max = numbers[0];
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }
        return max;
    }

    public static boolean isPalindrome(String str) {
        // Bug: Compared incorrect characters and returned unrelated boolean conditions

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
        // Bug: Added incorrect elements, skipped values, and modified sum incorrectly.
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

    public static int calculateSumOfSquares(int[] numbers) {
        // Bug: Loop started at index 1 and skipped the first element, and used Math.pow
        // causing type issues
        if (numbers == null) {
            throw new IllegalArgumentException("Input array cannot be null");
        }

        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i] * numbers[i];
        }
        return sum;
    }

    public static int getNthFibonacci(int n) {
        // Bug: Method did not handle negative input and allowed invalid Fibonacci
        // values
        if (n < 0) {
            throw new IllegalArgumentException("n cannot be negative");
        }

        if (n <= 1) {
            return n;
        }

        int a = 0, b = 1, c;
        for (int i = 2; i <= n; i++) {
            c = a + b;
            a = b;
            b = c;
        }
        return b;
    }

    public static void sortArrayDescending(int[] arr) {
        // Bug: Comparison sorted the array in ascending order instead of descending
        if (arr == null) {
            throw new IllegalArgumentException("Array cannot be null");
        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] > arr[i]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }

    public static String findLongestWord(String sentence) {
        // Bug: Method returned the last longest word due to >= instead of returning the
        // first
        if (sentence == null) {
            throw new IllegalArgumentException("String cannot be null");
        }

        String[] words = sentence.split(" ");
        String longestWord = "";
        for (int i = 0; i < words.length; i++) {
            if (words[i].length() >= longestWord.length()) {
                longestWord = words[i];
            }
        }
        return longestWord;
    }

    public static double calculateInterest(double principal, double rate, int years) {
        // Bug: Method Method did not validate negative principal, rate, or invalid year
        // values.
        if (principal < 0) {
            throw new IllegalArgumentException("Principal cannot be negative");
        }

        if (rate < 0) {
            throw new IllegalArgumentException("Interest rate cannot be negative");
        }

        if (years <= 0) {
            throw new IllegalArgumentException("Years value must be a positive integer greater than 0");
        }

        for (int i = 0; i < years; i++) {
            principal += principal * (rate / 100);
        }
        return principal;
    }

    public static int parsePositiveInteger(String str) {
        // Bug: Method did not handle negative or invalid input and failed to return the
        // default value of 1
        try {
            int number = Integer.parseInt(str);
            if (number < 0) {
                throw new NumberFormatException("Negative numbers are not allowed");
            }
            return number;
        } catch (NumberFormatException e) {
            System.out.println(e.getMessage());
            System.out.println("Invalid input. Returning default value of 1.");
            return 1;
        }

    }

    public static String getArrayElement(String[] arr, int index) {
        // Bug: Method did not handle out-of-bounds index and crashed instead of
        // returning null
        try {
            return arr[index];
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Index out of bounds: " + e.getMessage());
            return null;
        }

    }

    public static double calculateSquareRoot(int number) {
        // Bug: Method did not handle negative input with excpetion handling
        try {
            if (number < 0) {
                throw new IllegalArgumentException("Cannot calculate square root of a negative number");
            }
            return Math.sqrt(number);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
            return Double.NaN;
        }
    }

    public static int sumArrayElements(int[] array) {
        // Bug: Method did not handle null array and would throw a NullPointerException
        try {
            int sum = 0;
            for (int i = 0; i < array.length; i++) {
                sum += array[i];
            }
            return sum;
        } catch (NullPointerException e) {
            System.out.println("Array is null. Returning 0.");
            return 0;
        }

    }

    public static double calculatePower(double base, int exponent) {
        // Bug: Method did not handle negative exponent and failed to return default
        // value of 1
        try {
            if (exponent < 0) {
                throw new IllegalArgumentException("Exponent cannot be negative");
            }
            return Math.pow(base, exponent);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
            return 1;
        }
    }
}
