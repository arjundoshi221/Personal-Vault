package Arrays;


public class BubbleSort
{
    public static void main(int m[])
    {
        for(int i=0;i<m.length;i++)
        {
            for(int j=0;j<m.length-1-i;j++)
            {
                if(m[j]>m[j+1])
                {
                    int c=m[j];
                    m[j]=m[j+1];
                    m[j+1]=c;
                }
            }
        }
        
        for(int i=0;i<m.length;i++)
        {
            System.out.println(m[i]);
        }
    }   
    public static void main()
    {
        int n[]={54,55,10,77,44};
        String name[]={"Arjun","Aryan","Anmol","dhruv","Rakesh"};
        
        for(int i=0;i<n.length;i++)
        {
            for(int j=0;j<n.length-1-i;j++)
            {
                if(n[j]>n[j+1])
                {
                    int c = n[j];
                    n[j]=n[j+1];
                    n[j+1]=c;
                    
                    String tn=name[j];
                    name[j]=name[j+1];
                    name[j+1]=tn;
                }
            }
        }
        for(int i=0;i<n.length;i++)
        {
            System.out.println(n[i]+" \t\t "+name[i]);
        }
   }
}
