package ICSE;
import java.util.*;
public class ICSE2014
{
    public static void Q5()
    {
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter number: ");
        int n = sc.nextInt();
        int m=n;int s=0,sum=0;int p=1;
        
        
        do
        {
            int d=n%10;
            s=s+d;
            p=p*d;
            n=n/10;
        }while(n!=0);
        
        sum=p+s;
        
        if(sum==m)
        {
            System.out.println("Special number");
        }
        else
        {
            System.out.println("NOT Special number");
        }
    }
}
