package Arrays;
import java.util.*;
public class Rev3
{
    public static void Q1 ()
    {
        int n[]={1,2,3,4,5,6,7,8,9,10,11,1,3,2,3,4,5,4,63,45};
        int le=n[0],so=n[0];
        
        for(int i=0;i<n.length;i++)
        {
            if(n[i]>le && n[i]%2==0)
            {
                le=n[i];
            }
            if(n[i]<so && n[i]%2!=0)
            {
                so=n[i];
            }
        }
        System.out.println("Largest even no = "+le);
        System.out.println("Smallest odd no = "+so);
    }    
    public static void Q4()
    {
        String CO[]={"India","USA","China","Pakistan"};
        String CA[]={"Mumbai","Washington DC","Tibet","Lahore"};
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter Country to search: ");
        String co=sc.nextLine();
        int c=0;
        for(int i=0;i<CO.length;i++)
        {
            if(co.equalsIgnoreCase(CO[i]))
            {
                System.out.println("Country: "+ CO[i]);
                System.out.println("Capital: "+ CA[i]);
                c++;
            }
            
        }
        if(c==0)
        {
            System.out.println("Sorry not found");
        }
    }
        public static void  Q5()
    {
        Scanner sc = new Scanner (System.in);
        String n[]= new String [15];
        System.out.println("Enter the names");
        for(int i=0;i<15;i++)
        {
            n[i]=sc.nextLine();
        }
        System.out.println("Enter name to search");
        String namesearch=sc.nextLine();
        int c=0;
        
        for(int i=0;i<n.length;i++)
        {
            if(n[i].equalsIgnoreCase(namesearch))
            {
                c++;
                System.out.println("Name found"+n[i]);
            }
        }
        if(c==0)
            {
                System.out.println("Not found");
            }
    }
    public static void Q6()
    {
        Scanner sc = new Scanner (System.in);
        
        System.out.print("Enter the Values: ");
        int n[]=new int[15];
        for(int i=0;i<15;i++)
        {
            n[i]=sc.nextInt();
            
        }
         
        System.out.print("Enter the Search Number: ");
        int sno= sc.nextInt();
        int f=0;
        for(int i=0;i<n.length;i++)
        {
            if(sno==n[i])
            {
                f++;
            }
        }
           if(f>0)
            {
                System.out.println("Your number "+ sno +" was found "+ f + " number of times");
            }
            else
            {
                System.out.println("Not found");
            }
        }
    public static void Q7()
    {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter values: ");
        int n[]= new int[15];
        for(int i=0;i<15;i++)
        {
            n[i]=sc.nextInt();
        }
        
        for(int i=0;i<n.length;i++)
        {
            for(int j=i+1;j<n.length;j++)
            {
                if(n[i]<n[j])
                {
                    int c=n[i];
                    n[i]=n[j];
                    n[j]=c;
                }
            }
       
        }
        System.out.println();
        for(int i=0;i<n.length;i++)
        {
           System.out.println( n[i]);
        }
    }
    public static void Q8()
    {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter names: ");
        String n[]= new String[15];
        for(int i=0;i<15;i++)
        {
            n[i]=sc.nextLine();
        }
        
        for(int i=0;i<n.length;i++)
        {
            for(int j=i+1;j<n.length;j++)
            {
                if(n[i].compareTo(n[j])<0)
                {
                    String c=n[i];
                    n[i]=n[j];
                    n[j]=c;
                }
            }
        }
        for(int i=0;i<n.length;i++)
        {
           System.out.println( n[i]);
        }
    }
    public static void Q10_1(String s)
    {
        String name[]={"Arjun","Ayaan","Amev","Siddharth","Dhruv","Kuchi","Jai","Arjun","Rian"};
        String surn[]={"Doshi","Patel","Pereira","Pillai","Shah","Vishram","Rajani","Bahl","Jain"};
        int c=0;
        for(int i=0;i<name.length;i++)
        {
            if(s==name[i])
            {
                c++;
                System.out.println("Name found: "+ name[i]+ " " + surn[i]);
            }
        }
        if(c==0)
        {
            System.out.print("No record found");
        }
    }
    public static void QXYZ()
    {
        
    }
}

