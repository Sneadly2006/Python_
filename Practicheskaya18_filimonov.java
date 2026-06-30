public class Practicheskaya18_filimonov {
    public static void main(String[] args) {
        int[][] table = {
            {3, 7, 1},
            {9, 4, 6},
            {2, 8, 5}
        };
        
        System.out.println("=== МАТРИЦА ===");
        for (int i = 0; i < table.length; i++) {
            for (int j = 0; j < table[i].length; j++) {
                System.out.print(table[i][j] + " ");
            }
            System.out.println();
        }
        
        int total = 0;
        for (int i = 0; i < table.length; i++) {
            for (int j = 0; j < table[i].length; j++) {
                total += table[i][j];
            }
        }
        System.out.println("\nСумма элементов: " + total);
    }
}