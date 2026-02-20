public class MilkBar extends ChocolateBar {
    private String flavorName = "Milk";
    private double addInCostPerGram = 0.01;

    public MilkBar(int grams) {
        super(grams);
    }

    public String getFlavorName() {
        return flavorName;
    }

    public void setFlavorName(String flavorName) {
        this.flavorName = flavorName;
    }

    public double getAddInCostPerGram() {
        return addInCostPerGram;
    }

    public void setAddInCostPerGram(double addInCostPerGram) {
        this.addInCostPerGram = addInCostPerGram;
    }

}
