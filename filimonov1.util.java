import java.util.Scanner;

public class Main {
    static int f(int[] a) {
        int c = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] == 1) {
                c = c + 1;
            }
        }
        return c;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        
        String s2 = "";
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch != '[' && ch != ']' && ch != ' ') {
                s2 = s2 + ch;
            }
        }
        
        String[] parts = new String[100];
        int count = 0;
        String temp = "";
        for (int i = 0; i < s2.length(); i++) {
            if (s2.charAt(i) != ',') {
                temp = temp + s2.charAt(i);
            } else {
                parts[count] = temp;
                count = count + 1;
                temp = "";
            }
        }
        parts[count] = temp;
        count = count + 1;
        int[] a = new int[count];
        for (int i = 0; i < count; i++) {
            String p = parts[i];
            if (p.equals("1") || p.equals("True") || p.equals("true")) {
                a[i] = 1;
            } else {
                a[i] = 0;
            }
        }        
        int res = f(a);
        System.out.println(res);
        sc.close();
    }
}