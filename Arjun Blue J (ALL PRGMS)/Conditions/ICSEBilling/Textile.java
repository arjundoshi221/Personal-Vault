package Conditions.ICSEBilling;
import java.util.*;
public class Textile
{
    String type;int l;double bill;
    public void Textile()
    {
        type="";
        l=0;
        bill=0.0;
    }
    public void input()
    {
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter type of cloth: ");
        type = sc.nextLine();
        System.out.print("Enter length in meters: ");
        l=sc.nextInt();
        type = type.toLowerCase();
    }
    public void calculate()
    {
        
        if(type.equalsIgnoreCase("cotton"))
        {
            if(l<5)
            {
                bill=l*35;
            }
            if(l>=5 && l<=10)
            {
                bill=l*25;
            }
            if(l>10)
            {
                bill=l*20;
            }
        }
        if(type.equalsIgnoreCase("nylon"))
        {
            if(l<5)
            {
                bill=l*50;
            }
            if(l>=5 && l<=10)
            {
                bill=l*45;
            }
            if(l>10)
            {
                bill=l*40;
            }
        }
        else
        {
            System.out.println("Wrong input.");
        }
    }
    public void display()
    {
        System.out.println("Type of Cloth: "+type);
        System.out.println("Length of Cloth: "+l);
        bill=bill+(0.18*bill);
        System.out.println("Bill: "+bill);
    }
    public void main()
    {
        Textile obj = new Textile();
        obj.input();
        obj.calculate();
        obj.display();
    }
    
}
