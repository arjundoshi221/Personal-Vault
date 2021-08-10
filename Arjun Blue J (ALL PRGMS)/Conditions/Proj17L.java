package Conditions;
public class Proj17L
{
    public static void Report(int a, int b, int c,int d, int e, int f)    
    {
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
