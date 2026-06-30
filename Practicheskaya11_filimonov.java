import java.util.*;
import java.util.stream.Collectors;

public class Practicheskaya11_filimonov {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(2, -5, 8, -3, 10);
        
        List<Integer> squared = nums.stream()
                .filter(x -> x > 0)
                .map(x -> x * x)
                .collect(Collectors.toList());
        
        System.out.println("Исходные данные: " + nums);
        System.out.println("Результат: " + squared);
    }
}