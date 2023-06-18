package ExceptionHandling;

import java.util.Scanner;

class InvalidCredentialsException extends Exception {
    public InvalidCredentialsException(String message) {
        super(message);
    }
}

class Authentication {
    public static void authenticate(String username, String password) throws InvalidCredentialsException{
        if(username.length() < 6) {
            throw new InvalidCredentialsException("Username should be at least be 6 characters");
        }
        if(!password.equals("password")) {
            throw new InvalidCredentialsException("Passwords do not match");
        }
        System.out.println("Authentication Successful");
    }
}

public class AuthenticationTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter username: ");
        String username = sc.nextLine();

        System.out.println("Enter password: ");
        String password = sc.nextLine();

        try {
            Authentication.authenticate(username, password);
        } catch(InvalidCredentialsException e) {
            System.out.println("Exception: " + e.getMessage());
        } finally {
            System.out.println("Program execution completed");
        }
    }
}
