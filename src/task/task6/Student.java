package task.task6;

import java.util.Arrays;

public class Student {
    private String surname;
    private int course;
    private PersonalInformation information;
    private Object arr1;

    public Student() {
    }

    public Student(String surname, int course, PersonalInformation information) {
        this.surname = surname;
        this.course = course;
        this.information = information;
    }

    public Student(String surname, int course, PersonalInformation information, Object arr) {
        this.surname = surname;
        this.course = course;
        this.information = information;
        this.arr1 = arr;
    }


    private static String toArray(Object array) {
        if (array != null) {
            if (array.getClass().isArray()) {
                return Arrays.toString((int[]) array);
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
                "surname='" + surname + '\'' +
                ", course=" + course +
                ", information=" + information +
                ", array=" + toArray(arr1) +
                '}';
    }
}
