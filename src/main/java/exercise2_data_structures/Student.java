package exercise2_data_structures;

import java.util.Objects;

/**
 * Represents a student with a first name and last name.
 */
public class Student {
    private final String firstName;
    private final String lastName;

    /**
     * Creates a student with the supplied name.
     *
     * @param firstName the student's first name
     * @param lastName  the student's last name
     */
    public Student(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    /**
     * Returns the student's first name.
     *
     * @return the student's first name
     */
    public String getFirstName() { return firstName; }

    /**
     * Returns the student's last name.
     *
     * @return the student's last name
     */
    public String getLastName() {
        return lastName;
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }

        if (object == null || getClass() != object.getClass()) {
            return false;
        }

        Student student = (Student) object;

        return firstName.equals(student.firstName) && lastName.equals(student.lastName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName);
    }

    @Override
    public String toString() {
        return firstName + " " + lastName;
    }
}