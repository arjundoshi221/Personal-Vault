package Modulus_Std;
public class CallByReference
{
    
   public static void doSort(int n[],String name[])
   {
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
   }
   public static void main()
    {
        int x[]={54,55,10,77,44};
        String name[]={"Arjun","Aryan","Anmol","dhruv","Rakesh"};
        
        doSort(x, name);
        for(int i=0;i<x.length;i++)
        {
            System.out.println(x[i]+" \t\t "+name[i]);
        }
   }
}
