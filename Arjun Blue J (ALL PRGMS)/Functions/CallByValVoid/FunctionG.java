package Functions.CallByValVoid;
import java.util.*;
public class FunctionG
{
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter name: ");
        String name = sc.nextLine();
        System.out.print("Enter Amount: ");
        double p = sc.nextDouble();
        System.out.print("Enter years: ");
        double n = sc.nextDouble();
        double r=0;
        
        amount(p,n,r);
    }
    public static void amount(double p, double n, double r)
    {
        if(n<1)
        r=9;
        if(n>=1 && n<=3)
        r=9.25;
        if(n>3 && n<=5)
        r=9.50;
        if(n>5)
        r=9.75;
        
        double A = p*Math.pow((1+r/100),n);
        
        System.out.println("Your Amount is: "+A);
    }
}
