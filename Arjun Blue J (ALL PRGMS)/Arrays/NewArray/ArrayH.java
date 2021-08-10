package Arrays.NewArray;
public class ArrayH
{
    public static void main()
    {
        int n[]={5,2,8,9,5,11,77,9,3,0};
        int h=n[0],l=n[0];
        
        for(int i=0;i<n.length;i++)
        {
            if(n[i]>h)
            {
                h=n[i];
            }
            if(n[i]<l)
            {
                l=n[i];
            }
        }
        System.out.println("Highest number = "+ h);
        System.out.println("Lowest number = "+ l);
    }
}
