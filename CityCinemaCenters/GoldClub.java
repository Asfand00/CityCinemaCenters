package CityCinemaCenters;

/**
 * This Class is an extension of MovieClub
 *
 * @author Asfandyar Tanwer
 * @version 1.0
 */
public class GoldClub extends MovieClub {

    /**
     * This is the constructor for GoldClub
     *
     * @param ticketPrice the price of the ticket
     */
    public GoldClub(double ticketPrice) {
        super(ticketPrice);
    }

    /**
     * This method is the getter for ticketPrice
     *
     * @return ticket price for GoldClub (%90 of standard ticket price)
     */
    @Override
    public double getTicketPrice() {
        super.setTicketPrice(super.getTicketPrice() * 0.90);
        return super.getTicketPrice();
    }

    /**
     * This method is the getter for benefits
     *
     * @return benefits for GoldClub
     */
    @Override
    public String getBenefits() {
        super.setBenefits("Free soda refill");
        return super.getBenefits();
    }

    /**
     * This method is the getter for yearlyFee
     *
     * @return the yearly fee for GoldClub
     */
    @Override
    public double getYearlyFee() {
        super.setYearlyFee(15.00);
        return super.getYearlyFee();
    }

    /**
     * this method gets the free pass count for the club
     *
     * @return the free passes for GoldClub
     */
    public int getFreePassCount() {
        return 0;
    }

    /**
     * This method overrides the toString() method in Object.java for this class
     * displays club information for GoldClub
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
