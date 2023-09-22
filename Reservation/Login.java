import java.util.Scanner;

public class LoginForm {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String username, password;

        System.out.println("Welcome to the Online Reservation System");
        System.out.print("Enter your username: ");
        username = scanner.nextLine();
        System.out.print("Enter your password: ");
        password = scanner.nextLine();

        if (isValidUser(username, password)) {
            System.out.println("Login successful. Welcome, " + username + "!");
          
        } else {
            System.out.println("Invalid login credentials. Please try again.");
        }
    }

    private static boolean isValidUser(String username, String password) {
        return true; 
    }
}
