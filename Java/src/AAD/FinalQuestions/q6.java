package src.AAD.FinalQuestions;

import java.util.Scanner;

public class q6 {
    public static void main(String[] args) {
        String str;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a string");
        str = sc.next();

        char[] rev = new char[str.length()];

        for (int i = 0; i < str.length(); i++) {
            rev[i] = str.charAt(str.length() - i - 1);
        }

        System.out.println("Reversed String: " + new String(rev));

        sc.close();
    }
}
