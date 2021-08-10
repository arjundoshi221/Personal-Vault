package ICSE;
import java.util.*;
public class ElectricBill //Q4 2017
{
    String n; int units; double bill;
    public ElectricBill()
    {
        n="";
        units=0;
        bill=0.0;
    }
    public void accept()
    {
        System.out.println("Enter name,no. of units");
        Scanner sc = new Scanner(System.in);
        n=sc.nextLine();
        units = sc.nextInt();
    }
    public void calculate()
    {
        if(units>0 && units<=100)
        bill=units*2;
        if(units>100 && units<=300)
        bill=(100*2)+ (units-100)*3;
        if(units>300)
        bill=(100*2)+(200*3)+(units-300)*5;
        
        if(units>300)
        bill=bill+(bill*0.025);
    }
    public void print()
    {
        System.out.println("Name of Customer: "+n);
        System.out.println("No. of Units: "+units);
        System.out.println("Bill amount: "+bill);
    }
    public void main()
    {
        ElectricBill obj = new ElectricBill();
        obj.accept();
        obj.calculate();
        obj.print();
    }
}
