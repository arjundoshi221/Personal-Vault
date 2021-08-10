package String1.NewString1;
public class StringW
{
    public static void main(String s)
    {
        s=s.toUpperCase();
        for(int i='A';i<'Z';i++)
        {
            for(int j=0;j<s.length();j++)
            {
                char ch = s.charAt(j);
                if(ch==i)
                {
                    System.out.print(ch);
                }
            }
        }
    }
}
