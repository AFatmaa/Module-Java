package exercise1_3_string_utilities;

import java.util.List;
import java.util.Arrays;

/**
 * Provides utility methods for working with strings.
 */
public class StringUtilities {
    /**
     * Checks whether a string reads the same forwards and backwards.
     *
     * @param s the string to check
     * @return true if the string is a palindrome, otherwise false
     */
    public boolean isPalindrome(String s) {

        String reversed = new StringBuilder(s)
                .reverse()
                .toString();

        return s.equals(reversed);
    }

    /**
     * Splits a comma-separated string into a list of values.
     *
     * @param s the comma-separated string to split
     * @return a list containing the separated values
     */
    public List<String> splitCommaSeparatedLine(String s) {

        String[] parts = s.split(",");

        return Arrays.asList(parts);
    }
}
