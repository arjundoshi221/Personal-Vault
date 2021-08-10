package Arrays;

public class MultiArraySort
{
    public static void main()
    {
        int n[]={54,55,10,77,44};
        String name[]={"Arjun","Aryan","Anmol","dhruv","Rakesh"};
        
        for(int i=0;i<n.length;i++)
        {
            for(int j=i+1;j<n.length;j++)
            {
                if(n[i]>n[j])
                {
                    int c = n[i];
                    n[i]=n[j];
                    n[j]=c;
                    
                    String tn=name[i];
                    name[i]=name[j];
                    name[j]=tn;
                }
            }
        }
        for(int i=0;i<n.length;i++)
        {
            System.out.println(n[i]+" \t\t "+name[i]);
        }
   }
    public static void mainStrings()
    {
        int n[]={54,55,10,77,44};
        String name[]={"Arjun","Aryan","Anmol","dhruv","Rakesh"};
        
        for(int i=0;i<n.length;i++)
        {
            for(int j=i+1;j<n.length;j++)
            {
                if(name[i].compareTo(name[j])>0)
                {
                    int c = n[i];
                    n[i]=n[j];
                    n[j]=c;
                    
                    String tn=name[i];
                    name[i]=name[j];
                    name[j]=tn;
                }
            }
        }
        for(int i=0;i<n.length;i++)
        {
            System.out.println(n[i]+" \t\t "+name[i]);
        }
   }
}
