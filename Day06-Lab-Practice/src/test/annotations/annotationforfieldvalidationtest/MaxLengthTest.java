package annoations.annotationforfieldvalidationtest;

import com.annotations.annotationforfieldvalidation.User;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class MaxLengthTest {

    @Test
    void testValidUsername() {
        // Should create a user without exceptions
        assertDoesNotThrow(() -> new User("AjeetRaj"));
    }

    @Test
    void testInvalidUsername() {
        // Should throw IllegalArgumentException due to exceeding max length
        Exception exception = assertThrows(IllegalArgumentException.class, 
            () -> new User("AjeetRaj110920"));
        
        assertEquals("Username exceeds max length of 10 characters", exception.getMessage());
    }
}
