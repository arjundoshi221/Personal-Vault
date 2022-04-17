package src.AAD.FinalQuestions;

import java.util.Scanner;

class Average {
    int n1, n2, n3;

    Average(int a, int b, int c) {
        n1 = a;
        n2 = b;
        n3 = c;
    }

    public void calcAverage() {
        double avg = (n1 + n2 + n3) / 3;
        System.out.println("Average: " + avg);
    }
}

public class Q3 {
    public static void main(String[] args) {
        int a, b, c;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter 3 numbers: ");
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();

        Average avg = new Average(a, b, c);
        avg.calcAverage();
        sc.close();

    }

}
