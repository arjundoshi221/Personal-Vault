package String1;
public class StringO
{
    public static void main(String s)
    {
        int c = 0;
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
                    c++;
                    if(c%2==1)
                    {
                       System.out.print(w.toUpperCase()+ " "); 
                    }                    
                    else
                    {
                        System.out.print(w.toLowerCase()+ " ");
                    }
                    
                }
                w="";
            }
        }
    }
}
