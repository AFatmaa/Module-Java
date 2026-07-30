package exercise2_data_structures;

import java.util.*;

/**
 * Converts student data from arrays into useful collection structures.
 */
public class StudentDataService {

    private final String[] firstNames;

    private final String[] lastNames;

    private final int[] grades;

    /**
     * Creates a student data service using the supplied student data.
     *
     * @param firstNames the students' first names
     * @param lastNames  the students' last names
     * @param grades     the students' grades
     */
    public StudentDataService(String[] firstNames, String[] lastNames, int[] grades) {
        this.firstNames = firstNames;
        this.lastNames = lastNames;
        this.grades = grades;
    }

    /**
     * Returns all first names, including duplicates.
     *
     * @return a list containing all first names
     */
    public List<String> getFirstNames() {
        List<String> names = new ArrayList<>();
        for (String firstName : firstNames) {
            names.add(firstName);
        }
        return names;
    }

    /**
     * Returns the distinct first names.
     *
     * @return a set containing each first name once
     */
    public Set<String> getDistinctFirstNames() {
        Set<String> distinctNames = new HashSet<>();

        for (String firstName : firstNames) {
            distinctNames.add(firstName);
        }
        return distinctNames;
    }

    /**
     * Returns the distinct first names in alphabetical order.
     *
     * @return a sorted set containing each first name once
     */
    public Set<String> getDistinctFirstNamesInAlphabeticalOrder() {
        return new TreeSet<>(Arrays.asList(firstNames));
    }

    /**
     * Maps each student's last name to their grade.
     *
     * @return a map of last names to grades
     */
    public Map<String, Integer> getLastNameToGrade() {
        Map<String, Integer> lastNameToGrade = new HashMap<>();

        for (int i = 0; i < lastNames.length; i++) {
            lastNameToGrade.put(lastNames[i], grades[i]);
        }

        return lastNameToGrade;
    }

}
