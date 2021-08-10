package Functions.CallByValVoid;
public class FunctionF
{
    public static void main(int c,String n)
    {
        billing(c, n);
    }
    public static void billing(int c,String n)
    {
        System.out.println(n);
        double bill=0;
        if(c>0 && c<=100)
        bill= c*1;
        if(c>100 && c<=300)
        bill=100*1 + (c-100)*1.5;
        if(c>300 && c<=500)
        bill=100*1 + 200*1.5+ (c-300)*2;
        if(c>500)
        bill=100*1 + 200*1.5+ 200*2+(c-500)*2.5;
        
        System.out.println("Your bill= ");
    }
}
