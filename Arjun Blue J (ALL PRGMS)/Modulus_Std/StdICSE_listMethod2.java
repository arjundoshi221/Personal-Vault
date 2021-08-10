package Modulus_Std;



public class StdICSE_listMethod2
{
    
    public static void doPerfect(int n)
    {
        //System.out.println(n+" inside function doPerfect");
        int sof=0;
        for(int i=1;i<n;i++)
        {
            if(n%i==0)
            {
                sof=sof+i;
            }
        }
        if(sof==n)
        {
            System.out.println(n+" is a perfect no.");
        }
        /*else
        {
            System.out.println(n+" is not a perfect no.");
        }*/
    }
    public static void isPerfectNumListfrom1tolastnum(int n)
    {
        //NIP
        for(int i=1;i<=n;i++)
        {
            doPerfect(i);
            //System.out.println(i);
        }
    }
}
