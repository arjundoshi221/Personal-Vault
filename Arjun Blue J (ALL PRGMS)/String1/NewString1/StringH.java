package String1.NewString1;

public class StringH
{
    public static void main(String s)
    {
        String w ="";
        s=s.trim();
        s=s+" ";
        
        for(int i=0;i<s.length();i++)
        {
            char ch = s.charAt(i);
            if(ch!=' ')
            {
                w=ch+w;
            }
            else
            {
                if(w.length()>0)
                {
                    System.out.print(w+" ");
                    
                }
                w="";
            }
        }
    }
}
