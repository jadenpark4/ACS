import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Date;

public class MemberTicket extends Ticket {
    private static final double MEMBER_DISCOUNT = 0.25;
    private double totalPrice;

    public MemberTicket(Date eventDate, int ticketCount) {
        super(eventDate, ticketCount);
        this.eventDate = super.eventDate;
        this.ticketCount = super.ticketCount;
    }

    public double getTotalPrice() {
        double overall = getBasePrice() * ticketCount * getTax();
        double final_overall = overall * (1 - MEMBER_DISCOUNT);
        return final_overall;
    }

    public void printTicketType() {
        System.out.println("Ticket Type: Standard\n");
    }

    public void printMemberBenefits() {
        System.out.println("Includes access to special discounts and complimentary refreshments.");
    }
}
