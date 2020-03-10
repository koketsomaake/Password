import org.junit.Assert;
import org.junit.Test;

public class PasswordCheckerTest {
    @Test
    public void password_is_valid() {

        Assert.assertTrue("Km7872@mmc", PasswordChecker.password_is_valid("Km7872@mmc"));

    }
}