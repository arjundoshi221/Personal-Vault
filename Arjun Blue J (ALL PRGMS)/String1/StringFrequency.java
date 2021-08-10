package String1;
import java.util.*;
public class StringFrequency
{
    public static void FrequencyOf_a_A()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter statement:");
        String a = sc.nextLine();
        int  number = 0;
        System.out.println("The number of Chars= "+ a.length());
        System.out.println("The 0 letter according to comp= "+ a.charAt(0));
        for(int i=0;i<a.length();i++)
        {
            char ch = a.charAt(i);
            if(ch=='a'||ch=='A'||ch=='e'||ch=='E'||ch=='i'||ch=='I' ||ch=='o'||ch=='O'||ch=='u'||ch=='U')             
            {
               number++;
            }
        }
            System.out.println("\f");
            System.out.println(a);
            System.out.println("The number of vowels in the statement = "+number);
    }
    public static void FrequencyOfSp()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter statement:");
        String a = sc.nextLine();
        int  number = 0;
        System.out.println("The number of Chars= "+ a.length());
        System.out.println("The 0 letter according to comp= "+ a.charAt(0));
        for(int i=0;i<a.length();i++)
        {
            char ch = a.charAt(i);
            //if(ch>='a'&& ch<='z'||ch>='A'&&ch<='Z') 
            if(Character.isLetter(ch)) 
            {
               number++;
            }
        }
        for(int i=0;i<a.length();i++)
        {
            char ch = a.charAt(i);
            if(ch>='a'&& ch<='z'||ch>='A'&&ch<='Z'||ch>='0'&& ch<='9')            
            {
              
            }
            else
            {
                 number++;
            }
        }
        /**
        for(int i=0;i<a.length();i++)
        {
            char ch = a.charAt(i);
            if(ch<'0'|| ch>'9' && ch<'A'|| ch>'Z'&& ch<'a'|| ch>'z' )        
            {
               number++;
            }
        }
        */
            System.out.println("The number of sp in the statement = "+number);
    }
    public static void FrequencyOfVowelsAll()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter statement:");
        String a = sc.nextLine();
        int  number = 0,numberE = 0,numberI = 0,numberO= 0,numberU = 0;
        System.out.println("The number of Chars= "+ a.length());
        System.out.println("The 0 letter according to comp= "+ a.charAt(0));
        for(int i=0;i<a.length();i++)
        {
            char ch = a.charAt(i);
            if(ch=='a'||ch=='A')             
            {
               number++;
            }
            if(ch=='e'||ch=='E')             
            {
               numberE++;
            }
            if(ch=='i'||ch=='I')             
            {
               numberI++;
            }
            if(ch=='o'||ch=='O')             
            {
               numberO++;
            }
            if(ch=='u'||ch=='U')             
            {
               numberU++;
            }
        }
        System.out.println("The number of a in the statement = "+number);
        System.out.println("The number of e in the statement = "+numberE);
        System.out.println("The number of i in the statement = "+numberI);
        System.out.println("The number of o in the statement = "+numberO);
        System.out.println("The number of u in the statement = "+numberU);
    }
   
  public static void FrequencyOfdigits()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter statement:");
        String a = sc.nextLine();
        int  number = 0;
        System.out.println("The number of Chars= "+ a.length());
        System.out.println("The 0 letter according to comp= "+ a.charAt(0));
        for(int i=0;i<a.length();i++)
        {
            char ch = a.charAt(i);
            if(ch>=48&&ch<=56)             
            {
               number++;
            }
        }
         System.out.println("The number of digits in the statement = "+number);
    }
    
     public static void FrequencyOfSpaces()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter statement:");
        String a = sc.nextLine();
        int  number = 0;
        System.out.println("The number of Chars= "+ a.length());
        System.out.println("The 0 letter according to comp= "+ a.charAt(0));
        for(int i=0;i<a.length();i++)
        {
            char ch = a.charAt(i);
            if(ch==' ')             
            {
               number++;
            }
        }
         System.out.println("The number of spaces in the statement = "+number);
    }
    public static void FrequencyOfWord()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter statement:");
        String a = sc.nextLine();
        int  number = 0;
        for(int i=0;i<a.length();i++)
        {
            char ch = a.charAt(i);
            if(ch==' ')             
            {
               number++;
            }
        }
         System.out.println("The number of words in the statement = "+(number+1));
    }
}
