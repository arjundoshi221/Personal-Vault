package Arrays;
import java.util.*;
public class ArrayM
{
   public static void main()
   {
       int code[]={101,102,103,104,105,106,107,108,109,110};
       double cost[]={25.5,45,300.5,75.25,90,99.99,65.5,70,99.99,100};
       
       Scanner sc= new Scanner(System.in);
       System.out.print("Enter Code: ");
       int c =sc.nextInt();
       
       int f=0;
        for(int i=0;i<code.length;i++)
        {
            if(code[i]==c)
            {
                System.out.println("Cost is Rs. "+cost[i]);
                f++;
            }
        }
        if(f==0)
            System.out.println("Code is not found ");
   }
}
