package String1.NewString1;
public class StringN
{
    public static void main(String s)
    {
        s=s.trim();
        String w = "";
        String rev = "";
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            w=ch+w;
        }
        if(w.equalsIgnoreCase(s))
        {
            System.out.println(s+" is a palindrome");
        }
        else
        {
             System.out.println(s+" is NOT a palindrome");
        }
    }
}
