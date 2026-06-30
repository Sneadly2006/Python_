import java.util.Random;

public class Practicheskaya15_16_filimonov {
    public static void main(String[] args) {
        Random rand = new Random();
        
        System.out.println("ОДНОМЕРНЫЙ МАССИВ");
        
        int[] arr = new int[8];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rand.nextInt(101);
        }
        
        System.out.print("Массив: ");
        for (int x : arr) {
            System.out.print(x + " ");
        }
        System.out.println();
        
        int maxVal = arr[0];
        int minVal = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > maxVal) maxVal = arr[i];
            if (arr[i] < minVal) minVal = arr[i];
        }
        System.out.println("Максимум: " + maxVal);
        System.out.println("Минимум: " + minVal);
        
        System.out.println("\nДВУМЕРНЫЙ МАССИВ");
        
        int n = 4;
        int[][] mat = new int[n][n];
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                mat[i][j] = (i == j) ? 1 : 0;
            }
        }
        
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                System.out.print(mat[i][j] + " ");
            }
            System.out.println();
        }
        
        System.out.println("\nТРЕУГОЛЬНИК ПАСКАЛЯ");
        
        int rows = 5;
        int[][] pasc = new int[rows][];
        for (int i = 0; i < rows; i++) {
            pasc[i] = new int[i + 1];
            pasc[i][0] = 1;
            pasc[i][i] = 1;
            for (int j = 1; j < i; j++) {
                pasc[i][j] = pasc[i-1][j-1] + pasc[i-1][j];
            }
        }
        
        for (int i = 0; i < pasc.length; i++) {
            for (int k = 0; k < rows - i - 1; k++) {
                System.out.print("  ");
            }
            for (int j = 0; j < pasc[i].length; j++) {
                System.out.print(pasc[i][j] + "   ");
            }
            System.out.println();
        }
    }
}