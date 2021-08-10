package Functions.CallByValReturn;

public class FunctionA
{
    public static void main(double r)
    {
        System.out.println(area(r));
        
    }
    public static double area(double r)
    {
        double A = (22/7.0)*r*r;
        return A;
    }
}
