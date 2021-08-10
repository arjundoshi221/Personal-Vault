package Arrays.NewArray;
import java.util.*;
public class ArrayN
{
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of values: ");
        int v = sc.nextInt();
        int n[] = new int[v];
        
        System.out.println("Enter values here: ");
        for(int i=0;i<n.length;i++)
        {
            n[i]=sc.nextInt();
        }
        
        System.out.print("Enter number to search from list: ");
        int input = sc.nextInt();
        int c=0;
        for(int i=0;i<n.length;i++)
        {
           if(n[i]==input)
           {
               c++;
               System.out.println("The number "+input+" is found at position"+(i+1));
           }
        }
        if(c==0)
        {
            System.out.println("Sorry number not found.");
        }
    }
}
