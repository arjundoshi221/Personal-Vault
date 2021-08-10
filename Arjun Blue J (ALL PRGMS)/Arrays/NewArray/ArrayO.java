package Arrays.NewArray;
public class ArrayO
{
    public static void main(int a)
    {
       int n[]={2,4,6,8,10,12,14,16,18,20};
       int l=0,u=n.length-1;
       while(l<=u)
       {
           int mid=(l+u)/2;
           if(n[mid]==a)
           {
               System.out.println("Number "+a+" found at position "+(mid+1));
               break;
           }
           if(n[mid]<a)
           {
               l=mid+1;
           }
           if(n[mid]>a)
           {
               u=mid-1;
           }
       }
       if(l>u)
       {
           System.out.println("Number "+a+" not found"); 
       }
    }
}
