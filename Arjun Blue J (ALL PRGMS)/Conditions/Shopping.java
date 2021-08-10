package Conditions;
/**
 * Write a description of class Shopping here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Shopping
{
    public static void Cost(double c)
    { 
        if (c<=1000 )
        {
            System.out.print ( "No Discount");
        }
        
        else  
        {
            System.out.print ( "Discount!");
        }
    }

}
