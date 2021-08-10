package Arrays;
public class ArrayJ
{
    public static void main()
    {
        int n[]={3,5,12,16,9,45,55,60,72,24};
        
        //1st 5
        for(int i=0;i<5;i++)//selected one
        {
            for(int j=i+1;j<5;j++)//to check the rest of the group
            {
                if(n[i]>n[j])
                {
                    int c =n[i];
                    n[i]=n[j];
                    n[j]=c;
                }
            }
        }
        //2nd half
        for(int i=5;i<n.length;i++)
        {
            for(int j=i+1;j<n.length;j++)
            {
                if(n[i]<n[j])
                {
                    int c=n[i];
                    n[i]=n[j];
                    n[j]=c;
                }
            }
        }
        //Print Statement
        for(int i=0;i<n.length;i++)
        {
            System.out.println(n[i]);
        }
    }
}
