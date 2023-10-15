package CityCinemaCenters;

/**
 * This Class is an extension of MovieClub
 *
 * @author Asfandyar Tanwer
 * @version 1.0
 */
public class PlatinumClub extends MovieClub {

    /**
     * This is the constructor for PlatinumClub
     *
     * @param ticketPrice the price of the ticket
     */
    public PlatinumClub(double ticketPrice) {
        super(ticketPrice);
    }

    /**
     * This method is the getter for ticketPrice
     *
     * @return ticket price for PlatinumClub (%80 of standard ticket price)
     */
    @Override
    public double getTicketPrice() {
        super.setTicketPrice(super.getTicketPrice() * 0.80);
        return super.getTicketPrice();
    }

    /**
     * This method is the getter for benefits
     *
     * @return benefits for the PlatinumClub
     */
    @Override
    public String getBenefits() {
        super.setBenefits("Free soda and popcorn refill, buddy passes");
        return super.getBenefits();
    }

    /**
     * This method is the getter for yearlyFee
     *
     * @return the yearly fee for PlatinumClub
     */
    @Override
    public double getYearlyFee() {
        super.setYearlyFee(30.00);
        return super.getYearlyFee();
    }

    /**
     * this method gets the free pass count for the club
     *
     * @return the free passes for PlatinumClub
     */
    public int getFreePassCount() {
        return 1;
    }

    /**
     * This method overrides the toString() method in Object.java for this class
     * displays club information for PlatinumClub
     *
     * @return String class name + ticket price + benefits + yearly fee
     * + free pass count
     */
    @Override
    public String toString() {
        return "Class Name: " + getClass().getSimpleName() + "\n"
                + "TicketPrice: $" + getTicketPrice() + "\n"
                + "Benefits: " + getBenefits() + "\n"
                + "Yearly Fee: $" + getYearlyFee() + "\n"
                + "Free Pass Count: " + getFreePassCount() + "\n";
    }
}
