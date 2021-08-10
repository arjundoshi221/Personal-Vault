package Arrays;
import java.util.*;
public class Arrays
{
    public static void doArrays(int []m)
    {
        System.out.println(m[0]);
        System.out.println(m[1]);
        
    }
    public static void doArraysDisplay(int m[])
    {
        for(int i=0;i<m.length;i++)
        {
            System.out.println(m[i]);
        }
    }
    public static void doArraysSumDisplay(int m[])
    {
        int s=0;
        for(int i=0;i<m.length;i++)
        {
            s=s+m[i];
        }
        System.out.println("Sum = "+s);
    }
    public static void doArraysSumDisplay()
    {
        int m[]={1,2,3,4,5,6,7,8,9,10};
        int s=0;
        for(int i=0;i<m.length;i++)
        {
            s=s+m[i];
            
        }
        System.out.println("Sum = "+s);
    }
    public static void doArraysSumDisplayScanner()
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number of values: ");
        int n=sc.nextInt();
        
        int m[]=new int[n];
        
        int s=0;
        for(int i=0;i<m.length;i++)
        {
            System.out.print("Enter number: ");
            m[i]=sc.nextInt();
            s=s+m[i];
        }
        System.out.println("Sum = "+s);
    }
     public static void doArraysSumDisplayScannerEvenAvg()
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number of values: ");
        int n=sc.nextInt();
        
        int m[]=new int[n];
        int c= 0;
        double s=0;
        for(int i=0;i<m.length;i++)
        {
            System.out.print("Enter number: ");
            m[i]=sc.nextInt();
            if(m[i]%2==0)
            {
              s=s+m[i];
              c++;
            }
        }
        System.out.println("Sum = "+s);
        System.out.println("Average= " + s/c);
    }
    public static void doArrays7()
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number of values: ");
        int n=sc.nextInt();
        
        int m[]=new int[n];
        int c= 0;
        double s=0;
        for(int i=0;i<m.length;i++)
        {
            System.out.print("Enter number: ");
            m[i]=sc.nextInt();
            if(m[i]%10==7 || m[i]%7==0)
            {
              s=s+m[i];
              c++;
            }
        }
        System.out.println("Sum = "+s);
        System.out.println("Average= " + s/c);
    }
}
