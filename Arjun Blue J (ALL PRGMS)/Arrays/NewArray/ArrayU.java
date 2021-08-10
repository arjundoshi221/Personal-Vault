package Arrays.NewArray;
public class ArrayU
{
    public static void main()
    {
        int a[]={1,5,7,9,2,7,4,8,3};
        int b[]={2,6,3,8,0};
        int c[] = new int [a.length+b.length];
        int pos=0;
        for(int i=0;i<a.length;i++)
        {
            c[pos]=a[i];
            pos++;
        }
        for(int i=0;i<b.length;i++)
        {
            c[pos]=b[i];
            pos++;
        }
        for(int i=0;i<pos;i++)
        {
            System.out.println(c[i]);
        }
    }
}
