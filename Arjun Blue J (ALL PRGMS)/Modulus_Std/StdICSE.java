package Modulus_Std;
public class StdICSE
{
    /**
     * 5!=1*2*3*4*5 = 120
     * 4!=1*2*3*4=24
     */
    public static void factorial(int n)
    {
        int f=1;
        for(int i=1;i<=n;i++)
        {
            f=f*i;
        }
        System.out.println("Factorial = "+f);
    }
    /**Prime
     * 5, 7, 11... with only 2 factors
     */
    public static void isPrime(int n)
    {
        int nof=0;
        for(int i=1;i<=n;i++)
        {
            if(n%i==0)
            {
                nof++;
            }
        }
        if(nof==2)
        {
            System.out.println(n+" is a prime no.");
        }
        else
        {
            System.out.println(n+" is a composite no.");
        }
    }
    /**
     * Perfect No.
     * 6 = 1 + 2 + 3 = 6
     * 28 = 1 + 2 +4 + 7+ 14 =28
     */
    public static void isPerfect(int n)
    {
        int sof=0;
        for(int i=1;i<n;i++)
        {
            if(n%i==0)
            {
                sof=sof+i;
            }
        }
        if(sof==n)
        {
            System.out.println(n+" is a perfect no.");
        }
        else
        {
            System.out.println(n+" is not a perfect no.");
        }
    }
    public static void isPerfectNumListfrom1tolastnum(int lastNo)
    {
        //NIP
        for(int n=1;n<=lastNo;n++)
        {
            int sof=0;
            for(int i=1;i<n;i++)
            {
                if(n%i==0)
                {
                    sof=sof+i;
                }
            }
            if(sof==n)
            {
                System.out.println(n+" is a perfect no.");
            }
            /*else
            {
                System.out.println(n+" is not a perfect no.");
            }*/
        }
    }
    /**
     * Swap
     * */
    public static void swap(int a, int b)
    {
        System.out.println("Orignal Values\n a= "+a+"b= "+b);
        int c=a;
        a=b;
        b=c;
        System.out.println("After Swap Values\n a= "+a+"b= "+b);
    }
    public static void swap2WithoutVariable(int a, int b)
    {
        System.out.println("Orignal Values\n a= "+a+"b= "+b);
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("After Swap Values\n a= "+a+"b= "+b);
    }
    public static void lcm_gcdAndHcf(int a, int b)
    {
        int hcf=0 ;
        for(int i=1;i<=a;i++)
        {
            if(a%i==0 && b%i==0)
            {
                hcf=i;
            }
        }
        System.out.println("HCF = "+hcf);
        int lcm_gcd=a*b/hcf;
        System.out.println("lcm_gcd = "+lcm_gcd);
    }
    /**
     * Armstrong No.
     * 153 = 3^3 + 5^3 +1^3 = 153 ==>27+125+1
     */
    public static void doArmstrong(int n)
    {
        int m=n,s=0;//153
        do
        {
            int d=n%10;//3
            s=s+d*d*d;//27+x
            n=n/10;//15
        }while(n!=0);
        if(s==m)
        {
            System.out.println(m+" is an Armstrong no.");
        }
        else
        {
            System.out.println(m+" is not an Armstrong no.");
        }
    }
    /**
     * Krishnamurty No.
     * 145==> 1!+4!+5!=1+24+120 = 145
     */
    public static void doKM(int n)
    {
        int m=n,s=0;
        do
        {
            int d=n%10;
            n=n/10;
            int f=1;
            for(int i=1;i<=d;i++)
            {
                f=f*i;
            }
            s=s+f;
        }while(n!=0);
        if(s==m)
        {
            System.out.println(m+" is an KM no.");
        }
        else
        {
            System.out.println(m+" is not an KM no.");
        }
    }
    /***
     * Niven No.
     * 12==> 2 + 1=3
     * 12%3==0
     */
    public static void Niven_HarshadNo(int n)
    {
        int m=n;int s=0;
        do
        {
         int d = n%10;  
         s=s+d;
         n=n/10;
        }while(n!=0);
        if(m%s==0)
        {
            System.out.println("It is a Niven(Harshad) No.");
        }
        else
        {
            System.out.println("It is NOT a Niven(Harshad) No.");
        }
   }
   /** to revise from here
    * Automorphic No.
    * 5 ==> 5^2 ==> 2(5)
    * 25==> 25^2==> 6(25)
    * 10 ==> 10^2 ==> 1(00) 
    *     xxxxxxx
    */
   public static void doAN(int n)
   {
       int sq=n*n, partSq, m=n, nod=0;
       //String s=Integer.toString(n);
       //System.out.println(s);
       do
       {
           int d=n%10;
           nod++;
           n=n/10;
       }while (n!=0);
       partSq=sq%(int)Math.pow(10,nod);
       if(partSq==m)
        {
            System.out.println(m+"It is a Automorphic No.");
        }
        else
        {
            System.out.println("It is NOT a Automorphic No.");
        }
   }
   /**
    * Greatest Digit
    */
   public static void greatestDigit(int n)
    {
        int m=n;int grDigit=0;
        do
        {
         int d = n%10;  
         if(d>grDigit)
           { 
               grDigit=d;
           }
         n=n/10;
        }while(n!=0);
        System.out.println(grDigit+" Greatest digit");
   }
    /**
    * Odd Even Digit
    * Prod of Even
    * Sum of Odd
    */
   public static void OEDigit(int n)
    {
        int m=n;
        int oDigit=0, eDigit=1;
        do
        {
             int d = n%10;  
             if(d%2==1)
               { oDigit=oDigit+d;}
             else
                {eDigit=eDigit*d;}
             n=n/10;
        }while(n!=0);
        System.out.println(oDigit+" Sum of Odd digit");
        System.out.println(eDigit+" Product of Even digit");
   }
   /**
    * Special Digit:
    * 59==>(5+9)+(5*9)==>14+45==> 59
    */
   public static void specialDigit(int n)
    {
        int m=n;int sumDigit=0, prDigit=1;
        do
        {
             int d = n%10;  
             sumDigit=sumDigit+d;
             prDigit=prDigit*d;
             n=n/10;
        }while(n!=0);
        if(sumDigit+prDigit==m)
        {
            System.out.println(m+": Is special digit");
        }
        else
        {
            System.out.println(m+": Is NOT special digit");
        }
    }
   public static void doRandom()
   {
       
       int a=(int)(Math.random()*1000)+100;
       int b=(999-(int)(Math.random()*1000))+100;
       System.out.println(a);
       System.out.println(b);
       
   }
 
}
