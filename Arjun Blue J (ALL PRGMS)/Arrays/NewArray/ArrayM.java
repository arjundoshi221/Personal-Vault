package Arrays.NewArray;
import java.util.*;
public class ArrayM
{
    public static void main()
    {
        int m[]=new int[3];
        double t[]=new double[5];
        int pos=0;
        Scanner sc = new Scanner(System.in);
        int s=0;
        
        System.out.println("Enter marks: ");
        for(int k=0;k<=5;k++)
        {
            for(int i=0;i<m.length;i++)
            {
                m[i]=sc.nextInt();
                s=s+m[i];
            }
            double avg=0.0;
            avg = s/3.0;
            t[pos++]=avg;
            
        }
        for(int i=0;i<t.length;i++)
        {
            for(int j=i+1;j<t.length;j++)
            {
                if(t[i]<t[j])
                {
                    double c = t[i];
                    t[i]=t[j];
                    t[j]=c;
                }
            }
        }
            
        for(int i=0;i<t.length;i++)
        {
            System.out.print(m[i]);
        }
    }
}
