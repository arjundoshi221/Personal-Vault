package String1;
import java.util.*;
public class StringU
{
   public static void main()
   {
       Scanner sc = new Scanner(System.in);
       System.out.print("ENTER A STATEMENT: ");
       String s=sc.nextLine();
       int a=0;int b=0;int c=0; int d=0;    
       for(int i=0;i<s.length();i++)
       {
           char ch = s.charAt(i);
           if(Character.isLetter(ch))
           {
               a++;
           }
           else if(Character.isDigit(ch))
           {
               b++;
           }
           else if(Character.isSpace(ch))
           {
               c++;
           }
           else
           {
               d++;
           }
        }
        System.out.println("Number of letters: "+a);
        System.out.println("Number of digits: "+b);
        System.out.println("Number of Special Characters: "+d);
   }
}
