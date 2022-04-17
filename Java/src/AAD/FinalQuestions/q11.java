package src.AAD.FinalQuestions;

import java.util.Scanner;

public class q11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n;
        System.out.print("Enter length of the array (minimum 10): ");
        n = sc.nextInt();
        if (n >= 10) {
            int[] arr = new int[n];

            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }

            int max = arr[0];
            int min = arr[0];
            for (int i = 0; i < n; i++) {
                if (arr[i] > max)
                    max = arr[i];

                if (arr[i] < min)
                    min = arr[i];
            }
            System.out.println("Max: " + max);
            System.out.println("Min: " + min);
        }
        sc.close();
    }
}
