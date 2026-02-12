public class AnimalTester {
    public static void main(String[] args) {
        Megalodon shark1 = new Megalodon(67, "Sharkie");
        System.out.println(shark1.attack("fish", 16));
        shark1.makeNoise();
    }
}
