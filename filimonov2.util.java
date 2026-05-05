import java.util.Scanner;

public class Main {
    static String f(String s) {
        String r = "";
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c != 'a' && c != 'e' && c != 'i' && c != 'o' && c != 'u' && c != 'y' &&
                c != 'A' && c != 'E' && c != 'I' && c != 'O' && c != 'U' && c != 'Y') {
                r = r + c;
            }
        }
        return r;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(f(s));
        sc.close();
    }
}