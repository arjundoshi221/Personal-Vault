package String1;
public class StringV
{
    public static void main(String s)//Conecutive
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
                    int consecutive=0;
                    for(int j=0;j<w.length()-1;j++)
                    {
                        char c1=w.charAt(j);
                        char c2=w.charAt(j+1);
                        if(c1==c2)
                        {
                            consecutive++;
                        }
                    }
                    if(consecutive>0)
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
}
