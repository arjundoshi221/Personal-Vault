package Conditions;
public class Proj22D
{
    public static void DiscountRate(double a)
    { 
        if(a<=2000)
        {System.out.println ("Discount = 2% and discount amt.= Rs" + a*0.02 );}
        if(a>2000)
        {System.out.println ("Discount = 10% and discount amt.= Rs" + a*0.1 );}
    } 
}
