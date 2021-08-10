package Arrays.NewArray;
import java.util.*;
public class ArrayP
{
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your code: ");
        int c = sc.nextInt();
        int code[]={101,102,103,104,105,106,107,108,109,110};
        double cost[]={25.50,45.0,300.50,75.25,90.00,99.99,65.50,70.00,99.99,100.0};
        
        int l=0,u=code.length-1,mid;
        
        while(l<=u)
        {
            mid = (l+u)/2;
            if(c==code[mid])
            {
                System.out.println("Product code: "+c+"     "+"Product cost: "+cost[mid]);
                break;
            }
            if(code[mid]>c)
            {
                u=mid-1;
            }
             if(code[mid]<c)
            {
                l=mid+1;
            }
        }
        if(l>u)
        {
            System.out.println("Code number is not in the list");
        }
    }
}

