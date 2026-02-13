import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Date;

public class StandardTicket extends Ticket {
    public StandardTicket(Date eventDate, int ticketCount) {
        super(eventDate, ticketCount);
        this.eventDate = super.eventDate;
        this.ticketCount = super.ticketCount;
    }

    public double getTotalPrice() {
        double base_overall = getBasePrice() * ticketCount;
        double final_overall = getTax() * base_overall;
        return final_overall;
    }

    public void printTicketType() {
        System.out.println("Ticket Type: Standard\n");
    }

    public void printPrice() {
        double totalPrice = getBasePrice() * getTax() * ticketCount;
        BigDecimal decimalFormatter = new BigDecimal(totalPrice).setScale(2, RoundingMode.HALF_UP); // rounds totalPrice
                                                                                                    // to 2 decimal
                                                                                                    // places, will be 1
                                                                                                    // decimal place if
                                                                                                    // last digit is 0
                                                                                                    // (i.e. 7.50 ->
                                                                                                    // 7.5)

        System.out.println("Ticket Price: $" + decimalFormatter.doubleValue()); // prints the price
    }

    public void printCancellationPolicy() {
        System.out.println("Can be canceled within 24 hours before the event. Cancellation fee applies.");
    }

    public void printTicketDetails() {

    }

    // KNOW WHAT @OVERRIDE MEANS
}
