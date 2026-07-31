package exercise2_data_structures;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        String[] firstNames = {
                "Anuket",
                "Eryn",
                "Filip",
                "Raquel",
                "Eryn",
                "Maya",
                "Mila"
        };

        String[] lastNames = {
                "Hassan",
                "Doe",
                "Pappas",
                "Clarke",
                "Jones",
                "Brown",
                "Brown"
        };

        int[] grades = {
                22,
                45,
                35,
                22,
                41,
                38,
                42
        };

        StudentDataService studentDataService = new StudentDataService(firstNames, lastNames, grades);

        List<String> names = studentDataService.getFirstNames();

        System.out.println("First names: " + names);

        Set<String> distinctNames = studentDataService.getDistinctFirstNames();

        System.out.println("Distinct first names: " + distinctNames);

        Set<String> sortedNames = studentDataService.getDistinctFirstNamesInAlphabeticalOrder();

        System.out.println("Distinct first names in alphabetical order: " + sortedNames);

        Map<String, Integer> lastNameToGrade = studentDataService.getLastNameToGrade();

        System.out.println("Last names with grades: " + lastNameToGrade);

        Map<Student, Integer> studentToGrade = studentDataService.getStudentToGrade();

        System.out.println("Students with grades: " + studentToGrade    );
    }
}
