public class Unit2Exercises {
    public static String alarmClock(int day, boolean vacation) {
        // to-do: implement this method
        if (vacation) {
            if (day == 0 || day == 6) {
                return "off";
            } else {
                return "10:00";
            }
        } else {
            if (day == 0 || day == 6) {
                return "10:00";
            } else {
                return "7:00";
            }
        }
    }

    public static boolean love6(int a, int b) {
        // to-do: implement this method
        if (a == 6 || b == 6 || (a + b) == 6 || Math.abs(a - b) == 6) {
            return true;
        }
        return false;
    }

    public static int redTicket(int a, int b, int c) {
        // to-do: implement this method
        if (a == 2 && b == 2 && c == 2) {
            return 10;
        } else if (a == b && b == c) {
            return 5;
        } else if (b != a && c != a) {
            return 1;
        }
        return 0;
    }

    public static String fizzString(String str) {
        // to-do: implement this method
        boolean starts = str.startsWith("f");
        boolean ends = str.endsWith("b");
        if (starts && ends) {
            return "FizzBuzz";
        } else if (starts) {
            return "Fizz";
        } else if (ends) {
            return "Buzz";
        }
        return str;
    }

    public static String doubleChar(String str) {
        // to-do: implement this method
        String result = "";
        for (int i = 0; i < str.length(); i++) {
            result += str.charAt(i);
            result += str.charAt(i);
        }
        return result;

    }

    public static int countHi(String str) {
        // to-do: implement this method
        int count = 0;
        for (int i = 0; i < str.length() - 1; i++) {
            if (str.substring(i, i + 2).equals("hi")) {
                count++;
            }
        }
        return count;
    }

    public static boolean catDog(String str) {
        // to-do: implement this method
        int cats = 0;
        int dogs = 0;
        for (int i = 0; i < str.length() - 2; i++) {
            if (str.substring(i, i + 3).equals("cat")) {
                cats++;
            } else if (str.substring(i, i + 3).equals("dog")) {
                dogs++;
            }
        }
        return cats == dogs;
    }

    public static String mixString(String a, String b) {
        // to-do: implement this method
        String result = "";
        int max = Math.max(a.length(), b.length());
        for (int i = 0; i < max; i++) {
            if (i < a.length()) {
                result += a.charAt(i);
            }
            if (i < b.length()) {
                result += b.charAt(i);
            }
        }
        return result;

    }

    public static String repeatEnd(String str, int n) {
        // to-do: implement this method
        String end = str.substring(str.length() - n);
        String result = "";
        for (int i = 0; i < n; i++) {
            result += end;
        }
        return result;
    }

    public static boolean endOther(String a, String b) {
        // to-do: implement this method
        a = a.toLowerCase();
        b = b.toLowerCase();
        return a.endsWith(b) || b.endsWith(a);
    }

    public static int countCode(String str) {
        // to-do: implement this method
        int count = 0;
        for (int i = 0; i < str.length() - 3; i++) {
            if (str.substring(i, i + 2).equals("co") && str.charAt(i + 3) == 'e') {
                count++;
            }
        }
        return count;
    }

    public static int countEvens(int[] nums) {
        // to-do: implement this method
        int count = 0;
        for (int num : nums) {
            if (num % 2 == 0) {
                count++;
            }
        }
        return count;
    }

    public static int bigDiff(int[] nums) {
        // to-do: implement this method
        int min = nums[0];
        int max = nums[0];
        for (int num : nums) {
            if (num < min) {
                min = num;
            }
            if (num > max) {
                max = num;
            }
        }
        return max - min;
    }

    public static int sum13(int[] nums) {
        // to-do: implement this method
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 13) {
                i++;
            } else {
                sum += nums[i];
            }
        }
        return sum;
    }

    public static int[] fizzArray(int n) {
        // to-do: implement this method
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = i;
        }
        return array;
    }

    public static boolean haveThree(int[] nums) {
        // to-do: implement this method
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 3) {
                count++;
                if (i > 0 && nums[i - 1] == 3) {
                    return false;
                }
            }
        }
        return count == 3;
    }

    public static String[] fizzArray2(int n) {
        // to-do: implement this method
        String[] array = new String[n];
        for (int i = 0; i < n; i++) {
            array[i] = Integer.toString(i);
        }
        return array;
    }

    public static int[] zeroFront(int[] nums) {
        // to-do: implement this method
        int[] array = new int[nums.length];
        int index = 0;
        for (int num : nums) {
            if (num == 0) {
                array[index] = 0;
                index++;
            }
        }
        for (int num : nums) {
            if (num != 0) {
                array[index] = num;
                index++;
            }
        }
        return array;
    }

    public static String[] wordsWithout(String[] words, String target) {
        // to-do: implement this method
        int count = 0;
        for (String word : words) {
            if (!word.equals(target)) {
                count++;
            }
        }
        String[] result = new String[count];
        int i = 0;
        for (String word : words) {
            if (!word.equals(target)) {
                result[i] = word;
                i++;
            }
        }
        return result;
    }

    public static int scoresAverage(int[] scores) {
        // to-do: implement this method
        int mid = scores.length / 2;
        int sum1 = average(scores, 0, mid - 1);
        int sum2 = average(scores, mid, scores.length - 1);
        return Math.max(sum1, sum2);
    }

    public static int average(int[] scores, int start, int end) {
        int sum = 0;
        for (int i = start; i <= end; i++) {
            sum += scores[i];
        }
        return sum / (end - start + 1);
    }

    public static boolean scoresIncreasing(int[] scores) {
        // to-do: implement this method
        for (int i = 1; i < scores.length; i++) {
            if (scores[i] < scores[i - 1]) {
                return false;
            }
        }
        return true;
    }

    public static int scoresSpecial(int[] a, int[] b) {
        // to-do: implement this method
        return largestSpecial(a) + largestSpecial(b);
    }

    public static int largestSpecial(int[] scores) {
        int max = 0;
        for (int score : scores) {
            if (score % 10 == 0 && score > max) {
                max = score;
            }
        }
        return max;
    }

    public static String firstTwo(String str) {
        // to-do: implement this method
        if (str.length() >= 2) {
            return str.substring(0, 2);
        }
        if (str.length() == 1) {
            return str.charAt(0) + "*";
        }
        return "**";
    }

    public static double divide(int a, int b) {
        // to-do: implement this method
        double big = Math.max(a, b);
        double small = Math.min(a, b);
        if (a != 0 && b != 0) {
            return (double) big / small;
        } else {
            return 0.0;
        }
    }
}
