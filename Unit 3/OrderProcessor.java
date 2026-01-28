public class OrderProcessor {

    // Decomposed this method, because it was performing multiple tasks at once,
    // making it much longer and harder to understand.
    public static OrderSummary processCustomerOrder(Item[] items, double taxRate) {
        double subtotal = calculateSubtotal(items);

        String[] expensiveItems = getPremiumItems(items);

        double tax = calculateTax(subtotal, taxRate);
        double total = calculateTotal(subtotal, tax);

        printSummary(subtotal, tax, total, expensiveItems.length);

        return new OrderSummary(total, subtotal, tax, expensiveItems);
    }

    // Created method that only focusses on calculating the subtotal of all items
    private static double calculateSubtotal(Item[] items) {
        double subtotal = 0;

        for (Item item : items) {
            double itemTotal = item.getPrice() * item.getQuantity();
            subtotal += itemTotal;
            printItemType(item);
        }

        return subtotal;
    }

    // Focus: Identifies and return premium (expensive) items
    private static String[] getPremiumItems(Item[] items) {
        String[] temp = new String[items.length];
        int count = 0;
        for (Item item : items) {
            if (item.getPrice() > 50.0) {
                temp[count] = item.getName();
                count++;
            }
        }
        String[] premiumItems = new String[count];
        for (int i = 0; i < count; i++) {
            premiumItems[i] = temp[i];
        }
        return premiumItems;
    }

    // Focus: Method that prints whether an item is premium or regular
    private static void printItemType(Item item) {
        if (item.getPrice() > 50.0) {
            System.out.println(item.getName() + " is a premium item at $" + item.getPrice());
        } else {
            System.out.println(item.getName() + " is a premium item at $" + item.getPrice());
        }
    }

    // Focus: Method that calculates tax
    private static double calculateTax(double subtotal, double taxRate) {
        if (subtotal > 0) {
            return subtotal * taxRate;
        }
        return 0.0;
    }

    // Focus: Method that calculates total cost
    private static double calculateTotal(double subtotal, double tax) {
        return subtotal + tax;
    }

    // Focus: Prints order summary
    private static void printSummary(double subtotal, double tax, double total, int premiumCount) {
        System.out.println("Subtotal: $" + subtotal);
        System.out.println("Tax: $" + tax);
        System.out.println("Total: $" + total);
        System.out.println("Number of premium items: " + premiumCount);
    }
}
