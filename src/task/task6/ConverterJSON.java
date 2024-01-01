package task.task6;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;


import java.util.ArrayList;
import java.util.List;

public class ConverterJSON {
    public static void main(String[] args) throws JsonProcessingException {
        //Create a class 'ObjectMapper' for converting some object or array
        ObjectMapper mapper = new ObjectMapper();

        Student roma = new Student("Pravnyk",3,new PersonalInformation(20,"0666790166","Sarny"));
        Student dima = new Student("Krasnogor",2,new PersonalInformation(20,null,"Krakiv"));
        Student christina = new Student("Bluzniuk",1,new PersonalInformation(0,null,null));

        List<Student> students = new ArrayList<>();
        students.add(roma);
        students.add(dima);
        students.add(christina);

        //Create some fields for saving new json value
        String jsonTypeArray = mapper.writeValueAsString(students);
        String jsonTypeObject = mapper.writeValueAsString(roma);

        System.out.println("*****************************************************");
        System.out.println("Converted array to JSON format: ");
        System.out.println("ARRAY: "+jsonTypeArray);
        System.out.println("OBJECT: "+jsonTypeObject);
        System.out.println("*****************************************************\n");

        //Back to object format from JSON format
        System.out.println("*****************************************************");
        List<Student> ordinaryTypeArray = mapper.readValue(jsonTypeArray,new ArrayList<>().getClass());
        System.out.println("Object format array: ");
        System.out.println(ordinaryTypeArray);
        System.out.println("*****************************************************\n");

        System.out.println("*****************************************************");
        System.out.println("Object format object: ");
        Student ordinaryTypeObject = mapper.readValue(jsonTypeObject, Student.class);
        System.out.println(ordinaryTypeObject);
        System.out.println("*****************************************************\n\n\n\n");


    }
}
