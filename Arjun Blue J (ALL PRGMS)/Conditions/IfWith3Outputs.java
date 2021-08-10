package Conditions;
/**
 * accept a no check if the no. is +ve, -ve or neutral
 */
public class IfWith3Outputs
{
    public static void doTest(int n)
    {
        if (n>0)
        {
            System.out.println("Positive No. "+n);
        }
        else if(n<0)
        {
            System.out.println("Negative No. "+n);
        }
        else if (n==0)
        {
            System.out.println("Neutral No. "+n);    
        }
        
        
        /** NESTED IF
        if (n>0)
        {
            System.out.println("Positive No. "+n);
        }
        else
        {
            if(n<0)
            {
                System.out.println("Negative No. "+n);
            }
            else if (n==0)
            {
                System.out.println("Neutral No. "+n);    
            }
        
        }
        */
    }
}
