package Conditions;
public class calls
{
    public static void rateOfCall(int calls)
    {
        int b = 0;
        if(calls>0 && calls<101)
        b = calls * 1;
        else if(calls>100 && calls<201)
        b = (100 * 1) + (calls - 100)* 2 ;
        else if(calls>200 && calls<301)
        b = (100 * 1)+(100 * 2) + (calls - 200)* 3 ;
        else if(calls>300 && calls<401)
        b = (100 * 1)+(100 * 2)+(100 * 3) + (calls - 300)* 4 ;
        else if(calls>400)
        b = (100 * 1)+(100 * 2)+(100 * 3) +(100 * 4) + (calls - 400)* 5 ;
        System.out.println( "The amount = " + b);
    }

     public static void rateOfCal(int call)
    {
        int b = 0;
        if(call<=100 )
        b = call * 1;
        else if(call<=200)
        b = (100 * 1) + (call - 100)* 2 ;
        else if(call<=300 )
        b = (100 * 1)+(100 * 2) + (call - 200)* 3 ;
        else if(call<=400 )
        b = (100 * 1)+(100 * 2) +(100 * 3) + (call - 300)* 4 ;
        else 
        b = (100 * 1)+(100 * 2) +(100 * 3) +(100 * 4) + (call - 400)* 5 ;
        System.out.println( "The amount = " + b);
    }
}
