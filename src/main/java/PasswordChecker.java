import java.util.Scanner;

public class PasswordChecker {


       static boolean passwordExist = true;
       static boolean passwordCharLength = true;
       static boolean passwordLowerCase = true;
       static boolean passwordUpperCase = true;
       static boolean passwordOneDigit = true;
       static boolean passwordOneSpecialChar = true;


    public static String passwordIsValid(String password) {


        if (password.isEmpty()){
                passwordExist = false;
                return ("password should exist");
        }


        if (password.length() < 8){
                 passwordCharLength = false;
                return("password should be longer than 8 characters");
        }


        if (!password.matches((".*[A-Z].*"))){
                 passwordUpperCase = true;
                 return ("password should have at least one uppercase letter");
        }

        if (!password.matches((".*[a-z].*"))){
                passwordLowerCase = false;
                 return "password should have at least one lowercase letter";
        }


        if (!password.matches((".*[\\d].*"))){
                 passwordOneDigit = false;
                 return ("password should have at least one digit");
        }


        if (!password.matches((".*[-!@#$%^&*(){}_\"'\\\\;|?/.>,<:].*"))){
                passwordOneSpecialChar = false;
                return ("password should have at least one special character");
        }


        return password;
    }


    public static  boolean passwordIsOk(String password){


        boolean passwordIsOkChecker;


            if(password.length() < 8 && password.isEmpty() &&!password.matches((".*[A-Z].*")) ||
                    !password.matches((".*[a-z].*")) || !password.matches((".*[\\d].*")) ||
                    !password.matches((".*[-!@#$%^&*(){}_\"'\\\\;|?/.>,<:].*"))){
                passwordIsOkChecker = false;
                System.out.println("Password not ok!");
            }
            else{
                passwordIsOkChecker = true;
                System.out.println("password is ok!");
            }
        return passwordIsOkChecker;
        }


    public static boolean passwordIsNeverOk(String password) {

        if (!(password.length() >= 8)) {
            if (password.isEmpty()) {
                System.out.println("Empty passwords are invalid!");
            }
            System.out.println("Password must be 8 characters long!");
            return false;
        }
        else {
            return true;
        }
    }

        public static void main(String[] args) {

            System.out.println("Please note that your password: " +
                    "\n " + "1. Shouldn't be empty." +
                    "\n 2. Must be longer than 8 characters." +
                    "\n 3. Must contain at least one UPPERCASE & lowercase letter." +
                    "\n 4. Should have At least one digit." +
                    "\n 5. Should have  A special character.");

            System.out.println(" ");

            Scanner input = new Scanner(System.in);

            System.out.println("Please enter your password");


            String userPassword = input.nextLine();


            try {
                 System.out.println(passwordIsValid(userPassword));
                 System.out.println(passwordIsOk(userPassword));
                 System.out.println(passwordIsNeverOk(userPassword));
             }
            catch (Exception e){
                System.out.println(e.getMessage());
            }
        }
    }
