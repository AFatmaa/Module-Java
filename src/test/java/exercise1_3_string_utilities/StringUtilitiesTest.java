package exercise1_3_string_utilities;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Tests the behavior of the {@link StringUtilities} class.
 *
 * @see StringUtilities
 */
public class StringUtilitiesTest {
    private StringUtilities stringUtilities;

    /**
     * Creates a new StringUtilities instance before each test.
     */
    @BeforeEach
    void setUp() {
        stringUtilities = new StringUtilities();
    }

    /**
     * Verifies that a palindrome returns true.
     *
     * @see StringUtilities#isPalindrome(String)
     */
    @Test
    void testIsPalindromeReturnsTrueForPalindrome() {
        boolean result = stringUtilities.isPalindrome("level");
        assertTrue(result);
    }

    /**
     * Verifies that a non-palindrome returns false.
     *
     * @see StringUtilities#isPalindrome(String)
     */
    @Test
    void testIsPalindromeReturnsFalseForNonPalindrome() {
        boolean result = stringUtilities.isPalindrome("java");
        assertFalse(result);
    }

    /**
     * Verifies that a single character is treated as a palindrome.
     *
     * @see StringUtilities#isPalindrome(String)
     */
    @Test
    void testIsPalindromeReturnsTrueForSingleCharacter() {
        boolean result = stringUtilities.isPalindrome("a");

        assertTrue(result);
    }

    /**
     * Verifies that a comma-separated string is split into separate values.
     *
     * @see StringUtilities#splitCommaSeparatedLine(String)
     */
    @Test
    void testSplitCommaSeparatedLine() {
        List<String> result = stringUtilities.splitCommaSeparatedLine("apple,banana,orange");

        assertEquals(List.of("apple", "banana", "orange"), result);
    }

    /**
     * Verifies that a string without commas produces a single-value list.
     *
     * @see StringUtilities#splitCommaSeparatedLine(String)
     */
    @Test
    void testSplitCommaSeparatedLineWithSingleValue() {
        List<String> result =
                stringUtilities.splitCommaSeparatedLine("apple");

        assertEquals(List.of("apple"), result);
    }
}
