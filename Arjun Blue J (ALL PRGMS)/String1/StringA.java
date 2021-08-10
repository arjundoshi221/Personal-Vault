package String1;
import java.util.*;
public class StringA
{
  public static void main ()
    {   
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER A WORD");
        String s = sc.nextLine();
        s =s.trim();
        String w = "";
        for(int i=0;i<s.length(); i++)
        {
           char ch=s.charAt(i);
           w=ch+w;
        }
        System.out.println(w);
    }
}