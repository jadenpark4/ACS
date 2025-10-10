public class DogTester {
    public static void main(String[] args) {
        Dog dog1 = new Dog("Spot", "Sandra", 7, 123);
        System.out.println(dog1.toString());
        System.out.println(PawesomeUtils.generateDogChar(123));
        Dog myDog = new Dog("Jim", "Maria", 7, 670);
        System.out.println(PawesomeUtils.pickup(myDog, "Maria"));
        System.out.println(PawesomeUtils.pickup(myDog, "John"));
        System.out.println(myDog.isStillInFacility());
        Dog dog2 = new Dog("Dash", "Jack", 6, 410);
        PawesomeUtils.checkIn(dog2, "Jack");
        System.out.println(dog2.isStillInFacility());
        System.out.println(dog2.getOwnerName());
        System.out.println(PawesomeUtils.validateDogId(67));
        System.out.println(PawesomeUtils.validateDogTag(myDog));
        myDog.setDogId(222);
        System.out.println(PawesomeUtils.validateDogTag(myDog));
    }
}
