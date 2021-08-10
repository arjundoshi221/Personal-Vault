package Misc;
public class WrapperClasses
{
    public static void doTestInt2String(int n)
    {
        String s;
        s=String.valueOf(n);
        System.out.println("No. of digits : "+s.length());
    }

    public static void doTestInt2String2(int n)
    {
        String s;
        //int m[]={1,2,3};
        s=Integer.toString(n);
        System.out.println(s+"No. of digits : "+s.length());
    }

}
