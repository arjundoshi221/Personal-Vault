package Functions;
import java.util.*;
public class Big_Bazar
{
    String name;String add;double pa;double discount,VAT,Bill,Amount;
    public Big_Bazar()
    {
        name="";
        add="";
        pa=0.0;
    }
    public void input()
    {
        System.out.println("Enter name, Address, purchase amount: ");
        Scanner sc = new Scanner (System.in);
        name=sc.nextLine();
        add=sc.nextLine();
        pa=sc.nextDouble();
        
    }
    public void discount()
    {
        if (pa>1000)
        {
            discount = (0.15*pa);
        }
    }
    public void amount()
    {
        Amount = pa - discount;
    }
    public void tax()
    {
        VAT= (0.12*pa);
    }
    public void bill()
    {
        Bill=Amount+VAT;
    }
    public void output()
    {
        System.out.println("Purcahse amt.: \t   "+pa);
        System.out.println("Discount: \t - "+discount);
        System.out.println("Tax(VAT): \t + "+VAT);
        System.out.println("Final Bill: \t"+Bill);
    }
    public void main()
    {
        Big_Bazar obj = new Big_Bazar();
        obj.input();
        obj.discount();
        obj.amount();
        obj.tax();
        obj.bill();
        obj.output();
    }
}