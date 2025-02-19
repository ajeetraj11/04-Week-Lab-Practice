package annoations.customserialzationannotationtest;

import com.annotations.customserializationannotation.User;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class JsonSerializationTest {

    @Test
    void testJsonSerialization() {
        // Creating a test user
        User user = new User("ajeet_110", "ajeetraj110920@gmail.com");

        // Generating JSON output
        String jsonOutput = user.toJson().replaceAll("\\s+", "");

        // Expected JSON in a normalized format
        String expectedJson1 = "{user_name:ajeet_110,email_id:ajeetraj110920@gmail.com}";
        String expectedJson2 = "{email_id:ajeetraj110920@gmail.com,user_name:ajeet_110}";

        // Checking if JSON output matches either expected order
        assertTrue(jsonOutput.equals(expectedJson1) || jsonOutput.equals(expectedJson2),
                "JSON Output does not match expected format: " + jsonOutput);
    }
}
