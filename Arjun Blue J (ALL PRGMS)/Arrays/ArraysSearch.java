package Arrays;
import java.util.*;
public class ArraysSearch
{
    public static void doArraysSumDisplayScanner()
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number of values: ");
        int n=sc.nextInt();
        int m[]=new int[n];
        
        for(int i=0;i<m.length;i++)
        {
            System.out.print("Enter number: ");
            m[i]=sc.nextInt();
        }
        System.out.print("Enter a number to search: ");
        int srch=sc.nextInt();
        
        int f=0;
        for(int i=0;i<m.length;i++)
        {
            if(m[i]==srch)
                f++;
        }
        if(f!=0)
            System.out.println(srch+" is found "+f + " times");
        else
            System.out.println(srch+" is not found ");
    }
    public static void doArraysSumDisplayWithoutScanner(int m[],int srch)
    {
        int f=0;
        for(int i=0;i<m.length;i++)
        {
            if(m[i]==srch)
                f++;
        }
        if(f!=0)
            System.out.println(srch+" is found "+f + " times");
        else
            System.out.println(srch+" is not found ");
    }
}
