package String1.NewString1;
public class StringY_3
{
    public static void main()
    {
        String s ="HAPPY";
        int sp=s.length()-1;
        for(int i=0;i<s.length();i++)
        {
            for(int k=0;k<=sp;k++)
            {
                System.out.print(" ");
            }
            for(int j=0;j<=i;j++)
            {
                System.out.print(s.charAt(j)+" ");
            }
            System.out.println();
            sp--;
        }
    }
}
