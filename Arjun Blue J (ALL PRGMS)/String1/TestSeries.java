package String1;
public class TestSeries
{
    public static void main(String s)
    {
        s=s.trim();
        s=s+" ";
        String w = "";
        s=s.toLowerCase();
        for(int i=0;i<s.length(); i++)
        {
            char ch= s.charAt(i);
            if(ch!=' ')
            {
                w=w+ch;
            }
            else
            {
                if(w.length()>0)
                {
                    String ns = Character.toUpperCase(w.charAt(0))+w.substring(1,w.length()-1)+Character.toUpperCase(w.charAt(w.length()-1));
                    System.out.print(ns+" ");
                }
                w="";
            }         
        }
           
    }
}