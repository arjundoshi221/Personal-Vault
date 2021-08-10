package Functions;
import java.util.*;
public class Bank
{
    double R;int t;int P; double CI;
    public Bank()
    {
        R = 0.15;
        t=4;
        P=0;
        CI=0;
    }
    public void accept()
    {
        Scanner sc=new Scanner (System.in);
        System.out.println("Enter Principal amount: ");
        P=sc.nextInt();
    }
    public void compInterest()
    {
        CI=Math.pow(P*(1+R/100),t); 
    }
    public void display()
    {
        System.out.println("Interest: "+CI);
    }
    public static void main()
    {
        Bank obj = new Bank();
        obj.accept();
        obj.compInterest();
        obj.display();
    }
}
