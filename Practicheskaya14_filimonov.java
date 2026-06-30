class NumberPrinter implements Runnable {
    @Override
    public void run() {
        try {
            for (int i = 1; i <= 5; i++) {
                System.out.println("Цифра: " + i);
                Thread.sleep(500);
            }
        } catch (InterruptedException e) {
            System.out.println("Поток цифр остановлен");
        }
    }
}

class LetterPrinter implements Runnable {
    @Override
    public void run() {
        try {
            for (char c = 'A'; c <= 'E'; c++) {
                System.out.println("Символ: " + c);
                Thread.sleep(700);
            }
        } catch (InterruptedException e) {
            System.out.println("Поток символов остановлен");
        }
    }
}

public class Practicheskaya14_filimonov {
    public static void main(String[] args) {
        System.out.println("ЗАПУСК ПОТОКОВ\n");
        
        Thread t1 = new Thread(new NumberPrinter());
        Thread t2 = new Thread(new LetterPrinter());
        
        t1.start();
        t2.start();
        
        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            System.out.println("Основной поток прерван");
        }
        
        System.out.println("\nВСЕ ПОТОКИ ЗАВЕРШЕНЫ");
    }
}