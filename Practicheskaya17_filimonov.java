import java.util.HashMap;
import java.util.Map;

public class Practicheskaya17_filimonov {
    public static void main(String[] args) {
        HashMap<String, Integer> grades = new HashMap<>();
        
        grades.put("Алина", 94);
        grades.put("Максим", 81);
        grades.put("Светлана", 97);
        grades.put("Артём", 73);
        grades.put("Кристина", 86);
        
        System.out.println("ЖУРНАЛ УСПЕВАЕМОСТИ");
        System.out.println("Студенты и их баллы:");
        for (Map.Entry<String, Integer> entry : grades.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }
        
        String name1 = "Светлана";
        System.out.println("\nОценка " + name1 + ": " + grades.get(name1));
        
        String name2 = "Артём";
        if (grades.containsKey(name2)) {
            System.out.println(name2 + " присутствует в списке");
        } else {
            System.out.println(name2 + " отсутствует");
        }
        
        String name3 = "Валерий";
        if (grades.containsKey(name3)) {
            System.out.println(name3 + " присутствует в списке");
        } else {
            System.out.println(name3 + " отсутствует");
        }
        
        grades.remove("Максим");
        System.out.println("\nПосле удаления:");
        for (Map.Entry<String, Integer> entry : grades.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }
        System.out.println("Всего записей: " + grades.size());
    }
}