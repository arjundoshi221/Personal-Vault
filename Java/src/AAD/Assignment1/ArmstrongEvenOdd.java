import java.util.Scanner;

public class ArmstrongEvenOdd {
    public static void main(String[] args) {
        Scanner Obj = new Scanner(System.in);
        System.out.println("Enter a number: ");

        int n = Obj.nextInt();
        int temp = n;

        if (n % 2 == 1) {
            System.out.println(n + " is an Odd Number");
        } else {
            System.out.println(n + " is an Even Number");
        }

        int x = 0, sum = 0;
        while (temp > 0) {
            ++x;
            temp = temp / 10;
        }
        temp = n;
        while (temp > 0) {
            sum += (Math.pow(temp % 10, x));
            temp = temp / 10;
        }
        if (n == sum) {
            System.out.println(n + " is an Armstrong number");
        } else {
            System.out.println(n + " is NOT an Armstrong number");
        }
        Obj.close();
    }
}