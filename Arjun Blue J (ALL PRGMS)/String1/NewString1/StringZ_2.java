package String1.NewString1;
public class StringZ_2
{
    public static void main()
    {
        String s  = "MUMBAI";
        int sp =s.length()-1;
        
        for(int i=0;i<s.length();i++)
        {
            for(int k=0;k<=sp;k++)
            {
                System.out.print(" ");
            }
            System.out.print(s.charAt(i));
            System.out.println();
            sp--;
        }
    }
    
}
