import java.util.Scanner;

public class CancellationForm {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String pnrNumber;

        System.out.println("Cancellation Form");
        System.out.print("Enter your PNR Number: ");
        pnrNumber = scanner.nextLine();

        if (confirmCancellation(pnrNumber)) {
            System.out.println("Cancellation confirmed for PNR: " + pnrNumber);
        } else {
            System.out.println("Invalid PNR number. Cancellation failed.");
        }
    }

    private static boolean confirmCancellation(String pnrNumber) {
        // Implement logic to fetch and display information related to the PNR number
        // Ask the user for confirmation before canceling
        // Return true if the cancellation is confirmed
        return true; // Change this to your validation logic
    }
}
