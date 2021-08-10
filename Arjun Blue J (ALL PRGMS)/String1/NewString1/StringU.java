package String1.NewString1;

public class StringU
{
    public static void main(String s)
    {
        int c=0,b=0,a=0,d=0;
        
        for(int i=0;i<s.length();i++)
        {
            char ch= s.charAt(i);
            if(Character.isLetter(ch)==true)
            {
                a++;
            }
            else if(Character.isDigit(ch)==true)
            {
                b++;
            }
            else if(Character.isSpace(ch)==true)
            {
                d++;
            }
            else
            {
                c++;
            }
            
        }
        System.out.println("Alphabets: "+ a);
        System.out.println("Digits: "+ b);
        System.out.println("Special Charcters: "+ c);
    }
    public static void main2(String s)
    {
        int c=0;
        int b=0;
        int a=0;
        int d=0;
        for(int i=0;i<s.length();i++)
        {
            char ch= s.charAt(i);
            if(Character.isLetter(ch)==true)
            {
                a++;
            }
            else if(Character.isDigit(ch)==true)
            {
                b++;
            }
            else if(Character.isLetterOrDigit(ch)==false)
            {
                d++;
            }
           
            
        }
        System.out.println("Alphabets: "+ a);
        System.out.println("Digits: "+ b);
        System.out.println("Special Charcters: "+ d);
    }
}
