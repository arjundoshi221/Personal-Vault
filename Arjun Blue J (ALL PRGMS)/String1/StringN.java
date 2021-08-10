package String1;
import java.util.*;
public class StringN
{
  public static void main ()
    {   
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER A WORD");
        String s = sc.nextLine();
        String w = "";
        for(int i=0;i<s.length(); i++)
        {
           char ch=s.charAt(i);
           w=ch+w;
        }
        if(w.equalsIgnoreCase(s))
        {
            System.out.println("The word is a palindrome");
            
        }
        else
        {
            System.out.println("The word is not a palindrome");
        }
    }
}
