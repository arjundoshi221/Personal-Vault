package ICSE;
import java.util.*;
class ICSE2017
{
    public static void Q5()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter No. here: ");
        int n = sc.nextInt();
        int m=n;
        int sum=0,prod=1;
        do
        {
            int d=n%10;
            sum=sum+d;
            prod=prod*d;
            n=n/10;
        }while(n!=0);
        if(prod==sum)
        {
            System.out.println("Spy Number");
        }
        else
        {
            System.out.println("NOT Spy Number");
        }
    }
    
    
    
    public static void Q6()
    {
        Scanner sc = new Scanner (System.in);
        int opt;
        do
        {
            System.out.println("1: Pattern A");
            System.out.println("2: Pattern B");
            System.out.println("3: Exit");
            System.out.print("Enter your choice: ");
            opt=sc.nextInt();
            
            switch(opt)
            {
                case 1: doPatA();
                break;
                case 2: doPatB();
                break;
                case 3: System.out.println("Thank you. Have a nice day.");
                break;
                default:
                System.out.println("Incorrect Input.");
            }
        }while(opt!=3);
    }
    private static void doPatB()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no of lines: ");
        int n = sc.nextInt();
        int t=0;
        for(int i=0;i<=n;i++)
        {
            t=(t*10)+1;
            System.out.print(t+" ");
        }
    }
    private static void doPatA()
    {
        double sp=0,sn=0,s=0;
        int x = 2;
        int t=0;
        for(int i=0;i<=20;i++)
        {
            if(i%2==0)
            sn=sn+(Math.pow(2,i));
            if(i%2==1)
            sp=sp+(Math.pow(2,i));
        }
        s=sp-sn;
        System.out.println("Sum = "+s);
    }
    
    
    public static void Q7()
    {
        Scanner sc = new Scanner(System.in);
        int n[]=new int[20];
        int l = n[0],h=n[0],s=0;
        System.out.println("Enter nos. ");
        for(int i=0;i<n.length;i++)
        {
            n[i]=sc.nextInt();
            s=s+n[i];
            if(l>n[i])
            l=n[i];
            if(h<n[i])
            h=n[i];
        }
        System.out.println("Highest no: "+h);
        System.out.println("Lowest no: "+l);
        System.out.println("Sum: "+s);
    }
    
    
    public static void Q8()
    {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter your Statement here: ");
        String s = sc.nextLine();
        System.out.println("Enter letter to search: ");
        String input = sc.nextLine();
        char in = input.charAt(0);
        int c =0;
        for(int i= 0;i<s.length();i++)
        {
            char ch = s.charAt(i);
            if(ch==in)
            {
                c++;
            }
        }
        
        System.out.println("Number of "+input+" present is "+c);
        
    }
    
    public static void Q9()
    {
        Scanner sc = new Scanner (System.in);
        String s[]= new String[4];
        System.out.println("Enter words here: ");
        for(int i=0;i<s.length;i++)
        {
            s[i]=sc.nextLine();
        }
        
        for(int i=0;i<s.length;i++)
        {
            for(int j=1+1;j<s.length;j++)
            {
                if(s[i].compareToIgnoreCase(s[j])<0)
                {
                    String c = s[i];
                    s[i]=s[j];
                    s[j]=c;
                }
            }
        }
        
        for(int i=0;i<s.length;i++)
        {
            System.out.println(s[i]);
        }
    }
}