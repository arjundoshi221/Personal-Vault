import java.util.Scanner;

public class KrishnamurthyNumber {

    /**
     * Krishnamurty No.
     * 145==> 1!+4!+5!=1+24+120 = 145
     */
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number:");
        int n = sc.nextInt();

        int m = n;
        int s = 0;
        do {
            int d = n % 10;
            n = n / 10;
            int f = 1;
            for (int i = 1; i <= d; i++) {
                f = f * i;
            }
            s = s + f;
        } while (n != 0);

        if (s == m) {
            System.out.println("Yes");
        } else {
            System.out.println("NO");
        }

        sc.close();
    }

}
