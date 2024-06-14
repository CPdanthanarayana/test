import java.util.Scanner;

public class PasswordValidator {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        System.out.println("Enter your password!");
        String password = inp.next();
        if (isValidPassword(password)) {
            System.out.println("Password is valid");
        } else {
            System.out.println("Password is invalid");
        }
    }

    public static boolean isValidPassword(String password) {

        if (password.length() < 8) {
            return false;
        }

        for (int i = 0; i < password.length(); i++) {
            char ch = password.charAt(i);
            if (!Character.isLetterOrDigit(ch)) {
                return false;
            }
        }


        int digitCount = 0;
        for (int i = 0; i < password.length(); i++) {
            char ch = password.charAt(i);
            if (Character.isDigit(ch)) {
                digitCount++;
            }
        }
        if (digitCount < 2) {
            return false;
        }

        return true;
    }
}




