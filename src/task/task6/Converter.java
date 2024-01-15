package task.task6;

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
            f.setAccessible(true); // access to private field
            map.put(f.getName(), f.get(object));
        }

        sb.append("{");
        for (Map.Entry<String, Object> m : map.entrySet()) {
            if (m.getValue() instanceof Integer || m.getValue() instanceof Double) {
                sb.append("\"" + m.getKey() + "\"" + " : " + m.getValue() + ", ");
            } else if (m.getValue() instanceof String) {
                sb.append("\"" + m.getKey() + "\"" + " : \"" + m.getValue() + "\", ");
            } else if(m.getValue() instanceof Boolean){
                sb.append("\"" + m.getKey() + "\"" + " : " + m.getValue() + ", ");
            }
            else {
                sb.append("\"" + m.getKey() + "\"" + " : " + toArray(m.getValue()) + ", ");
            }
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
                if (m.getValue() instanceof Integer || m.getValue() instanceof Double) {
                    s += ("\"" + m.getKey() + "\"" + " : " + m.getValue() + ", ");
                } else if (m.getValue() instanceof String) {
                    s += ("\"" + m.getKey() + "\"" + " : \"" + m.getValue() + "\", ");
                } else if(m.getValue() instanceof Boolean){
                    s +=("\"" + m.getKey() + "\"" + " : " + m.getValue() + ", ");
                }
                else {
                    s += ("\"" + m.getKey() + "\"" + " : " + toArray(m.getValue()) + ", ");
                }
            }
            s2 += s.substring(0, s.length() - 2);
            s2 += ("}, ");
            s = "";
        }
        s2 = s2.substring(0, s2.length() - 2);
        s2 += ("]");

        return s2;
    }

    private static String toArray(Object array) {
        if (array != null) {
            if (array.getClass().isArray()) {
                return "\""+Arrays.toString((int[]) array)+"\"";
            } else {
                return "\""+array+"\"";
            }
        } else {
            return null;
        }
    }
}
