package Functions.CallByValReturn;
public class FunctionB
{
    public static void main(double s)
    {
        System.out.println(area(s));
        System.out.println(perimeter(s));
    }
    public static double area(double s)
    {
        double A=s*s;
        return A;
    }
    public static double perimeter(double s)
    {
        double P=4*s;
        return P;
    }
}
