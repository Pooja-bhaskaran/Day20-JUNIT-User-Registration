import com.Bridgelabz.UserRegistration;
import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.assertTrue;

// naming convention for method => given when then

public class UserRegistrationTest {
   public static UserRegistration userRegistration = new UserRegistration();

    @Test
    void givenFirstNameFirstCharacterUPPERCASE_WhenProper_ShouldReturnTrue(){
        boolean result = userRegistration.validateFirstName("Pooja");
        assertTrue(result);
    }

    @Test
    void givenLastNameFirstCharacterUPPERCASE_WhenProper_ShouldReturnTrue(){
        boolean result = userRegistration.validateLastName("Bhaskaran");
        assertTrue(result);
    }

    @Test
    void givenEmailId_WhenItsProper_shouldReturnTrue(){
        boolean result = userRegistration.validateEmailID("abc.xyz@bl.com.in");
        assertTrue(result);
    }
}
