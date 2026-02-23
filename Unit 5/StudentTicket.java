import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Date;

public class StudentTicket extends StandardTicket {
    private static final double STUDENT_DISCOUNT = 0.50;

    public StudentTicket(Date eventDate, int ticketCount) {
        super(eventDate, ticketCount);
    }

    @Override
    public double getTotalPrice() {
        double standardTotal = super.getTotalPrice();
        return standardTotal * (1 - STUDENT_DISCOUNT);
    }

    @Override
    public void printTicketType() {
        System.out.println("Ticket Type: Student (Must Show ID)");
    }

    @Override
    public void printPrice() {
        double totalPrice = getBasePrice() * (1 + getTax()) * ticketCount;
        double discountedPrice = totalPrice * (1 - STUDENT_DISCOUNT);
        BigDecimal decimalFormatter = new BigDecimal(discountedPrice).setScale(2, RoundingMode.HALF_UP);
        System.out.println("Ticket Price: $" + decimalFormatter.doubleValue()); // prints the price
    }
}
