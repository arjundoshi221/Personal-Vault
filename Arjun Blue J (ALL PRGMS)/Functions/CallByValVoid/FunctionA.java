package Functions.CallByValVoid;

public class FunctionA
{
    public static void main(int a,int b)
    {
        sum(a,b);
        product(a,b);
    }
    public static void sum(int a, int b)
    {
        int c = a+b;
        System.out.println("Sum="+c);
    }
    public static void product(int a, int b)
    {
        int c=a*b;
        System.out.println("Product="+c);
    }
}
