package src.AAD.FinalQuestions;

import java.util.Scanner;

public class q8 {
    public static void main(String[] args) {
        int[] arr = new int[10];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 10; i++) {
            arr[i] = sc.nextInt();
        }

        int max = arr[0];
        for (int i = 0; i < 10; i++) {
            if (arr[i] > max)
                max = arr[i];
        }

        int diff = max - arr[0];
        int pos = 0;
        for (int i = 0; i < 10; i++) {
            if (max - arr[i] < diff && max - arr[i] != 0) {
                diff = max - arr[i];
                pos = i;
            }
        }

        System.out.println("2nd Largest element: " + arr[pos]);

        sc.close();
    }
}
