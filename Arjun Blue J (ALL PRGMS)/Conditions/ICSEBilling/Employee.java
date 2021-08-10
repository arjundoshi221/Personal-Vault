package Conditions.ICSEBilling;
import java.util.*;
public class Employee
{
    String name;int code; double bs,all,gs,tax,ns;
    
    public Employee()
    {
        name="";
        code=0;
        bs=0.0;
        all=0.0;
        gs=0.0;
        tax=0.0;
        ns=0.0;
    }
    private void accept()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter name: ");
        name=sc.nextLine();
        System.out.println("Enter code: ");
        code=sc.nextInt();
        System.out.println("Enter bs: ");
        bs=sc.nextDouble();
        
    }
    private void allow()
    {
        all = 0.55*bs;
    }
    private void gross()
    {
        gs=bs+all;
    }
    private void incomeTax()
    {
        tax = 0.12*gs;
    }
    private void net()
    {
        ns=gs-tax;
    }
    private void display()
    {
        System.out.println("Name: "+name);
        System.out.println("Code: "+code);
        System.out.println("Basic Salary: "+bs);
        System.out.println("Allowance: "+all);
        System.out.println("Gross Salary: "+gs);
        System.out.println("Tax: "+tax);
        System.out.println("Net Salary: "+ns);
    }
    public void main()
    {
       Employee obj = new Employee();
       obj.accept();
       obj.allow();
       obj.gross();
       obj.incomeTax();
       obj.net();
       obj.display();
    }
}
