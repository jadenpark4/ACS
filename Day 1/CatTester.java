public class CatTester {
    public static void main(String[] args) {
        Cat cat1 = new Cat("Tom", "Sully", 6, "2333A");
        Cat cat2 = new Cat("Tom", "Sully", 6, "2333A");
        PurrfectUtils.trimClaws(cat1);
        PurrfectUtils.trimClaws(cat2);
        PurrfectUtils.pet(cat2);
        System.out.println(cat2.toString());
        PurrfectUtils.cleanLitterBox(cat1);
        PurrfectUtils.feed(cat1);
    }
}
