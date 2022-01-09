
/**
 * 0 1 1 2 3 5 8 13......
 */
public class FibonacciSeries {
    public static void main(String[] args) {
        int a = 0, b = 1;
        System.out.print(a + " ");
        System.out.print(b + " ");
        for (int i = 3; i <= 20; i++) // for(int i=3;a+b<=20;i++)
        {
            int c = a + b;
            System.out.print(c + " ");
            a = b;
            b = c;
        }
    }
}