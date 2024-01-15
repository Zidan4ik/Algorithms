package task.task6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static task.task6.Converter.toConvertJSON;

public class Starter {
    public static void main(String[] args) throws IllegalAccessException {

        Student roma = new Student("Pravnyk", 3, new PersonalInformation(20, "0666790166", "Sarny"),true,4.5, new int[]{1, 2, 3});
        Student sasha = new Student("Volodko", 3, new PersonalInformation(21, "0231555313", "Rivne"),false,0,null);


        String jsonRoma = toConvertJSON(roma);
        Student[] students = new Student[]{roma, sasha};

        String jsonStudents = toConvertJSON(students);


        System.out.println("\n\n\t\t\t***Working JSON CONVERTER***");
        System.out.println("*****************************************************");
        System.out.println("Object output: \n"+roma);
        System.out.println("JSON output: \n"+jsonRoma);
        System.out.println("*****************************************************\n");
        System.out.println();
        System.out.println("*****************************************************");
        System.out.println("Array output: \n"+ Arrays.toString(students));
        System.out.println("JSON output: \n"+jsonStudents);
        System.out.println("*****************************************************\n");
        System.out.println();


        List<Student> friends = new ArrayList<>();
        friends.add(roma);
        friends.add(sasha);

//        Map<Student,String> map = new HashMap<>();
//        map.put(roma,"1");
//        map.put(sasha,"2");


        Student christina = new Student("Protsyk", 2, new PersonalInformation(18, "0839294915", "Lviv"),true,4,friends);

        System.out.println("*****************************************************");
        System.out.println("Object output: \n"+christina);
        System.out.println("JSON output: \n"+toConvertJSON(christina));
        System.out.println("*****************************************************\n");
    }
}
