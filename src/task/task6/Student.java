package task.task6;

public class Student {
    private String surname;
    private int course;
    private PersonalInformation information;

    public Student() {
    }

    public Student(String surname, int course, PersonalInformation information) {
        this.surname = surname;
        this.course = course;
        this.information = information;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    public PersonalInformation getInformation() {
        return information;
    }

    public void setInformation(PersonalInformation information) {
        this.information = information;
    }

    @Override
    public String toString() {
        return "Student2{" +
                "surname='" + surname + '\'' +
                ", course=" + course +
                ", information=" + information +
                '}';
    }
}
