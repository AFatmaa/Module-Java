package exercise1_3_string_utilities;

import java.util.List;
import java.util.Arrays;

public class StringUtilities {
    public boolean isPalindrome(String s) {

        String reversed = new StringBuilder(s)
                .reverse()
                .toString();

        return s.equals(reversed);
    }

    public List<String> splitCommaSeparatedLine(String s) {

        String[] parts = s.split(",");

        return Arrays.asList(parts);
    }
}
