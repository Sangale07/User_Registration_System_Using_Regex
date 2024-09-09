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

    public static boolean validateMobileNumber(String mobile) {
        String mobileRegex = "^[0-9]{2}\\s[0-9]{10}$";
        Pattern pattern = Pattern.compile(mobileRegex);
        Matcher matcher = pattern.matcher(mobile);
        return matcher.matches();
    }
    public static boolean validatePasswordLength(String password) {
        return password.length() >= 8;
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

        if (validateMobileNumber(mobile)) {
            System.out.println("Mobile Number is valid.");
        } else {
            System.out.println("Mobile Number is invalid.");
        }


        if (validatePasswordLength(password)) {
            System.out.println("Password length is valid.");
        } else {
            System.out.println("Password length is invalid. It must be at least 8 characters.");
        }

    }
}