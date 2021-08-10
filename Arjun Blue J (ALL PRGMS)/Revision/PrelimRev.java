package Revision;

public class PrelimRev
{
    public static void Billing1(int n)
    {
        double bill =0;
        if(n>0 && n<=100)
        {
            bill = n*1.20;
        }
        if(n>100 && n<=250)
        {
            bill = (100*1.20) + (n-100)*2.50;
        }
        if(n>250 && n<=500)
        {
            bill = (100*1.20) + (150*2.50)+ (n-250)*5;
        }
        if(n>500)
        {
            bill = (100*1.20) + (150*2.50)+ (250*5)+ (n-500)*8;
        }
        
        System.out.println("Bill = "+bill);
    }
    public static void weight(double w)
    {
        double bill = 0;
        if(w==1)
        {
            bill =15;
        }
        if(w>1)
        {
            bill = 15 + (int)(w-1)*16;
            double remain=((w-1)-(int)(w-1));
            if(remain==0)
            {
                bill+=0;
            }
            else if(remain>0 && remain<=0.5)
                    bill+=8;
                else
                   bill+=16;
        }
        System.out.println("Bill = " + bill);
    }
    
    public static void weight2(double w)
    {
        double bill = 0;
        if(w==1)
        {
            bill =15;
        }
        if(w>1)
        {
            w=w-1;
            bill=15;
            do
            {
                w=w-0.5;
                bill=bill+8;
                
            }while(w<0);
        }
        System.out.println("Bill = " + bill);
    }
    
    public static void SeriesT(int n)
    {
        int S=0; int t=1;
        for(int i=0; i<=n;i++)
        {
            S=S+t;
            t=(t*10)+1;
        }
        System.out.println("Sum"+S);
    }
    
    public static void namesurname(String s)
    {
        s=s.trim();
        String w="";
        int index = s.lastIndexOf(" ");
        System.out.print(s.substring(index)+" ");
        
        for(int i=0;i<=index;i++)
        {
            char ch = s.charAt(i);
            if(ch!=' ')
            {
                w=w+ch;
            }
            else
            {
                if(w.length()>0)
                {
                    System.out.print(w.charAt(0)+".");
                }
                w="";
            }
        }
    }
    
    public static void UpperToLower(String s)
    {
        s=s.trim();
        
        for(int i=0;i<s.length();i++)
        {
            char ch = s.charAt(i);
            if(Character.isLowerCase(ch)==true)
            {
                Character.toUpperCase(ch);
            }
            else if (Character.isUpperCase(ch)==true)
            {
                Character.toLowerCase(ch);
            }
            
        }
    }
    
}

