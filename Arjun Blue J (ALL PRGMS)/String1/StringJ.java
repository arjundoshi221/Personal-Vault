package String1;
public class StringJ
{
    public static void main(String s)
    {
        s=s.trim();
        int c = 0;
        s=s+" ";
        String w = "";
        for(int i=0;i<s.length(); i++)
        {
            char ch= s.charAt(i);
            if(ch!=' ')
            {
                w=w+ch;
            }
            else
            {
                if(w.length()>0 && w.equalsIgnoreCase("and"))
                {
                 c++;
                }
                w="";
            }         
        }
        System.out.print("No. of ands = " + c);      
    }
}
