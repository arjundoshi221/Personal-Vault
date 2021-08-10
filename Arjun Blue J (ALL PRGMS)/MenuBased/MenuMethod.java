package MenuBased;
import java.util.*;
/**
 * Using the switch statement. write a menu driven program to calculate the maturity amount of a Bank Deposit.

The user is given the following options:
(i) Term Deposit
(ii) Recurring Deposit

For option (i) accept principal(P), rare of ¡interest(r) and time period in years(n). Calculate and output the maturity amount(A) receivable using the formula
term deposit formula
For option (ii) accept Monthly Installment (P), rate of interest(r) and time period in months (n). Calculate and output the maturity amount(A) receivable using the formula
recurring deposit formula
For an incorrect option, an appropriate error message should be displayed.
 */
public class MenuMethod
{
  int opt;
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("1.Term Deposit");
        System.out.println("2.Recurring Deposit");
        System.out.println("3.Exit");
        int opt=sc.nextInt();
        
        switch(opt)
        {
            case 1:doTerm();
            break;
            case 2:doRecurring();
            break;
            case 3:System.out.print("Thank You");
            break;
            default:System.out.print("Invalid code");
            
    }
  }
  //Methods
  private static void doTerm()
  {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter Principal: ");
    double P = sc.nextInt();
    System.out.print("Enter Rate: ");
    double r = sc.nextInt();
    System.out.print("Enter Time: ");
    double n = sc.nextInt();
    double A=P*Math.pow((1+r/100),n);
    System.out.println("Term Deposit= "+A);
  }
  private static void doRecurring()
  {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter Principal: ");
    int P = sc.nextInt();
    System.out.print("Enter Rate: ");
    int r = sc.nextInt();
    System.out.print("Enter Time: ");
    int n = sc.nextInt();
    int A= (P*n) + P *(n*(n+1)/2) * r/100 * 1/12;
    System.out.println("Term Deposit= "+A);
  }
}
