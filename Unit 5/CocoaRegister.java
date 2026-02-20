import java.util.ArrayList;

public class CocoaRegister {

    public static final double TAX_RATE = 0.0875;

    private ArrayList<Sellable> items;
    private ArrayList<Integer> quantities;

    public CocoaRegister() {
        items = new ArrayList<>();
        quantities = new ArrayList<>();
    }

    public void addItem(Sellable item, int quantity) {
        // TODO:
        // - if item is null OR quantity <= 0, do nothing
        // - otherwise, add item and quantity to the parallel ArrayLists
        if (item == null || quantity <= 0) {

        }
        items.add(item);
        quantities.add(quantity);
    }

    public double getSubtotal() {
        // TODO:
        // sum item.getBasePrice() * quantity for all line items
        // return rounded to 2 decimals using ChocolateBar.round2(...)
        double sum = 0;
        for (int i = 0; i < items.size(); i++) {
            sum += items.get(i).getBasePrice() * quantities.get(i);
        }
        ChocolateBar.round2(sum);
        return sum;
    }

    public double getTax() {
        // TODO:
        // tax = subtotal * TAX_RATE, rounded to 2 decimals
        double tax = getSubtotal() * TAX_RATE;
        ChocolateBar.round2(tax);
        return tax;
    }

    public double getTotal() {
        // TODO:
        // total = subtotal + tax, rounded to 2 decimals
        double total = getSubtotal() + getTax();
        ChocolateBar.round2(total);
        return total;
    }

    public void printReceipt() {
        // TODO: Print EXACTLY the required receipt format.
        //
        // Hints:
        // - Header line: "== COCOA CORNER =="
        // - For each line item i:
        // (i+1) + ". " + name + " x" + qty + " @ $" + unit + " = $" + lineTotal
        // - Use ChocolateBar.money(...) for all currency formatting
        String receipt = "== COCOA CORNER ==\n";
        for (int i = 0; i < items.size(); i++) {
            receipt += (i + 1) + ". " + items.get(i).getName() + " x" + quantities.get(i) + " @ $"
                    + items.get(i).getBasePrice() + " = $"
                    + getTotal() + "\n";
        }
        System.out.println(receipt);

    }

}
