package MenuBased;
import java.util.*;
/**
 * Menu Based programs from pitroda sirs notes.
 */
public class MenuRev_test2
{
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        int opt;
        do
        {
            System.out.println("Please enter an option from the following:");
            System.out.println("1. Triangle opt 1");
            System.out.println("2. Triangle opt 2");
            System.out.println("3. Exit menu");
            opt=sc.nextInt();
            switch(opt)
            {
                case 1:
                System.out.print("Enter number of lines: ");
                int n=sc.nextInt();
                for(int i=1;i<=n;i++)
                {
                    for(int j=1;j<=i;j++)
                    {
                        System.out.print("a");
                    }
                    System.out.println();
                }
                break;
                case 2:
                System.out.print("Enter number of lines: ");
                int a=sc.nextInt();
                int c=1;
                int sp=a-1;
                for(int i=1;i<=a;i++)
                {
                    for(int k=0;k<=sp;k++)
                    {
                        System.out.print(" ");
                    }
                    for(int j=1;j<=i;j++)
                    {
                        System.out.print(j%2);
                        c++;
                    }
                    System.out.println();
                    sp--;
                }
                break;
                case 3:
                System.out.println("Thank you!");
                break;
                default:
                System.out.println("wrong input");
            }
        }while(opt!=3);
    }
    /**
     * OPT 1=prime
     * OPT 2=automorphic
     */
    public static void main2()
    {
        Scanner sc = new Scanner(System.in);
        int opt;
        System.out.println("Select an option:");
        System.out.println("1. To check if Prime no.");
        System.out.println("2. To check if Automorphic no.");
        System.out.println("3. Exit Menu");
        System.out.println("Enter choice here: ");
        opt=sc.nextInt();
        do
        {
            switch(opt)
            {
                case 1:
                 System.out.print("Enter number: ");
                 int n=sc.nextInt();
                 int nof=0;
                
                    for(int i=1;i<=n;i++)
                    {
                        if(n%i==0)
                        {
                            nof++;
                        }
                    }
                    if(nof==2)
                    {
                        System.out.println(n+" is a prime no.");
                    }
                    else
                    {
                        System.out.println(n+" is a composite no.");
                    }
                break;
                /**
                 * Armstrong No.
                 * 153 = 3^3 + 5^3 +1^3 = 153 ==>27+125+1
                 */
                case 2:
                System.out.print("Enter number");
                int a = sc.nextInt();
                int m=a,s=0;
                do
                {
                    int d=a%10;
                    s=s+d*d*d;
                    a=a/10;
                }while(a!=0);
                if(s==m)
                {
                    System.out.println(m+" is an Armstrong no.");
                }
                else
                {
                    System.out.println(m+" is not an Armstrong no.");
                }
                break;
                case 3:
                System.out.println("Thank you!");
                break;
                default:
                System.out.println("Wrong input");
            }
        }while(opt!=3);
    }
}
