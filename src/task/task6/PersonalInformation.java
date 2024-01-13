package task.task6;

public class PersonalInformation {
    private int age;
    private String phone;
    private String address;
    public PersonalInformation() {}
    public PersonalInformation(int age, String phone, String address) {
        this.age = age;
        this.phone = phone;
        this.address = address;
    }
    @Override
    public String toString() {
        return "PersonalInformation{" +
                "age=" + age +
                ", phone=" + phone+
                ", address=" + address+
                '}';
    }
}
