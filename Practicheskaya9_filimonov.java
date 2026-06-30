import java.util.InputMismatchException;
import java.util.Scanner;

public class Practicheskaya9_filimonov {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        try {
            System.out.print("Укажите делимое: ");
            int a = sc.nextInt();
            
            System.out.print("Укажите делитель: ");
            int b = sc.nextInt();
            
            int res = a / b;
            System.out.println(a + " / " + b + " = " + res);
            
        } catch (InputMismatchException e) {
            System.out.println("Ошибка ввода! Требуется целое число.");
        } catch (ArithmeticException e) {
            System.out.println("Деление на ноль запрещено!");
        } finally {
            System.out.println("Выполнение завершено.");
            sc.close();
        }
    }
}