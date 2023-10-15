package CityCinemaCenters;

/**
 * This Class is an abstract class and the parent/super class
 * for the other subclass clubs in this folder
 *
 * @author Asfandyar Tanwer
 * @version 1.0
 */
public abstract class MovieClub {

    private double ticketPrice; // standard ticket price for club

    private String benefits; // benefits for the club

    private double yearlyFee; // yearly fee for that club

    /**
     * This is the constructor for MovieClub
     *
     * @param ticketPrice the standard price of the ticket
     */
    public MovieClub(double ticketPrice) {
        this.ticketPrice = ticketPrice;
    }

    /**
     * This method is the getter for ticketPrice
     *
     * @return ticket price for the club
     */
    public double getTicketPrice() {
        return ticketPrice;
    }

    /**
     * This method is the getter for benefits
     *
     * @return benefits for the club
     */
    public String getBenefits() {
        return benefits;
    }

    /**
     * This method is the getter for yearlyFee
     *
     * @return the yearly fee for the club
     */
    public double getYearlyFee() {
        return yearlyFee;
    }

    /**
     * This method sets a new standard ticketPrice - the setter
     *
     * @param ticketPrice the price of the ticket
     */
    public void setTicketPrice(double ticketPrice) {
        this.ticketPrice = ticketPrice;
    }

    /**
     * This method sets a new benefits - the setter
     *
     * @param benefits the benefits for the club
     */
    public void setBenefits(String benefits) {
        this.benefits = benefits;
    }
    /**
     * This method sets a new yearly fee - the setter
     *
     * @param yearlyFee the yearly fee for the club
     */
    public void setYearlyFee(double yearlyFee) {
        this.yearlyFee = yearlyFee;
    }

    /**
     * this abstract method counts the number of free passes for a
     * club. Implementation in other club subclasses
     *
     * @return the free passes for said club
     */
    public abstract int getFreePassCount();

    /**
     * This method overrides the toString() method in Object.java for this class
     * displays club information
     *
     * @return String class name + ticket price + benefits
     */
    public String toString() {
        return "Class Name: " + getClass().getSimpleName() + "\n"
                + "TicketPrice: $" + getTicketPrice() + "\n"
                + "Benefits: " + getBenefits() + "\n";
    }

}
