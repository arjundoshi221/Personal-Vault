package Functions.CallByValVoid;
public class FunctionD
{
    public static void main(int s)
    {
        area(s);
        perimeter(s);
    }
    public static void area(double n)
    {
        double a = n*n;
        System.out.println("Area: "+a);
    }
    public static void perimeter(double n)
    {
        double p = 4*n;
        System.out.println("Perimeter: "+p);
    }
}