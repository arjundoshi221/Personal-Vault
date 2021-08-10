package String1;
import java.util.Scanner;
public class NoOfSpaces
{
    public static void numberOfSpaces()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("ENTER A STATEMENT BELOW: ");
        String s = sc.nextLine();
        s=s.trim();
        String space = "";
        int number = 0;
        for(int i=0;i<=s.length()-1;i++)
        {
            char ch = s.charAt(i);
            if(ch==' ')             
            {
               number++;
            }
        }
         System.out.println("The number of spaces in the statement = "+number);
        
    }
}
