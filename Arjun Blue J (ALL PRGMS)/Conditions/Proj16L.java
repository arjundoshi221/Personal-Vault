package Conditions;
public class Proj16L
{
    public static void Report (String name, int roll,int a,int b, int c, int d, int e, int f)
    { 
      int TotalMarks = a+b+c+d+e+f;
      int AvgMarks = (a+b+c+d+e+f)/6;
      System.out.print( name + " your total marks are " + TotalMarks);
      System.out.println(" and your average marks are " + AvgMarks + ".");        
    }    
}
