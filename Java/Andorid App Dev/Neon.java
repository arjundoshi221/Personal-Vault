package college;

import java.util.Scanner;

public class Neon {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = input.nextInt();
        int sq = n*n;
        int new_n = 0;
        while(sq > 0) {
            int rem = sq % 10;
            new_n = new_n + rem;
            sq /= 10;
        }

        if(new_n == n) {
            System.out.println("number is neon number");
        }
        else {
            System.out.println("not a neon number");
        }
    }
}