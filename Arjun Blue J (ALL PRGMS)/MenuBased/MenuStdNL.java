package MenuBased;
import java.util.*;
public class MenuStdNL
{
    
    public static void doMenu()
    {
        Scanner sc=new Scanner(System.in);
        int opt;
        do
        {
            System.out.println("1. tri");
            System.out.println("2. tri2");
            System.out.println("3. Exit");
            System.out.println("Enter an option[1/2/3]: ");
            opt=sc.nextInt();
            switch(opt)
            {
                case 1:
                doOption1();
                break;
                case 2:
                doOption2();
                break;
                case 3:
                System.out.println("Thank you");
                break;
                default:
                System.out.println("Invalid option");
            }
        }while(opt!=3);
    }
    private static void doOption1()
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number of lines : ");
        int n=sc.nextInt();
        /*
         * 4444
         * 333
         * 22
         * 1
         */
        for(int i=n;i>=1;i--)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print(i);
            }
            System.out.println();
        }
    }
    private static void doOption2()
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number of lines : ");
        int n=sc.nextInt();
        /*
         * 1
         * 22
         * 333
         * 4444
         */
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print(i);
            }
            System.out.println();
        }
    }
}