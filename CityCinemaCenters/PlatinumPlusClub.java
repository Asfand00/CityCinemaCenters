package CityCinemaCenters;

/**
 * This Class is an extension of PlatinumPlusClub
 *
 * @author Asfandyar Tanwer
 * @version 1.0
 */
public class PlatinumPlusClub extends PlatinumClub {

    /**
     * This is the constructor for PlatinumPlusClub
     *
     * @param ticketPrice the price of the ticket (same as PlatinumClub)
     */
    public PlatinumPlusClub(double ticketPrice) {
        super(ticketPrice);
    }

    /**
     * This method is the getter for yearlyFee
     *
     * @return the yearly fee for PlatinumPlusClub
     */
    public double getYearlyFee() {
        return super.getYearlyFee() + 10.0;
    }

    /**
     * this method gets the free pass count for the club
     *
     * @return the free passes for PlatinumPlusClub
     */
    public int getFreePassCount() {
        return 3;
    }

    /**
     * This method overrides the toString() method in Object.java for this class
     * displays club information for PlatinumPlusClub
     *
     * @return String class name + ticket price + benefits + yearly fee
     * + free pass count
     */
    public String toString() {
        return "Class Name: " + getClass().getSimpleName() + "\n"
                + "TicketPrice: $" + super.getTicketPrice() + "\n"
                + "Benefits: " + super.getBenefits() + "\n"
                + "Yearly Fee: $" + getYearlyFee() + "\n"
                + "Free Pass Count: " + getFreePassCount() + "\n";
    }
}
