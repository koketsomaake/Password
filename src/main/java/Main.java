import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("please enter password");
        String pass = input.nextLine();

        try {

            PasswordChecker.password_is_valid(pass);

            PasswordChecker.passwordIsOk(pass);
            System.out.println();

        } catch (Exception e) {

            System.out.println(e.getMessage());
        }

    }
}
