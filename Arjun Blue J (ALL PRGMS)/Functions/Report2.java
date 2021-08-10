package Functions;
import java.util.*;
public class Report2
{
    String n,div;int rno,std; double m1,m2,m3,m4,m5,m6,T,avg; 
    
    public Report2(String tn,String tdiv,int trno, int tstd, double tm1,double tm2,double tm3,double tm4,double tm5,double tm6)
    {
        n=tn;
        div=tdiv;
        rno=trno;
        std=tstd;
        m1=tm1;
        m2=tm2;
        m3=tm3;
        m4=tm4;
        m5=tm5;
        m6=tm6;
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
    public static void main(String tn,String tdiv,int trno, int tstd, double tm1,double tm2,double tm3,double tm4,double tm5,double tm6)
    {
        Report2 R = new Report2(tn,tdiv,trno, tstd, tm1, tm2, tm3, tm4, tm5, tm6);
        //R.input();
        R.total();
        R.average();
        R.display(); 
    }
}
