package CityCinemaCenters;

/**
 * This Class is an extension of MovieClub
 *
 * @author Asfandyar Tanwer
 * @version 1.0
 */
public class SeniorClub extends MovieClub {

    /**
     * This is the constructor for SeniorClub
     *
     * @param ticketPrice the price of the ticket
     */
    public SeniorClub(double ticketPrice) {
        super(ticketPrice);
    }

    /**
     * This method is the getter for ticketPrice
     *
     * @return ticket price for SeniorClub (%50 of standard ticket price)
     */
    @Override
    public double getTicketPrice() {
        super.setTicketPrice(super.getTicketPrice() * 0.50);
        return super.getTicketPrice();
    }

    /**
     * This method is the getter for benefits
     *
     * @return benefits for the SeniorClub
     */
    @Override
    public String getBenefits() {
        super.setBenefits("Free child-sized popcorn & soda");
        return super.getBenefits();
    }

    /**
     * This method is the getter for yearlyFee
     *
     * @return the yearly fee for SeniorClub
     */
    @Override
    public double getYearlyFee() {
        super.setYearlyFee(5.00);
        return super.getYearlyFee();
    }

    /**
     * this method gets the free pass count for the club
     *
     * @return the free passes for SeniorClub
     */
    public int getFreePassCount() {
        return 0;
    }

    /**
     * This method overrides the toString() method in Object.java for this class
     * displays club information for SeniorClub
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

