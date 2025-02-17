package regex.extractprogramminglanguagenamesfromtextest;

import static org.junit.jupiter.api.Assertions.*;

import com.regex.extractprogramminglanguagenamesfromtext.ProgrammingLanguageExtractor;
import org.junit.jupiter.api.Test;
import java.util.List;

class ProgrammingLanguageExtractorTest {

    @Test
    void testExtractLanguages() {
        // Input text containing programming languages
        String text = "I love Java, Python, and JavaScript, but I haven't tried Go yet.";

        // Expected output list
        List<String> expected = List.of("Java", "Python", "JavaScript", "Go");

        // Actual result from the method
        List<String> actual = ProgrammingLanguageExtractor.extractLanguages(text);

        // Checking if the extracted list matches the expected list
        assertEquals(expected, actual, "Extracted programming languages should match the expected ones.");

        System.out.println("All tests passed! successfully extracted programming languages from the text.");
    }
}
