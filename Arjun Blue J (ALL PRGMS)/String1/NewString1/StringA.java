package String1.NewString1;
import java.util.*;
public class StringA
{
    public static void main(String s)
    {
        String w ="";
        for(int i=0;i<s.length();i++)
        {
            char ch = s.charAt(i);
            w=ch+w;
        }
        System.out.println(w);
    }
}
