package Conditions;
import java.util.*;
public class Proj17L_DIO
{
    
    public static void Report()    
    {
        Scanner sc=new Scanner (System.in);
        System.out.print("Enter marks for subject 1 : ");
        int a=sc.nextInt();
        System.out.print("Enter marks for subject 2 : ");
        int b=sc.nextInt();
        System.out.print("Enter marks for subject 3 : ");
        int c=sc.nextInt();
        System.out.print("Enter marks for subject 4 : ");
        int d=sc.nextInt();
        System.out.print("Enter marks for subject 5 : ");
        int e=sc.nextInt();
        System.out.print("Enter marks for subject 6 : ");
        int f=sc.nextInt();
        System.out.print("\f");
        System.out.println ("Subject 1 = " + a);
        System.out.println ("Subject 2 = " + b);
        System.out.println ("Subject 3 = " + c);
        System.out.println ("Subject 4 = " + d);
        System.out.println ("Subject 5 = " + e);
        System.out.println ("Subject 6 = " + f);        
        int TotalMarks = a+b+c+d+e+f;
        int AvgMarks = (a+b+c+d+e+f)/6;
        System.out.println ("Total Marks are  " + TotalMarks);
        System.out.println ("Average marks are " + AvgMarks);        
    }
}