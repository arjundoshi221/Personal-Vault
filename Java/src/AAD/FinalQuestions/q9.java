package src.AAD.FinalQuestions;

import java.util.Scanner;

public class q9 {
    public static void main(String[] args) {
        int a, b;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter 2 numbers");
        a = sc.nextInt();
        b = sc.nextInt();
        System.out.println("Before Swapping:\na: " + a + "\nb: " + b);

        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("After Swapping:\na: " + a + "\nb: " + b);

        sc.close();
    }
}
