public class Inventory {
    private String itemName;
    private int quantity;
    private double price;

    public Inventory(String desiredItemName, int desiredQuantity, double desiredPrice) {
        this.itemName = desiredItemName;
        this.quantity = desiredQuantity;
        this.price = desiredPrice;
    }

    public String getItemName() {
        return itemName;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getPrice() {
        return price;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String toString() {
        return "Item: " + itemName + ", Quantity: " + quantity + ", Price: $" + price; // Item: Shrimp, Quantity: 300, Price: $12.99
    }

    public boolean equals(Inventory other) {
        if (this.itemName.equals(other.itemName) && this.quantity == other.quantity && this.price == other.price) {
            return true;
        } else {
            return false;
        }
    }

    public void raisePrice(double percentage) {
        if (percentage > 0 && percentage < 100) {
            price = (int) (((0.01 * percentage) * price) + price);
        } else {
            price = price + 0;
        }
    }

}
