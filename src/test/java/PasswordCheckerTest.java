

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class PasswordCheckerTest {
    @Test
    public void  exisitingPassword()  {

    assertEquals("password should exist",PasswordChecker.passwordIsValid(""));
    }
@Test
    public  void passwordLength() {
        assertEquals("password should be longer than 8 characters",
                PasswordChecker.passwordIsValid("cskviro"));

    }
    @Test
    public  void upperCasePassword() {
        assertEquals("password should have at least one uppercase letter",
                PasswordChecker.passwordIsValid("bajsuieom"));
    }
    @Test
    public  void lowerCasePassword() {
        assertEquals("password should have at least one lowercase letter",
                PasswordChecker.passwordIsValid("BAJSUIEOM"));
    }
    @Test
    public  void digitPassword() {
        assertEquals("password should have at least one digit",
                PasswordChecker.passwordIsValid("oritjvnvG"));
    }@Test
    public  void passwordSpecialChar() {
        assertEquals("password should have at least one special character",
                PasswordChecker.passwordIsValid("Citjvmlsi8"));
    }
    @Test
    public  void passwordIsValid() {
        assertEquals("Password is valid!",
                PasswordChecker.passwordIsValid("ajroicndX4!"));
    }
    @Test
    public  void passwordIsOk() {
        assertEquals(true,
                PasswordChecker.passwordIsOk("ajroicndX4!"));
    }

    @Test
    public  void passwordIsNeverOk() {
        assertEquals(true,
                PasswordChecker.passwordIsOk("v24679SX"));
    }
}

