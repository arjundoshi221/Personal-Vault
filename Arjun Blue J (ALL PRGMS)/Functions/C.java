package Functions;
public class C
{
    public static void main()
    {
        for(int H=-4;H<=10;H++)
        {
            if(H>3)
            {
                gravity((int)H);
            }
            if(H<=3)
            {
                gravity((double)H);
            }
        }
    }
    public static void gravity(int H)
    {
        double G = 32.7*(Math.pow(4390/(4390+H),2));
        System.out.println(H+"\t"+G);
    }
    public static void gravity(double H)
    {
        double G = 32.7*(Math.pow(1/(H+4390),2));
        System.out.println(H+"\t"+G);
    }
}