//import java.util.Scanner;

public class PalindromeString {
    public static void main(String[] args) {

        // Scanner sc = new Scanner(System.in);
        // System.out.print("Enter a word: ");
        // String s = sc.nextLine();
        // s = s + " ";
        // String w = "";
        // String pal = "";
        // // int c = 0;
        // for (int i = 0; i < s.length(); i++) {
        // char ch = s.charAt(i);
        // if (ch != ' ') {
        // w = w + ch;
        // pal = ch + pal;
        // } else {
        // if (pal.equalsIgnoreCase(w)) {
        // System.out.println("Yes");
        // } else {
        // System.out.println("NO");
        // }
        // w = "";
        // pal = "";
        // }

        // }

        // sc.close();
        int a = 3;
        PrimeNo(a);

    }

    public static void PrimeNo(int n) {

        int c = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                c++;
            }
        }
        if (c == 2) {
            System.out.println(n + " is a prime number");
        }
        if (c != 2) {
            System.out.println(n + " is a NOT prime number");
        }

    }

}
