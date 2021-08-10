package String1.NewString1;

public class StringZ_1
{
    public static void main(String s)
    {
        int sp=0;
        for(int i= 0;i<s.length();i++)
        {
            for(int k=1;k<=sp;k++)
            {
                System.out.print(" ");
            }
            System.out.print(s.charAt(i));
            System.out.println();
            sp++;
        }
    }
}
