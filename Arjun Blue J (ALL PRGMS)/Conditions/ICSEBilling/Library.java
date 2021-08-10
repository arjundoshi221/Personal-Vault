package Conditions.ICSEBilling;
import java.util.*;
public class Library
{
    int b_no,ph_no,r_days; double f_amt; String name;double fine;
    public Library()
    {
       b_no=0;
       ph_no=0;
       r_days=0;
       f_amt=0.0;
       name="";
    }
    private void accept()
    {
       Scanner sc = new Scanner (System.in);
        System.out.println("Enter Name, Book Number, Phone number, No. Of Late Days: ");
       name=sc.nextLine();
       b_no=sc.nextInt();
       ph_no=sc.nextInt();
       r_days=sc.nextInt();
    }
    private void fine()
    {
        if(r_days>0 && r_days<=5)
        {
             fine = 1.50*r_days;
        }
        if(r_days>5 && r_days<=10)
        {
             fine = 1.50*5 + 1.75*(r_days-5);
        }
        if(r_days>10)
        {
             fine = 1.50*5 + 1.75*5 + 2*(r_days-10);
        }
        
    }
    private void display()
    {
        System.out.println("Book Number: "+b_no+"\t  "+"Phone Number: "+ph_no+"\t  "+"Name: "+name+"\t  "+"No. of Days: "+r_days);
        System.out.println("Fine: "+fine);
    }
    public void main()
    {
        Library obj = new Library();
        obj.accept();
        obj.fine();
        obj.display();
    }
}
