package String1.NewString1;
public class StringC
{
    public static void main(String s)
    {
        int c= 0;
        for(int i=0;i<s.length();i++)
        {
            char ch = s.charAt(i);
            if(ch=='a')
            {
                c++;
            }
        }
        System.out.println("Frequency of 'a' = "+c);
    }
}
