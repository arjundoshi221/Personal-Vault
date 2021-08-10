package ICSE;
public class BookFair
{
    String Bname;
    double price;
    public BookFair()
    {
        Bname="a";
        price=0.0;
    }
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
        BookFair b=new BookFair();
        b.input(x,y);
        b.calculate();
        b.display();
    }
}

