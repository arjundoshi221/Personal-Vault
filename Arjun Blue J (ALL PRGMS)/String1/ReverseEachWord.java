package String1;
public class ReverseEachWord
{
    public static void main (String s)
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
                w=ch+w;
            }
            else
            {
                if(w.length()>0)
                {
                    System.out.print(w + " ");
                    c++;
                }
                w="";
            }         
        }
        System.out.print("No. of words = " + c);      
    }
    
}
