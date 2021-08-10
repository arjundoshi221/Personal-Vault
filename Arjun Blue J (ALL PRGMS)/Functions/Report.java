package Functions;
import java.util.*;
public class Report
{
    String n,div;int rno,std; double m1,m2,m3,m4,m5,m6,T,avg; 
    
    public Report()
    {
        n="";
        div="";
        rno=0;
        std=0;
        m1=0.0;
        m2=0.0;
        m3=0.0;
        m4=0.0;
        m5=0.0;
        m6=0.0;
        T=0.0;
        avg=0.0;
    }
    
    public void input()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input name: ");
        n = sc.nextLine();
        System.out.println("Input Class: ");
        std = sc.nextInt();
        System.out.println("Input Div: ");
        div = sc.nextLine();
        System.out.println("Input Roll No: ");
        rno = sc.nextInt();
        System.out.println("Input Marks1: ");
        m1 = sc.nextDouble();
        System.out.println("Input Marks2: ");
        m2 = sc.nextDouble();
        System.out.println("Input Marks3: ");
        m3 = sc.nextDouble();
        System.out.println("Input Marks4: ");
        m4 = sc.nextDouble();
        System.out.println("Input Marks5: ");
        m5 = sc.nextDouble();
        System.out.println("Input Marks6: ");
        m6 = sc.nextDouble();
       
    }
    public void total()
    {
        T=m1+m2+m3+m4+m5+m6;
        
    }
    public void average()
    {
        avg=T/6;
        
    }
    public void display()
    {
        System.out.println(avg);
        
    }
    public void main()
    {
        Report R = new Report();
        R.input();
        R.total();
        R.average();
        R.display();
    }
}
