package src.AAD.FinalQuestions;

import java.util.Scanner;

public class q4 {
    public static void main(String[] args) {
        String c;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a character: ");
        c = sc.next();

        if (c.length() > 1)
            System.out.println("Error. Not a character");
        else if (!((c.charAt(0) >= 65 && c.charAt(0) <= 90) || (c.charAt(0) >= 97 && c.charAt(0) <= 122))) {
            System.out.println("Error. Not a letter");
        } else if (c.toLowerCase().equals("a") || c.toLowerCase().equals("e")
                || c.toLowerCase().equals("i") || c.toLowerCase().equals("o")
                || c.toLowerCase().equals("u")) {
            System.out.println("Letter is a vowel");
        } else
            System.out.println("Letter is a consonant");

        sc.close();

    }
}
