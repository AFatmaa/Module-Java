package exercise4_streams_and_optionals;

import java.util.Collection;
import java.util.Comparator;
import java.util.List;

public class NameFinder {

    /**
     * Prints names that start with the letter A, ignoring case.
     *
     * @param names the collection of names to check
     */
    public void printNamesStartingWithA(Collection<String> names) {
        names.stream()
                .filter(name -> name.toLowerCase().startsWith("a"))
                .forEach(name -> System.out.println(name));
    }

    /**
     * Returns names starting with a vowel, with their first letter capitalized
     * and sorted in descending alphabetical order.
     *
     * @param names the collection of names to process
     * @return the processed names in descending alphabetical order
     */
    public List<String> vowelNamesCapitalisedDescending(Collection<String> names) {
        return names.stream()
                .filter(name -> "aeiou".contains(name.substring(0, 1).toLowerCase()))
                .map(name -> name.substring(0, 1).toUpperCase() + name.substring(1))
                .sorted(Comparator.reverseOrder())
                .toList();
    }

    public static void main(String[] args) {
        NameFinder nameFinder = new NameFinder();

        nameFinder.printNamesStartingWithA(List.of("Antony", "John", "amy", "Ben", "Andrew"));

        List<String> result = nameFinder.vowelNamesCapitalisedDescending(List.of("Antony", "John", "amy", "Ben", "Dan", "Ian", "Andrew", "Peter", "Oliver"));

        System.out.println(result);

    }
}

