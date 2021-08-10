package Functions.CallByValReturn;


public class FunctionC
{
    public static void main(double s)
    {
        System.out.println(area(s));
        System.out.println(perimeter(s));
    }
    public static double area(double s)
    {
        double area = s*s;
        return area;
    }
    public static double perimeter(double s)
    {
        double perimeter = s*4;
        return perimeter;
    }
}
