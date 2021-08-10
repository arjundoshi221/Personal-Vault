package Conditions;
/**
 * and &&
 * or ||
 * not !
 */
public class LogicalOperators
{
    public static void test(int amt)
    {
        if (amt<=1000)
        {
            System.out.println("No discount");
        }
        if (amt>1000 && amt <=5000)
        {
            System.out.println("10% discount");
        }
        if (amt>5000 && amt <=15000)
        {
            System.out.println("20% discount");
        }
        if (amt>15000)
        {
            System.out.println("50% discount");
        }
        
    }
}