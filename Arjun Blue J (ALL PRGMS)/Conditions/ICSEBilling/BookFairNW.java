package Conditions.ICSEBilling;
public class BookFairNW
{
    String Bname;//null
    double price;
    static double totalPrice=0;
    /*public BookFair()//constructor
    {
        Bname="a";
        price=0.0;        (char)(ch+j)
    }*/
    public void input(String a, double p)
    {
        Bname=a;
        price=p;
    }
    public void calculate()
    {
        double d=0;
        if (price<=1000)
        {
            d=2;
            System.out.println("2% discount");
        }
        if (price>1000 && price <=3000)
        {
            d=10;
            System.out.println(" 10% discount");
        }
        if (price>3000)
        {
            d=15;
            System.out.println(" 15% discount");
        }
        double dis=d/100*price;
        price=price-dis;
    }
    public void display()
    {
        System.out.println("Book Name = "+Bname);
        System.out.println("Price after discount = "+price);
    }
    public   void main(String x, double y)
    {
        BookFairNW b= new BookFairNW();
        b.input(x,y);
        b.calculate();
        b.display();
        System.out.println("Price : "+price);
        System.out.println("Price after discount = "+price);
        System.out.println("Total Price Before : "+totalPrice);
        totalPrice=totalPrice+price;
        System.out.println("Total Price after : "+totalPrice);
        //price=0;
    }
}

