package String1.NewString1;
import java.util.*;
public class StringS
{
    public static void main()
    {
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter your statement: ");
        String s = sc.nextLine();
        s=s.trim();
        s=s+" ";
        String w="";
        s=s.toUpperCase();
        
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
                    System.out.print(Character.toLowerCase(w.charAt(0))+ w.substring(1)+" ");
                }
                w="";
            }
        }
    }
}