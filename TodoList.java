import java.util.ArrayList;
import java.util.Collections;

public class TodoList {
    public static void main(String[] args) {
        ArrayList<String> tasks = new ArrayList<>();
        

        tasks.add("first task");
        tasks.add("second task");
        tasks.add("third task");
        

        System.out.println("Список задач");
        for (int i = 0; i < tasks.size(); i++) {
            System.out.println((i + 1) + ". " + tasks.get(i));
        }
        System.out.println();
        

        tasks.remove(1);
        System.out.println("После удаления второй задачи");
        for (int i = 0; i < tasks.size(); i++) {
            System.out.println((i + 1) + ". " + tasks.get(i));
        }
        System.out.println();
        
        String searchTask = "second task";
        if (tasks.contains(searchTask)) {
            System.out.println("Задача \"" + searchTask + "\" найдена в списке!");
        } else {
            System.out.println("Задача \"" + searchTask + "\" не найдена в списке.");
        }
        

        String searchTask2 = "third task";
        if (tasks.contains(searchTask2)) {
            System.out.println("Задача \"" + searchTask2 + "\" найдена в списке!");
        } else {
            System.out.println("Задача \"" + searchTask2 + "\" не найдена в списке.");
        }
        System.out.println();
        

        Collections.sort(tasks);
        System.out.println("=== Отсортированный список по алфавиту ===");
        for (int i = 0; i < tasks.size(); i++) {
            System.out.println((i + 1) + ". " + tasks.get(i));
        }
    }
}