package CityCinemaCenters;

/**
 * This is the main class and method for the CityCinemaCenters assignment
 * Each MovieClub is displayed below
 *
 * @author Asfandyar Tanwer
 * @version 1.0
 */
public class Main {

    public static void main(String[] args) {

        // instantiate clubs in array
        MovieClub[] clubs = {
                new SeniorClub(10.00),
                new GoldClub(10.00),
                new PlatinumClub(10.00),
                new PlatinumPlusClub(10.00)
        };

        // display each club using toString method
        int i;
        for (i = 0; i < clubs.length; i++) {
            System.out.println(clubs[i]);
        }
    }
}
