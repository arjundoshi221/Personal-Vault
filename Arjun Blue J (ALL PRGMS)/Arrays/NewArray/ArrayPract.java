package Arrays.NewArray;
public class ArrayPract
{
    public static void ArrayO(int a)
    {
        int n[]={2,4,6,8,10,12,14,16,18,20};
        int l=0,u=n.length-1,mid;
        
        while(l<=u)
        {
            mid=(l+u)/2;
            if(n[mid]==a)
            {
                System.out.println("Number "+ a+ " is found at position"+(mid+1));
                break;
            }
            if(a>n[mid])
            {
                l=mid+1;
            }
            if(a<n[mid])
            {
                u=mid-1;
            }
        }
        if(l>u)
        {
            System.out.println("Number not found");
        }
    }
     public static void ArrayTNew(int idx)
    {
        int data[]={4,6,2,8,1,9,5,4,7,8,5};
        if(idx>=0&& idx<data.length)
        {
            
            /*System.out.println("Orignal Array");
            for(int i=0;i<data.length;i++)
            {
                System.out.print(data[i]+"  ");
            }
            System.out.println();*/
            
            int newData[]=new int[data.length-1];
            int pos=0;
            for(int i=0;i<idx;i++)
            {
                newData[pos]=data[i];
                pos++;
            }
            for(int i=idx+1;i<data.length;i++)
            {
                newData[pos]=data[i];
                pos++;
            }
            data=newData;
        }
        else
        {
            System.out.println("Invalid Index");
        }
        System.out.println("Final Array");
        for(int i=0;i<data.length;i++)
        {
            System.out.print(data[i]+"  ");
        }
    }
}
