import java.util.*;

public class Ascending {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter No of Values:");
        int m = sc.nextInt();

        int n[] = new int[m];
        for (int i = 0; i < n.length; i++) {
            System.out.print("Enter Marks:");
            n[i] = sc.nextInt();
        }
        for (int i = 0; i < n.length; i++) {
            for (int j = i + 1; j < n.length; j++) {
                if (n[i] > n[j]) {
                    int c = n[i];
                    n[i] = n[j];
                    n[j] = c;
                }
            }
        }
        for (int i = 0; i < n.length; i++) {
            System.out.println(n[i]);
        }

        sc.close();
    }
}