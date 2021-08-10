package Arrays.NewArray;
public class ArrayR
{
    public static void main ()
    {
        int Rno[]={1,2,3,4,5,6,7,8,9,10};
        int m[]={75,77,98,58,86,74,99,40,88,95};
        String name[]={"Mustafa","Igor","Jerry","Juzer","Adil","Nishant","Raj","Abrez","Zoshua","Akshay"};
        int a=0,b=0;
        String c = "";
        for(int i=0;i<m.length;i++)
        {
            for(int j=0;j<m.length-1-i;j++)
            {
                if(m[j]<m[j+1])
                {
                    a=Rno[j];
                    Rno[j]=Rno[j+1];
                    Rno[j+1]=a;
                    
                    b=m[j];
                    m[j]=m[j+1];
                    m[j+1]=b;
                    
                    c=name[j];
                    name[j]=name[j+1];
                    name[j+1]=c;
                }
            }
        }
        System.out.println("R:no\t\tMarks\t\tName");
        for(int i=0;i<m.length;i++)
        {
            System.out.println(Rno[i]+"\t\t"+m[i]+"\t\t"+name[i]);
        }
    }
}
