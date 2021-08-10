package Conditions;
/**
 * and &&
 * or ||
 * not !
 */
public class Discount
{
    public static void test(int amt)
    {
        if (amt<=1000)
        {
            System.out.println("No discount");
        }
        if (amt>1000 && amt <=5000)
        {
            System.out.println(10/100.0*amt+" 10% discount");
        }
        if (amt>5000 && amt <=15000)
        {
            System.out.println(0.20*amt +" 20% discount");
        }
        if (amt>15000)
        {
            System.out.println(50/100.0*amt +" 50% discount");
        }
        
        
        
    }
    
    public static void test2(int amt)
    {
        double d=0;
        if (amt<=1000)
        {
            System.out.println("No discount");
        }
        if (amt>1000 && amt <=5000)
        {
            d=10;
            System.out.println(" 10% discount");
        }
        if (amt>5000 && amt <=15000)
        {
            d=20;
            System.out.println(" 20% discount");
        }
        if (amt>15000)
        {
            d=50;
            System.out.println(" 50% discount");
        }
        
        double discount=d/100*amt;
        double amtAfterDis = amt - discount;
         System.out.println ("Discount Amount = "+discount);
        System.out.print ("Amount after discount = "+amtAfterDis);
        
        
    }
}
