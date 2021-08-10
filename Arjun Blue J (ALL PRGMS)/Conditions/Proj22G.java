package Conditions;
public class Proj22G
{
    public static void Report(int marks)
    {
        String a = "0";
        if(marks>0&& marks<=34)
            a = "fail";
        if(marks>=35&& marks<=49)
            a = "D";
        if(marks>=50&& marks<=64)
            a = "C";
        if(marks>=65&& marks<=80)
            a = "B";
        if(marks>=81&& marks<=100)
            a = "A";
        System.out.println (a);
    }
}
