package String1.NewString1;
public class StringI_2
{
    public static void main(String s)
    {
        s=s.trim();
        String w = "";
        s=s.toUpperCase();
        int index=s.lastIndexOf(" ");
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
        System.out.print(" "+ s.substring(index));
    }
}