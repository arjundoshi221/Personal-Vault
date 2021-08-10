package ICSE;
import java.util.*;
public class ICSE2006
{
    public static void Q4(int n)
    {
        int sumEven=0;
        int sumOdd=0;
        for(int i=1;i<=n;i++)
        {
            if(i%2==0)
            {
                sumEven=sumEven+i;
            }
            if(i%2==1)
            {
                sumOdd=sumOdd+i;
            }
        }
        System.out.println("Sum of Odd="+sumOdd);
        System.out.println("Sum of Even="+sumEven);
    }    
    
    public static void Q5(double cost)
    {
        double bill=0;
        if(cost>0 && cost<=2000)
        {
            bill=cost-(0.05*cost);
        }
        if(cost>2000 && cost<=5000)
        {
             bill=cost-(0.25*cost);
        }
        if(cost>5000 && cost<=10000)
        {
             bill=cost-(0.35*cost);
        }
        if(cost>10000)
        {
             bill=cost-(0.5*cost);
        }
        System.out.println("Total bill = Rs."+bill);
    }
    
    public static void Q6()
    {
        String s="26 January is celebrated as Republic Day";
        String print=s.replace("26","15");
        //System.out.println(s.indexOf("26"));
        print=s.replace("January","August");
        print=print.replace("Republic","Independence");
        System.out.println(print);
    }
    
    public static void Q7(int n)
    {
        System.out.println("Natural Log : "+Math.log(n));
        System.out.println("Absolute : "+Math.abs(n));
        System.out.println("Square Root : "+Math.sqrt(n));
    }
    
    public static void Q8_NO_OUTPUT()
    {
        Scanner sc = new Scanner(System.in);
        String n[]= new String[5];
        int m[]= new int[5];
        int h=0;
        int TotMk=0;
        int num=0;
        for(int i=0;i<5;i++)
        {
            System.out.println("Enter Name and then marks: ");
            n[i]=sc.nextLine();
            m[i]=sc.nextInt();
            if(m[i]>=100)
            {
                System.out.println("Error.Marks not in range");
            }
            else
            {
                TotMk= TotMk + m[i];
            }
        }
        for(int i=0;i<m.length;i++)
        {
            if(m[i]>h)
            {
                h=m[i];
                num=i;
            }
        }
        int avgMk= TotMk/5;
        System.out.println("Average Subject Marks= "+avgMk);
        System.out.println("Name: "+ n[num] );
        System.out.println("Highest Marks: " + m[num]);
        
    }
    
    public static void Q9NO_OUTPUT()
    {
        Scanner sc=new Scanner (System.in);
        int n[]=new int[15];
        System.out.println("Enter 15 numbers: ");
        for(int i=0;i<15;i++)
        {
           n[i]= sc.nextInt();
        }
        for(int i=0;i<15;i++)
        {
            for(int j=i+1;j<5;j++)
            {
                if(n[i]>n[j])
                {
                    int c=n[i];
                    n[i]=n[j];
                    n[j]=c;
                }
            }
        }
        
        for(int i=0;i<15;i++)
        {
            System.out.println(n[i]);
        }
    }
}

