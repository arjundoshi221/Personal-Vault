package String1;
public class StringP
{
    public static void main(String s)
    {
        String lw="";
        String w = "";
        for(int i=0; i<s.length();i++)
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
                    if(w.length() > lw.length())
                    {
                        lw=w;
                    }
                }
                w="";
            }
        }
        System.out.println("Longest word = "+lw);
    }
}
