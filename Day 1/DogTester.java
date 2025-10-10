public class DogTester {
    public static void main(String[] args) {
        Dog dog1 = new Dog("Spot", "Sandra", 1, 123);
        System.out.println(dog1.toString());
        System.out.println(PawesomeUtils.generateDogChar(123));
        Dog myDog = new Dog("Jim", "Maria", 2, 670);
        System.out.println(PawesomeUtils.pickup(myDog, "Maria"));
        System.out.println(PawesomeUtils.pickup(myDog, "John"));
        System.out.println(myDog.isStillInFacility());
        Dog dog2 = new Dog("Dash", "Jack", 4, 410);
        PawesomeUtils.checkIn(dog2, "Jack");
        System.out.println(dog2.isStillInFacility());
        System.out.println(dog2.getOwnerName());
        System.out.println(PawesomeUtils.validateDogId(67));
        System.out.println(PawesomeUtils.validateDogTag(myDog));
        myDog.setDogId(222);
        System.out.println(PawesomeUtils.validateDogTag(myDog));
        System.out.println(PawesomeUtils.convertAgeToHumanAge(dog1));
        System.out.println(PawesomeUtils.convertAgeToHumanAge(dog2));
        System.out.println(PawesomeUtils.convertAgeToHumanAge(myDog));
        System.out.println(PawesomeUtils.convertAgeToDogYears(3));
        System.out.println(PawesomeUtils.convertAgeToDogYears(67));
        System.out.println(PawesomeUtils.convertAgeToDogYears(49));
    }
}
