package String1.NewString1;

public class StringG
{
    public static void main(String s)
    {
        String w="";
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
                    System.out.println(w+"\t- "+w.length());
                }
                w="";
            }
        }
   }
}
