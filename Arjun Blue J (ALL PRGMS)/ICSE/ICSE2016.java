package ICSE;
import java.util.*;
import java.util.*;
public class ICSE2016
{
    public static void Q5()
    {
        Scanner sc = new Scanner (System.in);
        int opt;
        
        do
        {
            System.out.println("1: Floyd Tri ");
            System.out.println("2: ICSE Tri ");
            System.out.println("3: Exit ");
            System.out.print("Enter choice here: ");
            opt = sc.nextInt();
            
            switch(opt)
            {   
                case 1:
                doFloyd();
                break;
                case 2:
                doICSE();
                break;
                case 3:
                System.out.println("Thank You. Have a nice day!");
                break;
                default:
                System.out.println("Wrong input.Try again.");
            }
        }while(opt!=3);
    }
    private static void doFloyd()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no. of Lines: ");
        int n = sc.nextInt();
        int c=1;
        
        for(int i=0;i<=n;i++)
        {
            for(int j=0;j<=i;j++)
            {
                System.out.print(c+" ");
                c++;
            }
            System.out.println();
        }
    }
    private static void doICSE()
    {
        String s = "ICSE";      
        for(int i=0;i<s.length();i++)
        {
            for(int j=0;j<=i;j++)
            {
                System.out.print(s.charAt(j));
            }
            System.out.println();
        }
    }
    
    
    
    public static void Q6()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter word: ");
        String s = sc.nextLine();
        String w="";
        s=s.trim().toUpperCase();
        int c =0;
        
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            w=ch+w;
            
        }
        if(s.charAt(0)==s.charAt(s.length()-1))
        {
            c++;
        }
        
        if(c!=0 && s.equals(w))
        {
            System.out.println("Palindrome Special No.");
        }
        else if (c!=0)
        {
            System.out.println("Special No.");
        }
        else if (s.equals(w))
        {
            System.out.println("Palindrome No.");
        }
        else
        {
            System.out.println("Neither");
        }

    }
     
    
    
    public static void SumOfSeries_Q7(int n,double x)
    {
        double s1=0,s2=0,s=0;
        double t=0;
        for(int i=1;i<=n;i++)
        {
            if(i%2==1)
            {
                t=(x/i);
                s1=s1+t;
            }
            if(i%2==0)
            {
                t=(x/i);
                s2=s2+t;
            }    
        }
        s=s2-s1;
        System.out.println("Sum: "+s);
    }
    public static void SumOfSeries_Q7()
    {
        int t=1;
        int s=0;
        
        for(int i=1;i<=20;i++)
        {
            t=t*i;
            s=s+t;
        }
        System.out.println("Sum: "+s);
    }
    
    
    
    public static void Q8()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number: ");
        int n = sc.nextInt();
        
        int m =n;int s=0;
        
        do
        {
            int d=n%10;
            s=s+d;
            n=n/10;
        }while(n!=0);
        if(m%s==0)
        {
            System.out.println("Niven Number");
        }
        if(m%s!=0)
        {
            System.out.println("NOT Niven Number");
        }
    }
    
    
    
    public static void Q9()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Country Name: ");
        String nam = sc.nextLine();
        String wonder[]={"CI","CTR","TM","GWC","MP","P","C"};
        String country[]={"Mexico","Brazil","India","China","Peru","Jordan","Italy"};
        int f=0;
        
        for(int i=0;i<country.length;i++)
        {
            if(country[i].compareToIgnoreCase(nam)==0)
            {
                f++;
                System.out.println(country[i]+"-"+wonder[i]);
            }
        }
        if(f==0)
        {
            System.out.println("Sorry not found!");
        }
    
    }
}
