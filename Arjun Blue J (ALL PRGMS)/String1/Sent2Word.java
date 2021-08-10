package String1;
import java.util.Scanner;
public class Sent2Word
{
    String w="ARJUN";
    public static void doSent2Word(String s)
    {
        s=s.trim();
        int c=0;
        s=s+' ';
        String w="";
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            if(ch!=' ')
            {
                w=w+ch;
            }
            else
            {
               if(w.length()>0)
                {
                    System.out.println(w);
                    c++;
                }
                w="";
            }
        }
        System.out.println("No. of words = "+c);
    }
    public static void doSent2WordReverse(String s)
    {
        s=s.trim();
        int c=0;
        s=s+' ';
        String w="";
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            if(ch!=' ')
            {
                w=ch+w;
            }
            else
            {
                if(w.length()>0)
                {
                    System.out.print(w.toUpperCase() +" ");
                    c++;
                }
                w="";
            }
        }
        System.out.println("No. of words = "+c);
    }
    
      public static void doSent2Word(String s, char n)
    {
        s=s.trim();
        //char N=(char)(n-32);
        char N=Character.toUpperCase(n);
        int c=0;
        s=s+' ';
        String w="";
        System.out.print(" The words starting with " + n + " = ");
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            if(ch!=' ')
            {
                w=w+ch;
            }
            else
            {
               if(w.length()>0)
                {
                    if(w.charAt(0)==n|| w.charAt(0)==N)
                    {
                        System.out.print("\n"+w+ " ");
                    }
                      c++;
                }
                w="";
            }
        }
        
        System.out.println("\nNo. of words = "+c);
    }
    /**
     * To display words starting with A or a
     */
    public  void doTestTrim(String s)
    {
        System.out.println("Original *"+s+"*");
        System.out.println("With Trim *"+s.trim()+"*");
         w="ADITI";
        System.out.println("Method : "+w);
        System.out.println("Class : "+w);
    }
    public  static void doStartEndSame()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter statement: ");
        String s = sc.nextLine();
        s=s.trim();
        int c=0;
        s=s+' ';
        s=s.toLowerCase();
        String w="";
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            if(ch!=' ')
            {
                w=w+ch;
            }
            else
            {
                if(w.length()>0)
                {
                    if(w.charAt(0)== w.charAt(w.length()-1) )
                    {
                        System.out.print(Character.toUpperCase(w.charAt(0))+w.substring(1) +" ");
                        c++;
                    }
                }
                w="";
            }
        }
        System.out.println("\nNo. of words = "+c);
    }
    public  static void doCalculateNumberOfA(String s)
    {
        s=s.trim();
        int c=0;
        s=s+' ';
        s=s.toLowerCase();
        String w="";
        for(int i=0;i<s.length();i++)
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
                    if(w.charAt(0)== 'a')
                    {
                        System.out.println(w);
                        c++;
                    }
                }
                w="";
            }
        }
        System.out.println("No. of words = "+c);
    }
    public  static void doCalculateNumberOfA()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter statement: ");
        String s = sc.nextLine();
        s=s.trim();
        int c=0;
        s=s+' ';     
        String w="";
        for(int i=0;i<s.length();i++)
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
                    if(w.charAt(0)== 'a'|| w.charAt(0)== 'A')
                    {
                        System.out.println(w);
                        c++;
                    }
                }
                w="";
            }
        }
        System.out.println("No. of words = "+c);
    }
}
