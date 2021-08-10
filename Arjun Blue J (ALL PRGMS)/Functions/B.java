package Functions;
public class B
{
    public static void volume(double s)
    {
        double vc = s*s*s;
        System.out.println("Volume of cube: "+vc);
    }
    public static void volume(double r,double p)
    {
        double vs = 4.0/3*3.14*Math.pow(r,3);
        System.out.println("Volume of sphere: "+vs);
    }
    public static void volume(double L,double B,double H)
    {
        double vcd = L*B*H;
        System.out.println("Volume of cuboid: "+vcd);
    }
}
