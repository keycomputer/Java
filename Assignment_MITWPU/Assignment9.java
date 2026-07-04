import java.util.Scanner;

class AuthenticationException extends Exception {
    AuthenticationException(String message) {
        super(message);
    }
}

public class Assignment9 {

    // Method using throws
    static void checkPassword(String password) throws AuthenticationException {
        String correctPassword = "admin123";

        if (!password.equals(correctPassword)) {
            throw new AuthenticationException("Authentication Failure!");
        } else {
            System.out.println("Authentication Successful.");
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Password: ");
        String pass = sc.nextLine();

        try {
            checkPassword(pass);
        } catch (AuthenticationException e) {
            System.out.println(e.getMessage());
        }

        sc.close();
    }
}