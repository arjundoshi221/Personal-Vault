package String1.NewString1;
public class StringI_3
{
    public static void main(String s)
    {
        s=s.trim();
        String w = "";
        int index = s.lastIndexOf(" ");
        System.out.print(s.substring(index)+" ");
        for(int i=0;i<=index;i++)
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
                    System.out.print(w.charAt(0)+".");
                }
                w="";
            }
        }
        
    }
}