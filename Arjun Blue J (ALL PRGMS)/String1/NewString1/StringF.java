package String1.NewString1;
public class StringF
{
    public static void main(String s)
    {
        s=s.trim();
        s=s+" ";
        String w="";
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
                    System.out.println(w+" ");
                    c++;
                }
                w="";
            }
        }
    }
}

