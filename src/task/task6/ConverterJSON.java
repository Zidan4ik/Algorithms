package task.task6;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ConverterJSON {
    public static void main(String[] args) throws JsonProcessingException {
        ObjectMapper mapper = new ObjectMapper();
        Student roma = new Student("Roma","Pravnyk",20,3);
        Student dima = new Student("Dima","Krasnogor",20,2);
        Student christina = new Student("Christyna","Bluzniuk",19,3);

        String jsonType = mapper.writeValueAsString(roma);
        System.out.println(jsonType);

        List<Student> students = new ArrayList<>();
        students.add(roma);
        students.add(dima);
        students.add(christina);

        String arrayJSONType = mapper.writeValueAsString(students);
        System.out.println(arrayJSONType);
        System.out.println();

        List<Student> arrayAfterJSONType = mapper.readValue(arrayJSONType, new ArrayList<>().getClass());
        System.out.println(arrayAfterJSONType);
    }
}
