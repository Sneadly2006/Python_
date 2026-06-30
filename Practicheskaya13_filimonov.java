import java.util.ArrayList;
import java.util.HashSet;
import java.util.HashMap;
import java.util.List;
import java.util.Set;
import java.util.Map;

public class Practicheskaya13_filimonov {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("Ольга");
        names.add("Дмитрий");
        names.add("Наталья");
        names.add("Алексей");
        names.add("Ольга");
        
        System.out.println("Список: " + names);
        System.out.println("Количество: " + names.size());
        
        Set<String> unique = new HashSet<>(names);
        System.out.println("Уникальные: " + unique);
        System.out.println("Количество уникальных: " + unique.size());
        
        Map<String, Integer> scores = new HashMap<>();
        scores.put("Ольга", 92);
        scores.put("Дмитрий", 78);
        scores.put("Наталья", 95);
        scores.put("Алексей", 84);
        
        System.out.println("\nОценки:");
        for (Map.Entry<String, Integer> entry : scores.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }
}