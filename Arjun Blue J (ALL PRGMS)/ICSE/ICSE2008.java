package ICSE;
import java.util.*;
public class ICSE2008
{
    double bill=0;int pan;String name;double taxinc;double tax;
    private void Q4_Employee_Input()
    {
        Scanner sc = new Scanner(System.in);
        pan=sc.nextInt();
        name = sc.nextLine();
        taxinc=sc.nextDouble();
    }    
    private void Calc()
    {
        if(taxinc>0 && taxinc<=100000)
        {bill=0;}
        if(taxinc>100000 && taxinc<=150000)
        {bill= 0.1*(taxinc-100000);}
        if(taxinc>150000 && taxinc<=2500000)
        {bill=5000+(0.2*(taxinc-1500000));}
        if(taxinc>2500000)
        {bill=25000+(0.3*(taxinc-2500000));}
    }
    private void Display()
    {
        System.out.println("Pan number: "+ pan);
        System.out.println("Name: "+ name );
        System.out.println("Tax Income: "+taxinc);
        System.out.println("Tax: "+bill);
    }
    public void Q4()
    {
        ICSE2008 Tax= new ICSE2008();
        Tax.Q4_Employee_Input();
        Tax.Calc();
        Tax.Display();
    }
    
    public static void Q5()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Statement here: ");
        String s = sc.nextLine();
        s=s.trim();
        
        for(int i=0;i<s.length();i++)
        {
          char ch = s.charAt(i);
          if(Character.isUpperCase(ch)==true)
          {
               ch = Character.toLowerCase(ch);
               System.out.print(ch);
          }
          else if(Character.isLowerCase(ch)==true)
          {
               ch = Character.toUpperCase(ch);
               System.out.print(ch);
          }
          else 
          {
              System.out.print(ch);
          }
        }
    }
    
    public static void Q6()//Doubt.
    {
        String city[]={"Delhi","Bangalore","Agra", "Mumbai","Calcutta"};
        for(int i=0;i<city.length;i++)
        {
            for(int j=0;j<city.length-1-i;j++)
            {
                if(city[j].compareTo(city[j+1])>0)
                {
                    String c=city[j];
                    city[j]=city[j+1];
                    city[j+1]=c;
                }
            }
        }
        
        for(int i=0;i<city.length;i++)
        {
            System.out.println(city[i]);
        }
    }   
    
        public static void Q7()
    {
        Scanner sc=new Scanner(System.in);
        int opt;
        do
        {
            System.out.println("1. Test for Palindrome number");
            System.out.println("2. Test for Perfect number");
            System.out.println("3. Exit");
            System.out.println("Enter a option : ");
            opt=sc.nextInt();
            switch(opt)
            {
                case 1:
                
                System.out.print("Enter a number: ");
                int m=sc.nextInt();
                doPalin2(m);
                String st= Integer.toString(m);
                st=st.trim();
                String pal="";
                for(int i=0;i<st.length();i++)
                {
                    char ch=st.charAt(i);
                    pal=ch+pal;
                }            
                if(pal.equals(m))
                {
                    System.out.println(m+" is a palindrome number.");
                }
                else
                {
                    System.out.println(m+" is not a palindrome number.");
                }
                break;
                case 2:
                System.out.print("Enter a number: ");
                int n=sc.nextInt();
                int s=0;
                for(int i=1;i<n;i++)
                {
                    if(n%i==0)
                    {
                        s=s+i;
                    }
                }
                if(s==n)
                {
                    System.out.println("Perfect no.");
                }
                else
                {
                    System.out.println("Not a Perfect no.");
                }
                break;
                case 3:
                System.out.println("Thank you");
                break;
                default:
                System.out.println("Invalid option");
            }
        }while(opt!=3);
    }
    public static void doPalin2(int m)
    {
        int n=m,rev=0;
        do
        {
            int d=n%10;
            rev=rev*10+d;
            n=n/10;
        }while(n!=0);
        if(rev==m)
        {
            System.out.println(m+" is a palindrome number.");
        }
        else
        {
            System.out.println(m+" is not a palindrome number.");
        }
    }
    public static void Q8_NIP()
    {
        
    }
    
    public static void Q9_1()
    {
        int pos=0,neg=0;
        for(int i=2;i<=20;i++)
        {
            if(i%4==0)
            {
                neg++;
            }
            else
            {
                pos++;
            }
        }
        int sum=pos-neg;
        System.out.println("sum=" + sum);
    }
    
    public static void Q9_2(int x)
    {
        int sum=0;
        for(int i=2;i<=x;i=i+3)
        {
            sum=sum+i;
        }
        System.out.println("Sum= "+sum);
    }
}
