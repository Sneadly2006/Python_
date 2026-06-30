import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionHandlingDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        try {
            
            System.out.print("Введите первое число (делимое): ");
            int num1 = scanner.nextInt();
            
            
            System.out.print("Введите второе число (делитель): ");
            int num2 = scanner.nextInt();
            
            
            int result = num1 / num2;
            System.out.println("Результат деления: " + num1 + " / " + num2 + " = " + result);
            
        } catch (InputMismatchException e) {
        
            System.out.println("Ошибка: Введено не число! Пожалуйста, введите целое число.");
            
        } catch (ArithmeticException e) {
        
            System.out.println("Ошибка: Деление на ноль невозможно!");
            
        } finally {
            System.out.println("Программа завершена. Спасибо за использование!");
            scanner.close();
        }
    }
}