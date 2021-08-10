package Arrays;


public class BinarySearch
{
    public static void main(int n)
    {
        int m[]={4,6,8,12,15,17,20,27,30,55,67,78,100};
        int l=0,u=m.length-1,mid,c=0;
        while(l<=u)
        {
            mid=(u+l)/2;
            if(m[mid]==n)
            {
                System.out.println("Element "+n+" found at pos "+ (mid+1));
                c++;
                break;
            }
            if(m[mid]<n)
            {
                l=mid+1;
            }
            if(m[mid]>n)
            {
                u=mid-1;
            }
        }
        if(l>u && c==0)
        {
            System.out.println("Element "+n+" not found");
        }
    }    
}
