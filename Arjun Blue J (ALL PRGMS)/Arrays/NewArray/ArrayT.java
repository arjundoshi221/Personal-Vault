package Arrays.NewArray;
public class ArrayT
{
    public static void main(int n)
    {
         int data[]={4,6,2,8,1,9,5,4,7,8,5};
         int newdata[]=new int[data.length-1];
         int pos=0;
         for(int i=0;i<n;i++)
         {
             newdata[pos]=data[i];
             pos++;
         }
         for(int i=n+1;i<data.length;i++)
         {
             newdata[pos]=data[i];
             pos++;
         }
         data=newdata;
         
         for(int i=0;i<data.length;i++)
         {
             System.out.println(data[i]);
         }
    }
}
