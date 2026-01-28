public class PawesomeUtils {
    public static char generateDogChar(int dogId) {
        int dig1 = dogId / 100;
        int dig2 = (dogId % 100) / 10;
        int dig3 = dogId % 10;
        char dogChar = (char) ('F' + ((dig1 + dig2 + dig3) % 10));
        return dogChar;
    }

    public static String pickup(Dog dog, String personName) {
        if (dog.getOwnerName().equals(personName)) {
            dog.setStillInFacility(false);
            return dog.getName() + " has been picked up by their owner " + personName;
        } else {
            return dog.getName() + " cannot be picked up by " + personName + ", because the names don't match!";
        }
    }

    public static void checkIn(Dog dog, String personName) {
        if (validateDogTag(dog)) {
            dog.setStillInFacility(true);
            dog.setOwnerName(personName);
        } else {
            dog.setStillInFacility(false);
        }
        
    }

    public static String generateDogTag(int id, char character) {
        String dogTag = "" + id + character;
        return dogTag;
    }

    public static int validateDogId(int dogId) {
        if (dogId >= 100 && dogId <= 999) {
            return dogId;
        } else {
            int newDogId = (int) (Math.random() * (999 - 100 + 1)) + 100;
            return newDogId;
        }
    }

    public static boolean validateDogTag(Dog dog) {
        int dogId = dog.getDogId();
        validateDogId(dogId);
        generateDogChar(dogId);
        String newDogTag = "" + dog.getDogId() + dog.getDogChar();
        if (newDogTag.equals(dog.getDogTag())) {
            return true;
        } else {
            return false;
        }
    }

    public static int convertAgeToHumanAge(Dog dog) {
        int age = dog.getAge();
        if (age == 1) {
            int humanAge = 15;
            return humanAge;
        } else if (age == 2) {
            int humanAge = 24;
            return humanAge;
        } else {
            int humanAge = (age * (age - 2)) + 24;
            return humanAge;
        }
    }

    public static int convertAgeToDogYears(int humanYears) {
        if (humanYears <= 15) {
            return 1;
        } else if (humanYears <= 24 && humanYears > 15) {
            return 2;
        } else {
            int dogAge = ((humanYears - 24) / 5) + 2;
            return dogAge;
        }
    }
}
