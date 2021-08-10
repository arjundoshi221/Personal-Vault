
package MenuBased;
import java.util.*;

public class prac
{
    public static void main ()
    {
        Scanner sc=new Scanner (System.in);
        int opt;
        do
        {
            System.out.println("1: C to F");
            System.out.println("2: F to C");
            System.out.println("3: Exit");
            System.out.println("Enter option here: ");
            opt=sc.nextInt();
            
            switch(opt)
            {
                case 1:
                System.out.println("Enter temp in C");
                double c=sc.nextInt();
                double f=(1.8*c)+32;
                System.out.println("Temp in F = "+f);
                break;
                case 2:
                System.out.println("Enter temp in F");
                double f2=sc.nextInt();
                double c2=5/9*(f2-32);
                System.out.println("Temp in C = "+c2);
                break;
                case 3:
                System.out.println("Thank You");
                break;
                default:
                System.out.println("Invalid input");
            }
        }while(opt!=3);
    }
    
    public static void main2()
    {
        Scanner sc = new Scanner(System.in);
        int opt;
        do
        {
            System.out.println("1. hello");
            System.out.println("2. hi");
            System.out.println("3. exit");
            System.out.println("Enter option: ");
            opt=sc.nextInt();
            
            switch(opt)
            {
                case 1:
                System.out.println("Hello");
                break;
                case 2:
                System.out.println("hi");
                break;
                case 3:
                System.out.println("bye thank you");
                break;
                default:
                System.out.println("invalid input");
            }
        }while(opt!=3);
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
 }    

