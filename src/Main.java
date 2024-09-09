import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
        public static boolean validateName(String name) {
            String nameRegex = "^[A-Z][a-zA-Z]{2,}$";  // Start with a capital letter and has at least 3 characters
            Pattern pattern = Pattern.compile(nameRegex);
            Matcher matcher = pattern.matcher(name);
            return matcher.matches();
        }

    public static boolean validateEmail(String email) {
        String emailRegex = "^[a-zA-Z0-9]+([._][a-zA-Z0-9]+)*@[a-zA-Z0-9]+\\.[a-zA-Z]{2,}(\\.[a-zA-Z]{2,})?$";
        Pattern pattern = Pattern.compile(emailRegex);
        Matcher matcher = pattern.matcher(email);
        return matcher.matches();
    }
    public static void main(String[] args) {
        String firstName = "John";
        String lastName = "Doe";
        String email = "abc.xyz@bl.co.in";
        String mobile = "91 9919819801";
        String password = "Password@123";
        if (validateName(firstName)) {
            System.out.println("First Name is valid.");
        } else {
            System.out.println("First Name is invalid.");
        }

        if (validateName(lastName)) {
            System.out.println("Last Name is valid.");
        } else {
            System.out.println("Last Name is invalid.");
        }

        if (validateEmail(email)) {
            System.out.println("Email is valid.");
        } else {
            System.out.println("Email is invalid.");
        }

    }
}