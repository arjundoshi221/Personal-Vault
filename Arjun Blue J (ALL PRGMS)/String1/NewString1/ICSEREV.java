package String1.NewString1;
import java.util.*;
public class ICSEREV
{
    public static void main()
    {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter statement: ");
        String s = sc.nextLine();
        String w ="";
        s=s.trim().toUpperCase();
        s=s+" ";
        String v[]= new String[s.length()];
        int pos =0;
        
        for(int i=0;i<s.length();i++)
        {
            char ch = s.charAt(i);
            if(ch!=' ')
            {
                w=w+ch;
            }
            else
            {
                if(w.length()>0)
                {
                    v[pos]=w;
                    pos++;
                }
                w="";
            }
        }
        
        
        for(int i=0;i<pos;i++)
        {
            for(int j=i+1;j<pos;j++)
            {
                if(v[i].compareToIgnoreCase(v[j])>0)
                {
                    String c = v[i];
                    v[i]=v[j];
                    v[j]=c;
                }
            }
        }
        
        for(int i=0;i<pos;i++)
        {
            System.out.print(v[i]+" " );
        }
    }
}
