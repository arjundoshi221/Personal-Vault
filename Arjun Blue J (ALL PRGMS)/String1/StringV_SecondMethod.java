package String1;
public class StringV_SecondMethod
{
    public static void doSent2Word(String s)
    {
        s=s.trim();
        int c=0;
        s=s+' ';
        String w="";
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
                    int cons=isConsecutive(w);
                    if(cons>0)
                    {
                        System.out.println(w);
                        c++;
                    }
                    
                }
                w="";
            }
        }
        System.out.println("No. of words = "+c);
    }
    private static int isConsecutive(String w)
    {
        int cons=0;
        for(int j=0;j<w.length()-1;j++)
        {
            char c1=w.charAt(j);
            char c2=w.charAt(j+1);
            if(c1==c2)
            {
                cons++;
            }
        }
        return cons;
    }
}
