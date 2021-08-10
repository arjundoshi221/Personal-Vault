package Arrays.NewArray;
class ArrayC
{
    public static void main()
    {
        int n[]={2,3,4,6,7,2,6,3,5,8,12,10};
        int sum=0;
        for(int i=0;i<n.length;i++)
        {
            sum=sum+n[i];
        }
        System.out.println("Sum= "+ sum);
    }
}
