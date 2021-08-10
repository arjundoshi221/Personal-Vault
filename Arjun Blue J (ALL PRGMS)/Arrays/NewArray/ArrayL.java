package Arrays.NewArray;
import java.util.*;

public class ArrayL
{
    public static void main()
    {
        
        String name[] = new String[7];
        int acc[]=new int[7];
        
        
        for(int i=0;i<acc.length;i++)
        {
            Scanner sc= new Scanner(System.in);
            System.out.print("Enter name:");
            name[i]=sc.nextLine();
            System.out.print("Enter Account no:");
            acc[i]=sc.nextInt();
            sc.close();
        }
        
        for(int i=0;i<acc.length;i++)
        {
            for(int j=i+1;j<acc.length;j++)
            {
                if(acc[i]>acc[j])
                {
                    int c=acc[i];
                    acc[i]=acc[j];
                    acc[j]=c;
                    
                    String a =name[i];
                    name[i]=name[j];
                    name[j]=a;
                }
            }
        }
        System.out.println("Name\t\tAccount Number");
        for(int i =0;i<acc.length;i++)
        {
            System.out.println(name[i]+"\t\t"+acc[i]);
        }
    }
}