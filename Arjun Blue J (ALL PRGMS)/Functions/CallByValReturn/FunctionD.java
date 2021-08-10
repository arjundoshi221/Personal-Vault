package Functions.CallByValReturn;
public class FunctionD
{
    public static void main(double sal)
    {
        System.out.println(tax(sal));
    }
    public static double tax(double sal)
    {
        double tax = 0;
        if(sal<=170000)
        {tax=0;}
        if(sal>170000 && sal<=500000)
        {tax=0.1*sal;}
        if(sal>500000 && sal<=800000)
        {tax=0.1*500000+ 0.2*(sal-500000);}
        if(tax>800000)
        {tax=0.1*500000+0.2*300000+0.3*(sal-800000);}
        
        return tax;
    }
}
