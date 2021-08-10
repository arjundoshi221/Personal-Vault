package Conditions.ICSEBilling;
import java.util.*;
public class BEST
{
    String name;
    long tel;
    int calls;
    double tax;
    double bill;
    public  BEST()
    {
        name = "";
        tel = 0;
        calls=0;
        tax = 0.0;
        bill=0.0;
    }
    public void accept()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Name,Telephone Number and Calls");
        name = sc.nextLine();
        tel = sc.nextLong();
        calls = sc.nextInt();        
    }
    public void billing()
    {
        double b=0;
        
        if(calls<=100)
        {
            b=b*0;
        }
        if(calls>100 && calls<=300)
        {
            b= (calls-100)* 0.80;
        }
        if(calls>300 && calls<=500)
        {
            b= (200* 0.80) + (calls-300)*1.25;
        }
         if(calls>500)
        {
            b= (200* 0.80) + (200*1.25) + (calls-500)* 2.50;
        }
        
        bill=b+b*0.12;
    }
    public void display()
    {
        System.out.println("Name: "+ name);
        System.out.println("Telephone no: "+ tel);
        System.out.println("No. of Calls: "+ calls);
        System.out.println("Bill Amount: "+ bill);
    }
    public void main()
    {
        BEST d = new BEST();
        for(int i=1;i<=250;i++)
        {
            d.accept();
            d.billing();
            d.display();
        }
    }
}
