package Loop.RegularIteration;
import java.util.Scanner;
public class LoopScanner
{   
    /**
     * s = 5 + 10 + 15 +20 +....+n
     */
    public static void doMultiplesOfFive()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number: ");
        int n = sc.nextInt();
        int s=0;
        for(int i=5;i<=n;i=i+5)
        {
            System.out.println(i);
            s=s+i;
        }
        System.out.println("Sum = "+s);
    }
    

    public static void SumOfSeries()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter  number:");
        int n = sc.nextInt();
        
        for(int i=2;i<=n;i=i+2)
        {
            System.out.println(i*i);
        }
    }
}

 
 