package String1.NewString1;
import java.util.*;
public class StringQ
{
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Sentence here: ");
        String s = sc.nextLine();
        
        s=s.trim().toLowerCase();
        
        System.out.print(Character.toUpperCase(s.charAt(0))+ s.substring(1));
        
    }
}
