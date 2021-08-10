package String1.NewString1;
public class StringK
{
    public static void main(String s,String input)
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
                if(w.length()>0 && w.equalsIgnoreCase(input))
                {
                 c++;
                }
                w="";
            }         
        }
        System.out.print("No. of words = " + c);      
    }
}
