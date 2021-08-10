package String1.NewString1;
public class StringX
{
    public static void main()
    {
        String n[]={"Junaid","Akshay","Maaz","Jibran","Mohit","Furkan","Pratik","Akshay"};
        
        for(int i=0;i<n.length;i++)
        {
            for(int j=0;j<n.length-1-i;j++)
            {
                if(n[j].compareTo(n[j+1])>0)
                {
                    String c = n[j];
                    n[j]=n[j+1];
                    n[j+1]=c;
                }
            }
        }
        for(int i=0;i<n.length;i++)
        {
            System.out.print(n[i]+" ");
        }
    }
}
