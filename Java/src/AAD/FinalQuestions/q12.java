package src.AAD.FinalQuestions;

import java.util.Scanner;

public class q12 {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        n = sc.nextInt();

        int c = 0, f = 1, ctr = 0;
        int num = n;

        for (int i = 2; i <= num; i++) {
            c = 0;
            while (num % i == 0) {
                num /= i;
                c++;
            }

            if (c == 1) {
                f *= i;
                ctr++;
            }
        }

        if (f == n && ctr == 3)
            System.out.println("Sphenic Number");
        else
            System.out.println("Not a Sphenic Number");

        sc.close();
    }
}
