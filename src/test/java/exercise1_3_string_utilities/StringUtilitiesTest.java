package exercise1_3_string_utilities;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class StringUtilitiesTest {
    private StringUtilities stringUtilities;

    @BeforeEach
    void setUp() {
        stringUtilities = new StringUtilities();
    }

    @Test
    void testIsPalindromeReturnsTrueForPalindrome() {
        boolean result = stringUtilities.isPalindrome("level");
        assertTrue(result);
    }

    @Test
    void testIsPalindromeReturnsFalseForNonPalindrome() {
        boolean result = stringUtilities.isPalindrome("java");
        assertFalse(result);
    }

    @Test
    void testIsPalindromeReturnsTrueForSingleCharacter() {
        boolean result = stringUtilities.isPalindrome("a");

        assertTrue(result);
    }

    @Test
    void testSplitCommaSeparatedLine() {
        List<String> result = stringUtilities.splitCommaSeparatedLine("apple,banana,orange");

        assertEquals(List.of("apple", "banana", "orange"), result);
    }

    @Test
    void testSplitCommaSeparatedLineWithSingleValue() {
        List<String> result =
                stringUtilities.splitCommaSeparatedLine("apple");

        assertEquals(List.of("apple"), result);
    }
}
