package regex.replacemultiplespacewithsinglespacetest;

import static org.junit.jupiter.api.Assertions.*;

import com.regex.replacemultiplespaceswithsinglespace.SpaceReducer;
import org.junit.jupiter.api.Test;
import java.util.List;
import java.util.Arrays;

public class SpaceReducerTest {

    @Test
    void testReplaceMultipleSpaces() {
        // List of test cases with input strings containing extra spaces
        List<String> inputTexts = Arrays.asList(
                "This    is   an    example  with  multiple   spaces."
        );

        // Expected output after reducing multiple spaces
        List<String> expectedOutputs = Arrays.asList(
                "This is an example with multiple spaces."
        );

        // Checking if the transformed output matches the expected result
        for (int i = 0; i < inputTexts.size(); i++) {
            assertEquals(expectedOutputs.get(i), SpaceReducer.replaceMultipleSpaces(inputTexts.get(i)), "Failed for input: '" + inputTexts.get(i) + "'");
        }

        System.out.println("All test case success fully passed");
    }
}
