package Conditions;
public class Proj22E
{
    public static void Bill( int calls)
    { 
        int bill = 0;
        if(calls<=200)
            bill = calls  * 1;
        if (calls>200)
            bill = (200*1)+ (calls-200)*3  ;
        System.out.println( "Bill = " + bill);
    }
}
