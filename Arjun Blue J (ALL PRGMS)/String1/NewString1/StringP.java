package String1.NewString1;
import java.util.*;

public class StringP
{
    public static void main()
    {
        Scanner sc  = new Scanner (System.in);
        System.out.print("Enter statement: ");
        String s = sc.nextLine();
        String w="";
        String l="";
        s=s.trim();
        s=s+" ";
        
        
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
                    if(w.length()>l.length())
                    {
                        l=w;
                    }
                }
                w="";
            }
        }
        System.out.println("Longest word = "+l);
    }
}
