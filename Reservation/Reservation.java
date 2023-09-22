import java.util.Scanner;

public class ReservationSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String trainNumber, classType = "", dateOfJourney="", source="", destination="";

        System.out.println("Reservation System");
        System.out.print("Enter Train Number: ");
        trainNumber = scanner.nextLine();
    
        insertReservationData(trainNumber, classType, dateOfJourney, source, destination);

        System.out.println("Reservation successful!");
    }

    private static void insertReservationData(String trainNumber, String classType, String dateOfJourney, String source, String destination) {
        
    }
}
