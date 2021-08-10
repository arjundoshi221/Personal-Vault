package String1.NewString1;
public class StringV
{
    public static void main(String s)
    {
        s=s.trim();
        s=s+" ";
        String w="";
        
        int cons=0,c=0;
        
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            if(ch!=' ')
            {
                w=w+ch;
            }
            else
            {
                if(w.length()>0)
                {
                    for(int j=0;j<w.length()-1;j++)
                    {
                        char c1 = w.charAt(j);
                        char c2 = w.charAt(j+1);
                        if(c1==c2)
                        {
                            cons++;
                        }
                    }
                    if(cons>0)
                    {
                        System.out.print(w+" ");
                        c++;
                    }
                }
                w="";
                cons=0;
            }
            
        }
    }
}