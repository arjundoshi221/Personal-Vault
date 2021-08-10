package Conditions;
public class Student
{
    public void doCal(String n,double m1, double m2,double m3)
    {
        double t = m1+m2+m3;
        double avg = t/3;
        System.out.println(n+"'s Total = "+t);
        System.out.println(n+"'s Avg = "+avg);
        if (avg>=50)
        {
            System.out.println("Pass");
        }
        else
        {
            System.out.println("Fail");
        }
    }
        
}
