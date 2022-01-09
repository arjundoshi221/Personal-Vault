import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number:");
        int n = sc.nextInt();

        int factorial = 1;
        while (n > 0) {
            factorial *= n;
            n -= 1;
        }

        System.out.println(factorial);
        sc.close();
    }

}
