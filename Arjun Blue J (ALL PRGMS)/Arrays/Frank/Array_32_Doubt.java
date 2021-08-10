package Arrays.Frank;
import java.util.*;
class Array_32_Doubt
{
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        int m[]=new int[5];
        String n[]=new String[5];
        int h = 0,s=0;
        String s1="";
        for(int i=0;i<n.length;i++)
        {
            System.out.print("Enter value "+(i+1)+":");
            m[i]=sc.nextInt();
            System.out.print("Enter name: ");
            n[i]=sc.nextLine();
        }
         for(int i=0;i<n.length;i++)
        {
            if(m[i]>h)
            {
                h=m[i];
                s1=n[i];
            }
            s=s+m[i];
        }
        int avg = s/100;
        System.out.println("Student:"+s1 );
        System.out.println("Highest marks: "+h );
        System.out.println("Average marks: "+ avg);
    }
}
