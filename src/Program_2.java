import java.math.BigDecimal;
import java.util.Scanner;

public class Program_2 {
    public static void main(String[] args) {
        System.out.println("Welcome to MPLS Dog Boarding cost calculator, "
                + "this application will generate a summary of cost.\n");

        // Instantiate the Scanner
        Scanner sc = new Scanner(System.in);

        // Accepting a user input for all the dog values.
        System.out.print("Enter Dog name: ");
        String dogName = sc.nextLine();

        System.out.print("Enter Dog breed: ");
        String dogBreed = sc.nextLine();

        System.out.print("Enter number of days, *YOUR* dog will be in care: ");
        int numCareDays = sc.nextInt();

        System.out.print("Enter Dog age: ");
        int dogAge = sc.nextInt();

        System.out.print("Enter Doge weight: ");
        int dogWeight = sc.nextInt();

        // Initialize each of the variables so that we can
        // assign values later.
        String boardGroup = "";
        int dayCareFee = 0;
        double boardingCost = 0.0;

        // Now that dogWeight is created, we can assign the
        // value of dayCareFee based on it the dog's weight.
        if (dogWeight < 15) {
            dayCareFee = 45;
        } else if (dogWeight >= 15 && dogWeight <= 30) {
            dayCareFee = 65;
        } else if (dogWeight >= 31 && dogWeight <= 80) {
            dayCareFee = 85;
        } else if (dogWeight >= 81) {
            dayCareFee = 100;
        }

        // Make sure the dog is assigned the correct
        // group based on its age.
        if (dogAge == 0) {
            boardGroup = "BLUE";
        } else if (dogAge >= 1 && dogAge <= 4) {
            boardGroup = "ORANGE";
        } else if (dogAge == 5) {
            boardGroup = "RED";
        } else if (dogAge > 6 && dogAge < 15) {
            boardGroup = "GREEN";
        }
        // boardingCost is already initialized, but needs a value
        // stored. The values for dayCareFee and numCareDays are
        // multiplied.
        boardingCost = dayCareFee * numCareDays;

        // Calculation of the percentage discount
        if (boardingCost > 165.0){
            double discPercent = 2.0;
            double discAmount = (boardingCost * discPercent) / 100;
            boardingCost -= discAmount;
        }
        System.out.print("SUMMARY OF ESTIMATED COST \n");

        // For loop that prints out 31 "-"
        for (int i = 0; i < 31; ++i) {
            System.out.print("-");
        }
        // Similar to program 1, each statement uses the
        // declared variables in each statement.
        System.out.print("\n");
        System.out.println("Dog Name:       " + dogName);
        System.out.println("Dog Breed:      " + dogBreed);
        System.out.println("Dog Age:        " + dogAge);
        System.out.println("Boarding Group: " + boardGroup);
        System.out.println("Dog Weight:     " + dogWeight);
        System.out.println("Day(s) in care: " + numCareDays);

        // Applying the message for a case that boarding cost
        // is over $165.
        if (boardingCost > 165) {
            System.out.println("\nYou will receive a 2 percent discount");
        }
        System.out.println("Estimated Cost: $" + boardingCost);

        for (int i = 0; i < 31; ++i) {
            System.out.print("-");
        }
    }
}