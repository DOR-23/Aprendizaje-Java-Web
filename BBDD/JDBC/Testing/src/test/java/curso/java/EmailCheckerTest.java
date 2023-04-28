package curso.java;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;

public class EmailCheckerTest {

    @Test
     void isValidEmail_True(){
        EmailChecker emailChecker = new EmailChecker();
        boolean result = emailChecker.isValidEmail("diego@gmail.com");

        Assertions.assertTrue(result);

    }

    @Test
    void isValidEmail_False(){
        EmailChecker emailChecker = new EmailChecker();
        boolean result = emailChecker.isValidEmail("diego : gmail.com");

        assertFalse(result);
    }
}
