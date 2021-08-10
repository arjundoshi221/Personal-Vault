package String1.NewString1;

public class StringT
{
    public static void main(String s)
    {
        System.out.println(s);
        for(int i=0;i<s.length();i++)
        {
            char ch = s.charAt(i);
            if(Character.isUpperCase(ch)==true)
            {
                System.out.print(Character.toLowerCase(ch)+" ");
            }
            else if(Character.isLowerCase(ch)==true)
            {
                System.out.print(Character.toUpperCase(ch)+ " ");
            }
        }
        
        
    }
}
