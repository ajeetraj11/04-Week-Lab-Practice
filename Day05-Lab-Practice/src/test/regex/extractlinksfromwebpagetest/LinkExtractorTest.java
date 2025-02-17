package regex.extractlinksfromwebpagetest;

import static org.junit.jupiter.api.Assertions.*;

import com.regex.extractlinksfromwebpage.LinkExtractor;
import org.junit.jupiter.api.Test;
import java.util.List;

class LinkExtractorTest {

    @Test
    void testExtractLinks() {
        // Input text containing URLs
        String text = "Check https://www.ajeetraj.com and http://raj.org for resources.";

        // Expected output list
        List<String> expected = List.of("https://www.ajeetraj.com", "http://raj.org");

        // Actual result from the method
        List<String> actual = LinkExtractor.extractLinks(text);

        // Checking if the extracted list matches the expected list
        assertEquals(expected, actual, "Extracted URLs not matching the expected ones.");

        System.out.println("Test passed successfully.");
    }
}
