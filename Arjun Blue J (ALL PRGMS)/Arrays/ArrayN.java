package Arrays;
import java.util.*;
public class ArrayN
{
    public static void  Main()
    {
        int Roll[]={1,2,3,4,5,6,7,8,9,10};
        int Marks[]={75,77,98,58,86,74,99,40,88,95};
        String Name[]={"Mustafa","Igor","Jerry","Juzer","Adil","Nishant","Raj","Abrez","Zoshua","Akshay"};
        Scanner sc =new Scanner (System.in);
        System.out.print("Enter you Roll number: ");
        int roll= sc.nextInt();
        for(int i=0;i<Roll.length;i++)
        {
            if(Roll[i]==roll)
            {
                System.out.print("Roll no."+Roll[i]+"      "+"Name:"+Name[i]+"      "+"Marks"+Marks[i]);
            }
        }
    }    
}
