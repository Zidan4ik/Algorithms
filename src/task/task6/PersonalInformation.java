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
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "PersonalInformation{" +
                "age=" + age +
                ", phone='" + phone + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
