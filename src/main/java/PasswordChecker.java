
public class PasswordChecker {
    static boolean existingPassword = true;
    static boolean passwordLength = true;
    static boolean lowerCase = true;
    static boolean upperCase = true;
    static boolean oneDigit = true;
    static boolean specialChar = true;

    public static boolean password_is_valid(String password) {

        if (password.isEmpty()) {
            existingPassword = false;
            System.out.println("password should exist");
        }

        if (password.length() < 8) {
            passwordLength = false;
                System.out.println("password should be longer than 8 characters");
        }

        if (!password.matches(".*[a-z].*")) {
            lowerCase = false;
            System.out.println("password should contain lowercase");
        }

        if (!password.matches( ".*[A-Z].*")) {
            upperCase = false;
            System.out.println("password should contain uppercase");
        }

        if (!password.matches(".*[0-9].*")) {
            oneDigit = false;
            System.out.println("password should contain  one digit");
        }
        if (!password.matches(".*[\" !\"#$%&'()*+,-./:;<=>?@\\^_`{|}~\"].*")) {

            specialChar = false;
            System.out.println("password should contain special character");
        }
    return lowerCase && specialChar && upperCase && passwordLength && oneDigit && existingPassword;
    }
}