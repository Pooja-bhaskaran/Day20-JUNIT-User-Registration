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
}
