package ICSE;
import java.util.*;
public class ParkingLot
{
    int vno,  hours;
    double bill;
    public ParkingLot()
    {
        vno=0;
        hours=0;
        bill=0.0;
    }
    public void input()
    {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter Vehicle No: ");
        vno=sc.nextInt();
        System.out.println("Enter no. of Hours: ");
        hours = sc.nextInt();
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
        ParkingLot obj =new ParkingLot();
        obj.input();
        obj.calculate();
        obj.display();
    }
    
}
