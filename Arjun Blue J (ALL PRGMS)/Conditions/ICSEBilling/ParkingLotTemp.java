package Conditions.ICSEBilling;
public class ParkingLotTemp
{
    static int vno,  hours;
    double bill;
    public void input(int v, int h)
    {
        vno+=v;
        hours=h;
    }
    public void calculate()
    {
    
    bill=3+(hours-1)*1.5;
    }
    public void display()
    {
        System.out.println("The vehicle no. is =" + vno);
        System.out.println("The no. of hours =" + hours);
        System.out.println("\nThe bill =Rs\t" + bill);
    }
     public static void main(int vehclno, int noofhours)
     {
         ParkingLotTemp pl=new ParkingLotTemp();
         pl.input( vehclno, noofhours);
         pl.calculate();
         pl.display();
     }
    
}
