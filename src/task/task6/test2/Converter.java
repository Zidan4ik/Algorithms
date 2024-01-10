package task.task6.test2;

import task.task6.PersonalInformation;
import task.task6.Student;

import java.lang.reflect.Array;
import java.lang.reflect.Field;
import java.util.*;

public class Converter {
    public static String toConvertJSON(Object object) throws IllegalAccessException {
        if (object == null) {
            return null;
        }

        Class<?> c = object.getClass(); // store current class of object
        Field[] fields = c.getDeclaredFields(); // store declared fields from class of object
//parts of reflection, which allows you to get information about classes and their fields during program execution.
        Map<String, Object> map = new HashMap<>(); // create Map for saving keys and values

        StringBuilder sb = new StringBuilder();
        if (c.isArray()) {
            return arrayToJSON(object);
        }
        for (Field f : fields) {
            f.setAccessible(true); // set an accessible file with private
            map.put(f.getName(), f.get(object));
        }

        sb.append("{");
        for (Map.Entry m : map.entrySet()) {
            sb.append("\"" + m.getKey() + "\" : " + m.getValue() + ", ");
        }
        String sbString = sb.toString();

        return sbString.substring(0, sbString.length() - 2) + "}";
    }

    public static String arrayToJSON(Object object) throws IllegalAccessException {
        String s = "";
        String s2 = "";
        int length = Array.getLength(object);
        s2 += ("[");
        for (int i = 0; i < length; i++) {
            s2 += ("{");
            Class<?> c = Array.get(object, i).getClass();
            Field[] fields = c.getDeclaredFields();
            Map<String, Object> map = new HashMap<>();

            for (Field f : fields) {
                f.setAccessible(true);
                map.put(f.getName(), f.get(Array.get(object, i)));
            }

            for (Map.Entry<String, Object> m : map.entrySet()) {
                if (m.getValue() instanceof Integer) {
                    s += ("\"" + m.getKey() + "\"" + " : " + m.getValue() + ", ");
                } else if (m.getValue() instanceof String) {
                    s += ("\"" + m.getKey() + "\"" + " : \"" + m.getValue() + "\", ");
                } else {
                    s += ("\"" + m.getKey() + "\"" + " : \"" + m.getValue() + "\", ");
                }
            }
            s2 += s.substring(0, s.length() - 2);
            s2 += ("},");
            s = "";
        }
        s2 = s2.substring(0, s2.length() - 1);
        s2 += ("]");

        return s2;
    }

    public static void main(String[] args) throws IllegalAccessException {
        Student roma = new Student("Pravnyk", 3, new PersonalInformation(20, "0666790166", "Sarny"));
        Student sasha = new Student("Volodko", 3, new PersonalInformation(21, "0231555313", "Rivne"));
        List<Student> students = new ArrayList<>();

        students.add(roma);

        Student[] students1 = new Student[]{roma, sasha};
        String jsonRoma = toConvertJSON(students1);

        System.out.println(toConvertJSON(roma));
        System.out.println(toConvertJSON(sasha));
        System.out.println(jsonRoma);


    }
}
