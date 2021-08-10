package Loop.RegularIteration;
public class Loops
{
    public static void main()
    {
        for(int i=1;i<=5;i=i+1) //Entry controlled
        {
            System.out.println(i+" Hello");
        }
    }
    public static void mainWhile()
    {
        int i=1;
        while(i<=5)//Entry controlled
        {
            System.out.println(i+" Hello");
            i=i+1;
        }
    }
}
