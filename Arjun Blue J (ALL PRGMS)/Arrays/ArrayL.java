package Arrays;

import java.util.*;
public class ArrayL
{
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter total number of values: ");
        int m = sc.nextInt();
        int c=0;
        int n[]=new int[m];
        System.out.println("Enter the numbers to be inputed below: ");
        for(int i=0;i<n.length;i++)
        {
             n[i]=sc.nextInt();
        }
        System.out.print("Enter the number you want to search: ");
        int sNo=sc.nextInt();
            
        for(int i=0;i<n.length;i++)
        {
            if(n[i]==sNo)
            {
                c++;
                System.out.println("Your Number is found at "+(i+1));
            }
        }
        if(c==0)
        {
            System.out.println("Your Number not found");
        }
    }
}
