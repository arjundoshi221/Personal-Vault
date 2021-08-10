package Arrays;
import java.util.*;
public class ArraySorting
{
    public static void doArraysSortSelection()
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
        for(int i=0;i<m.length;i++)
        {
            int assumedSmallestValue=m[i];
            int smallPos=i;
            for(int j=i+1;j<m.length;j++)
            {
                if(m[j]<assumedSmallestValue)
                {
                    assumedSmallestValue=m[j];
                    smallPos=j;
                }
            }
            m[smallPos]=m[i];
            m[i]=assumedSmallestValue;
        }
        
        for(int i=0;i<m.length;i++)
        {
            System.out.println(m[i]);
        }
        
        
    }
    public static void doArraysSortWOScannerSelection(int m[])
    {
        
        for(int i=0;i<m.length;i++)
        {
            int small=m[i];
            int pos=i;
            for(int j=i+1;j<m.length;j++)
            {
                if(m[j]<small)
                {
                    small=m[j];
                    pos=j;
                }
            }
            m[pos]=m[i];
            m[i]=small;
        }
        
        for(int i=0;i<m.length;i++)
        {
            System.out.println(m[i]);
        }    
    }
}