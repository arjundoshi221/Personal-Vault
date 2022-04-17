package src.AAD.FinalQuestions;

import java.util.Scanner;

public class q5 {
    public static void main(String[] args) {
        int d;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number between 1 and 7");
        d = sc.nextInt();

        switch (d) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Number not between 1 and 7");
        }

        sc.close();
    }
}
