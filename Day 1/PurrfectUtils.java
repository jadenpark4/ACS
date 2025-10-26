public class PurrfectUtils {
    public static String determineCatMood(Cat cat) {
        if (cat.moodLevel > 7 || cat.moodLevel <= 10) {
            return "Currently, " + cat.name + " is in a great mood." + "\n" + "Petting is appreciated.";
        }
        else if (cat.moodLevel > 3 || cat.moodLevel <= 7) {
            return "Currently, " + cat.name + " is reminiscing of a past life." + "\n" + "Petting is acceptable.";
        }
        else {
            return "Currently, " + cat.name + " is plotting revengeance." + "\n" + "Petting is extremely risky.";
        }
    }

    public static char generateCatChar(String catId) {
        int sum = 0;
        for (int i = 0; i < catId.length(); i++) {
            char c = catId.charAt(i);
            int digit = (int) c;
            sum += digit;
        }
        char result = (char) ('A' + (sum % 26));
        return result;
    }

    public static int generateRandomNumber(int low, int high) {
        if (low < high) {
            int num = low + (int) (Math.random() * high);
            return num;
        } else {
            int num = high + (int) (Math.random() * low);
            return num;
        }
    }

    public static String validateCatId(String catId) {
        int idNum = Integer.parseInt(catId);
        if (idNum >= 1000 && idNum <= 9999) {
            return catId;
        } else {
            int randomId = (int) (Math.random() * 9000) + 1000;
            return String.valueOf(randomId);
        }
    }

    public static int validateMoodLevel(int moodLevel) {
        if (moodLevel >= 0 && moodLevel <= 10) {
            return moodLevel;
        } else {
            int randomMoodLevel = (int) (Math.random() * 10) + 1;
            return randomMoodLevel;
        }
    }

    public static void bootUp(Cat cat) {
        System.out.println(cat.toString());
    }

    public static void pet(Cat cat) {
        System.out.println("Attempting to pet...");

        int oldMood = cat.getMoodLevel();
        int newMood = oldMood;

        if (oldMood >= 2) {
            newMood++;
        } else if (oldMood < 2 && cat.isHungry()) {
            newMood--;
        } else if (oldMood < 2 && !cat.isHungry()) {
            newMood++;
        }

        cat.setMoodLevel(newMood);

        if (newMood > oldMood) {
            System.out.println("Petting successful!");
        } else {
            System.out.println("Petting failed...");
        }
    }

    public static void trimClaws(Cat cat) {
        System.out.println("Attempting to trim claws...");

        int oldMood = cat.getMoodLevel();

        // Ternary operator: 50% chance to decrease by 1 or 2
        int decrease = (Math.random() < 0.5) ? 1 : 2;

        cat.setMoodLevel(oldMood - decrease);

        if (decrease == 1) {
            System.out.println(cat.getName() + " did not like that...");
        } else {
            System.out.println(cat.getName() + " really hated that!");
        }
    }

    public static void cleanLitterBox(Cat cat) {
        System.out.println("Cleaning the litter box...");
        System.out.println("Done!");
        System.out.println(cat.getName() + " appreciated that.");

        cat.setMoodLevel(cat.getMoodLevel() + 1);

        cat.setHungry(true);
    }

    public static void feed(Cat cat) {
        System.out.println("Filling up " + cat.getName() + "'s bowl...");
        System.out.println("Done!");
        System.out.println(cat.getName() + " is eating...");
        System.out.println(cat.getName() + " is full!");

        cat.setMoodLevel(cat.getMoodLevel() + 2);

        cat.setHungry(false);
    }
}
