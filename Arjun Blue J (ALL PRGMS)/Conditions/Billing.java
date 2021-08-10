package Conditions;

public class Billing
{
    public static void main(int days)
    {
       double bill = 0;
       if(days>=7 &&  days<=14)
       {
           bill=0.50*days;
       }
       if(days>14 && days<=21)
       {
           bill=0.50*7 + 1.00*(days-14);
       }
       if(days>21 && days<=28)
       {
           bill=0.50*7+1.00*7+ 1.50*(days-21);
       }
       if(days>28 && days<=35)
       {
           bill=0.50*7+1.00*7+1.50*7+ 2.0*(days-28);
       }
       if(days>35)
       {
           bill=0.50*7+1.00*7+1.50*7+2.0*7+3.0*(days-35);
       }
       System.out.println("Amount = Rs" + bill);
    }
    public static void main2(int km)
    {
        int fare=0;
        if(km==1)
        {
            fare=km*20;
        }
        if(km>1 && km<=10)
        {
            fare=20+5*(km-1);
        }
        if(km>10 && km<=30)
        {
            fare=20+km*10 +8*(km-10);
        }
        if(km>30)
        {
            fare=20+km*10+km*20+10*(km-30);
        }
        System.out.println("Fare = Rs"+fare);
    }
    
    public static void main3(int inc)
    {
        double tax=0;
        
        if(inc<=250000)
        {
            tax=0;
        }
        if(inc>250000 && inc<=500000)
        {
            tax=0.1*inc;
        }
        if(inc>500000 && inc<=800000)
        {
            tax=0.1*250000+0.2*(inc-500000);
        }
        if(inc>800000)
        {
             tax=0.1*250000+0.2*300000+0.3*(inc-800000);
        }
        System.out.println(tax);
    }
    
}
