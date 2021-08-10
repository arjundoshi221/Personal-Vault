package ICSE;
import java.util.*;
public class ICSE2005
{
    public static void Q4 ()
    {
        
    }
    public static void Q5(String s)
    {
        s=s.trim();
        s=s+" ";
        String w="";
        int numberOfVowel=0;
        int numberOfChar=s.length()-1;
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            if(ch!=' ')
            {
                w=ch+w;
            }
            
            if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U')
            {
                 numberOfVowel++;
            }
        }
        System.out.println("Total number of Characters = " + numberOfChar);
        System.out.println("Total number of Vowels = " + numberOfVowel);
        System.out.println("Reverse String = " + w);
    }
    public static void Q6()
    {
        Scanner sc=new Scanner(System.in);
        int opt;
        
        do{
            System.out.println("1. Area of Circle");
            System.out.println("2. Area of Square");
            System.out.println("3. Area of Rectangle");
            System.out.println("4. Exit menu");
            opt=sc.nextInt();
            
            switch(opt)
            {
                case 1:
                System.out.print("Enter radius:");
                double r = sc.nextDouble();
                double Area1=3.14*r;
                System.out.println("Area of Circle = "+ Area1);
                break;
                case 2:
                System.out.print("Enter side:");
                double s = sc.nextDouble();
                double Area2=s*s;
                System.out.println("Area of Square = "+ Area2);
                break;
                case 3:
                System.out.print("Enter length:");
                 double l = sc.nextDouble();
                System.out.print("Enter breadth:");
                 double b = sc.nextDouble();
                double Area3=l*b;
                System.out.println("Area of Rectangle = "+ Area3);
                break;
                case 4:
                System.out.println("Thank You!");
                break;
                default:
                System.out.println("Invalid Input!");       
            }
        }while(opt!=4);
    }
    public static void Q7bubble(int m[])//bubble sort
    {
       
        for(int i=0;i<m.length;i++)
        {
            for(int j=0;j<m.length-1-i;j++)
            {
                if(m[j]>m[j+1])
                {
                    int c=m[j];
                    m[j]=m[j+1];
                    m[j+1]=c;
                }
            }
        }
        
        for(int i=0;i<m.length;i++)
        {
            System.out.println(m[i]);
        }
    }
    public static void Q8(int N[])
    {
        int sumEvenPos=0;
        int sumOddPos=0;
        int sumNeg=0;
        for(int i=0;i<N.length;i++)
        {
            if(N[i]%2==0 && N[i]>0)
            {
                sumEvenPos=sumEvenPos+N[i];
            }
             if(N[i]%2==1 && N[i]>0)
            {
                sumOddPos=sumOddPos+N[i];
            }
             if(N[i]<0)
            {
                sumNeg=sumNeg+N[i];
            }
            if(N[i]==0)
            {
                break;
            }
        }
        System.out.println("Sum of Negative numbers = " + sumNeg );
        System.out.println("Sum of Even Positive numbers = "+sumEvenPos);
        System.out.println("Sum of Odd Positive  numbers = "+sumOddPos);
    }
    
    public static void Q9(String NAME)
    {
        String name[]={"Arjun","Aditi","Anushka","Sejal","Digish"};
        int tel[]={9619,9613,9828,9821,9827};
        int c=0;
        for(int i=0;i<name.length;i++)
        {
            if(NAME.compareToIgnoreCase(name[i])==0)
            {
                c++;
                System.out.println("Search Successful:");
                System.out.println("Name:"+name[i]);
                System.out.println("Number:"+tel[i]);
            }
        }
        if(c==0)
        {
            System.out.println("Search Unsuccessful.Name not listed.Thank You!");
        }
    }
}

