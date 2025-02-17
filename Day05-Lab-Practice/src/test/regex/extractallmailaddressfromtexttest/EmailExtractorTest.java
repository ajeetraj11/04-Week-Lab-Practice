package regex.extractallmailaddressfromtexttest;

import static org.junit.jupiter.api.Assertions.*;

import com.regex.extractallemailaddressesfromtext.EmailExtractor;
import org.junit.jupiter.api.Test;
import java.util.List;

class EmailExtractorTest {

    @Test
    void testExtractEmails() {
        // Input text containing email addresses
        String text = "Contact me at ajeetraj@example.com and info@ajeet.org. " +
                      "You can also reach out at ajeet1122@domain.net.";

        // Expected extracted email list
        List<String> expected = List.of("ajeetraj@example.com", "info@ajeet.org", "ajeet1122@domain.net");

        // Actual result from the method
        List<String> actual = EmailExtractor.extractEmails(text);

        // Checking if extracted emails match the expected list
        assertEquals(expected, actual, "Extracted emails should match expected ones.");

        System.out.println("Successfully extracted emails: are " + actual);
    }


}
