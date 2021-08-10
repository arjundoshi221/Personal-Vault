package String1.NewString1;
import java.util.*;
public class StringO
{
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter statement: ");
        String s = sc.nextLine();
        
        String w ="";
        s=s.trim();
        s=s+" ";
        int c =0;
        
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
                    if(c%2==0)
                    {
                        System.out.print(w.toUpperCase()+" ");
                    }
                    else
                    {
                        System.out.print(w.toLowerCase()+" ");
                    }
                    c++;
                }
                w="";
            }
        }
    }
}
