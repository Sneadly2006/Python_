import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] l = {50, 55, 57, 58, 60};
        int maxBen = 175;
        int best = 0;        
        for (int i = 0; i < l.length; i++) {
            for (int j = i + 1; j < l.length; j++) {
                for (int k = j + 1; k < l.length; k++) {
                    int sum = l[i] + l[j] + l[k];
                    if (sum <= maxBen && sum > best) {
                        best = sum;
                    }
                }
            }
        }        
        System.out.println(best);
        sc.close();
    }
}