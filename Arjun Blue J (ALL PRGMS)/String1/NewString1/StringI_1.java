package String1.NewString1;

public class StringI_1
{
    public static void main(String s)
    {
        s=s.trim();
        s=s+" ";
        String w = "";
        
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
                    System.out.print(w.charAt(0)+".");
                }
                w="";
            }
        }
    }
}
