package exercise2_data_structures;

import java.util.*;

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

        System.out.println("Students with grades: " + studentToGrade);

        String newStudentFirstName = "Fatma";
        String newStudentLastName = "Arslantas";
        int newStudentGrade = 48;

        Student newStudent = new Student(newStudentFirstName, newStudentLastName);

        names.add(newStudentFirstName);
        distinctNames.add(newStudentFirstName);
        sortedNames.add(newStudentFirstName);

        lastNameToGrade.put(newStudentLastName, newStudentGrade);
        studentToGrade.put(newStudent, newStudentGrade);

        Student leavingStudent = new Student("Filip", "Pappas");

        names.remove("Filip");
        distinctNames.remove("Filip");
        sortedNames.remove("Filip");
        lastNameToGrade.remove("Pappas");
        studentToGrade.remove(leavingStudent);

        Student cheatingStudent = new Student("Eryn", "Doe");

        lastNameToGrade.put("Doe", 0);
        studentToGrade.put(cheatingStudent, 0);

        System.out.println("Final first names: " + names);
        System.out.println("Final distinct names: " + distinctNames);
        System.out.println("Final sorted names: " + sortedNames);
        System.out.println("Final last names with grades: " + lastNameToGrade);
        System.out.println("Final students with grades: " + studentToGrade);

        Integer highestGrade = Collections.max(studentToGrade.values());
        Integer lowestGrade = Collections.min(studentToGrade.values());

        System.out.println("Highest grade: " + highestGrade);
        System.out.println("Lowest grade: " + lowestGrade);

        Map.Entry<Student, Integer> highestGradeEntry =
                Collections.max(studentToGrade.entrySet(), Map.Entry.comparingByValue());

        Student highestGradeStudent = highestGradeEntry.getKey();

        System.out.println("Student with the highest grade: "
                + highestGradeStudent.getFirstName()
                + " "
                + highestGradeStudent.getLastName()
                + " - "
                + highestGradeEntry.getValue()
        );

        Set<String> duplicateNames = new HashSet<>(names);

        duplicateNames.removeIf(name -> Collections.frequency(names, name) == 1);

        System.out.println(
                "First names belonging to multiple students: "
                        + duplicateNames
        );
    }
}
