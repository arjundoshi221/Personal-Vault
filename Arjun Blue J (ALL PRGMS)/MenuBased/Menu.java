package MenuBased;
import java.util.*;
public class Menu
{
    
    public static void doMenu()
    {
        Scanner sc=new Scanner(System.in);
        int opt;
        do
        {
            System.out.println("1. Add two nos");
            System.out.println("2. Product of two nos");
            System.out.println("3. Exit");
            System.out.println("Enter a option : ");
            opt=sc.nextInt();
            switch(opt)
            {
                case 1:
                System.out.println("Enter two nos to add : ");
                int a=sc.nextInt();
                int b =sc.nextInt();
                System.out.println("Sum  = "+(a+b));
                break;
                case 2:
                System.out.println("Enter two nos to find product : ");
                int m=sc.nextInt();
                int n =sc.nextInt();
                System.out.println("Product  = "+(m*n));
                break;
                case 3:
                System.out.println("Thank you");
                break;
                default:
                System.out.println("Invalid option");
            }
            if(opt!=3)
            {
                System.out.println("Press any key and enter to continue");
                char ch=(char)(sc.next().charAt(0));
                //int t=sc.nextInt();
                System.out.print("\f");
            }
        }while(opt!=3);
    }
}
