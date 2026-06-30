import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Practicheskaya10_filimonov {
    private static final String FILE = "data.txt";
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("РАБОТА С ФАЙЛАМИ");
        System.out.println("1. Сохранить данные");
        System.out.println("2. Загрузить данные");
        System.out.print("Ваш выбор: ");
        
        int choice = input.nextInt();
        input.nextLine();
        
        switch (choice) {
            case 1:
                saveData();
                break;
            case 2:
                loadData();
                break;
            default:
                System.out.println("Неверный выбор!");
        }
        input.close();
    }
    
    private static void saveData() {
        List<String> items = Arrays.asList(
            "Москва", "Санкт-Петербург", "Новосибирск",
            "Екатеринбург", "Казань"
        );
        
        System.out.println("\n--- Запись ---");
        try (FileWriter writer = new FileWriter(FILE)) {
            for (String item : items) {
                writer.write(item + "\n");
            }
            System.out.println("Данные сохранены в " + FILE);
        } catch (IOException e) {
            System.err.println("Ошибка записи: " + e.getMessage());
        }
    }
    
    private static void loadData() {
        System.out.println("\nЧтение");
        try {
            List<String> items = Files.readAllLines(Paths.get(FILE));
            System.out.println("Содержимое файла " + FILE + ":");
            for (int i = 0; i < items.size(); i++) {
                System.out.println((i + 1) + ". " + items.get(i));
            }
            System.out.println("Всего записей: " + items.size());
        } catch (IOException e) {
            System.err.println("Ошибка чтения: " + e.getMessage());
            System.err.println("Файл " + FILE + " не найден!");
        }
    }
}