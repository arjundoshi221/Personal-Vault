package Arrays;


public class MultiArraySearch
{
    public static void main(int formNo)
    {
        int n[]={19,34,55,87,90};
        String name[]={"Arjun","Aryan","Anmol","dhruv","Rakesh"};
        double f=0;
        
        for(int i=0;i<n.length;i++)
        {
            if(n[i]==formNo)
            {
                f++;
                System.out.println("Congrats! "+name[i]+" you are selected for____");
            }
        }
        if(f==0)
        {
            System.out.println("Sorry!  your form no "+formNo+" is rejected for____");
        }
    }
    public static void mainSearchViaName(String nam)
    {
        int n[]={19,34,55,87,90};
        String name[]={"Arjun","Aryan","Anmol","dhruv","Rakesh"};
        double f=0;
        
        for(int i=0;i<n.length;i++)
        {
            if(name[i].compareToIgnoreCase(nam)==0)
            {
                f++;
                System.out.println(name[i]+" your %age is "+n[i]);
            }
        }
        if(f==0)
        {
            System.out.println("Sorry!  "+nam+" your details are not found");
        }
    }
}
