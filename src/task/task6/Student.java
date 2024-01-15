package task.task6;

import java.util.Arrays;

public class Student {
    private String surname;
    private int course;
    private PersonalInformation information;
    private boolean isStudent;
    private double markA;
    private Object arr1;

    public Student() {
    }

    public Student(String surname, int course, PersonalInformation information, boolean isStudent, double markA, Object arr1) {
        this.surname = surname;
        this.course = course;
        this.information = information;
        this.isStudent = isStudent;
        this.markA = markA;
        this.arr1 = arr1;
    }

    private static String toArray(Object array) {
        if (array != null) {
            if (array.getClass().isArray()) {
                return Arrays.toString((int[]) array); //повертає рядкове представлення
            } else {
                return array.toString();
            }
        } else {
            return null;
        }
    }

    @Override
    public String toString() {
        return "Student{" +
                "surname=" + surname +
                ", course=" + course +
                ", information=" + information +
                ", isStudent=" + isStudent +
                ", averageMark=" + markA +
                ", arr1=" + toArray(arr1) +
                '}';
    }
}
