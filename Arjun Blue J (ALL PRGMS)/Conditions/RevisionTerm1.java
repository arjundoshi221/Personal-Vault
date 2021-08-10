package Conditions;
import java.util.*;
public class RevisionTerm1
{
    public static void fine(int days)
    {
       double bill = 0;
       if(days>=1 && days<=7)
              {bill = days*0.50;}
       if(days>7 && days<=14)
              {bill = 7*0.50 + (days - 7) * 1.00;}
       if(days>14 && days<=21)
              {bill = 7*0.50 + 7*1.00 + (days - 14)*1.50;}
       if(days>21 && days<=28)
              {bill = 7*0.50 + 7*1.00 + 7*1.50 + (days-21)*2.00;}
       if(days>28)
              {bill = 7*0.50 + 7*1.00 + 7*1.50 + 7*2.00 + (days-28)*3.00;}        
        System.out.println("Your bill = Rs " + bill);
    }
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of calls: ");
        int s = sc.nextInt();
        double bill=0;
        
        if(s>=0 && s<=100)
        {
            bill = s*1;
        }
         if(s>100 && s<=200)
        {
            bill = 100*1 + (s-100)*2;
        }
        if(s>200 && s<=300)
        {
            bill = 100*1 + 100*2 + (s-200)*3;
        }
         if(s>300 && s<=400)
        {
            bill = 100*1 + 100*2 +100*3 +(s-300)*4;
        }
        if(s>400)
        {
            bill = 100*1 + 100*2 +100*3 +100*4+(s-400)*5;
        }
        System.out.println("Amount = Rs" + bill);
    }
      public static void mainSOS()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter number");
        int n = sc.nextInt();
        int s=0;
        int i=3;
        while(i<=n)
        {
            System.out.println(i);
            s=s+i;
            i=i+3;
        }
        System.out.println("sum=" + s); 
    }
    public static void mainSOS_1()
    {
        //1 3 7 13.....n
        Scanner sc = new Scanner(System.in);
        System.out.print("enter number");
        int n = sc.nextInt();
        int s=0;
        int i=2;
        int t=1;
        while(t<=n)
        {
            System.out.println(t);
            s=s+t;
            t=t+i;
            i=i+2;
        }
        System.out.println("sum=" + s);
    }
    public static void SumOfSeries()
   {
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter an number to which you want a square");
       int n = sc.nextInt();
       int i=1;
       do
       {
           System.out.println(i*i);
           i=i+1;
       }
       while(i<=n);
   }
   public static void main2()
   {
       Scanner sc = new Scanner(System.in);
       System.out.print("Enter radius of circle: ");
       double r = sc.nextDouble();
       double area = 22.0/7*r*r;
       System.out.println("The area of circle = " + area);
   }
    
    
    
}
