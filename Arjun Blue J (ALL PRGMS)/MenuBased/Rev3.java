package MenuBased;
import java.util.*;
public class Rev3
{
    public static void main()
    {
        Scanner sc =new Scanner (System.in);
        int opt;
        
        do
        {
            System.out.println("1: Triangle");
            System.out.println("2: Starred Triangle");
            System.out.println("3: Exit");
            System.out.print("Enter option: ");
            opt=sc.nextInt();
            
            
                switch(opt)
                {
                    case 1:
                    System.out.println("Enter number of lines");
                    int n=sc.nextInt();
                    int sp=0;
                    int a=1;
                    for(int i=n;i>=1;i--)
                    {
                        for(int k=1;k<=sp;k++)
                        {
                            System.out.print(" ");
                        }
                        for(int j=1;j<=i;j++)
                        {
                            System.out.print(a+ " ");
                            a++;
                        }
                        System.out.println();
                        sp++;
                    }
                   
                    break;
                    case 2:
                    System.out.print("Enter number of lines: ");
                    int N=sc.nextInt();
                    int c=1;
                    for(int i=1;i<=N;i++)
                    {
                        for(int j=1;j<=i;j++)
                        {
                            System.out.print(c+" ");
                            c++;
                        }
                        System.out.println();
                    }
                    break;
                    case 3:
                    System.out.println("Thank you!");
                    break;
                    default:
                    System.out.println("Invalid input.");                
                }
        }while(opt!=3);
    }    
   
}
