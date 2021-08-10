package Arrays.Frank;
public class Array33
{
    public static void main()
    {
        int n[]={5,3,8,4,9,2,1,12,98,16};
        
        for(int i=0;i<n.length;i++)
        {
            for(int j=0;j<n.length-1-i;j++)
            {
                if(n[j]>n[j+1])
                {
                    int c=n[j];
					n[j]=n[j+1];
					n[j+1]=c;
                }
            }
        }
		for(int i=0;i<n.length;i++)
        {
			System.out.println(n[i]);
        }
    }
}
