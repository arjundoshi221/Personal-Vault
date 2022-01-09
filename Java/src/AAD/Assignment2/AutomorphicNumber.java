import java.util.Scanner;

public class AutomorphicNumber {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number:");
        int n = sc.nextInt();

        int sq = n * n;
        int cop = n;
        int nod = 0;

        do {
            // int d = n % 10;
            n = n / 10;
            nod++;
        } while (n != 0);
        int partsq = sq % (int) Math.pow(10, nod);

        if (partsq == cop) {
            System.out.println("Automorphic");
        } else {
            System.out.println(" NOT Automorphic");
        }

        sc.close();
    }

}
