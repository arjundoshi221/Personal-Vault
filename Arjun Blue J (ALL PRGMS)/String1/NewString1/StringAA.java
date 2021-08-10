package String1.NewString1;
import java.util.*;
public class StringAA
{
   public static void main(String s)
    {
        s=s.toUpperCase();
        String v[]=new String[s.length()];
        int pos=0;
        s=s.trim();
        s=s+" ";
        String w="";
        s=s.toUpperCase();
        
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
                w ="";
            }
        }
        
        for(int i=0;i<pos;i++)
        {   
            for(int j=i+1;j<pos;j++)
            {
                if(v[i].compareTo(v[j])>0)// ascending order
                {
                    String c =v[i];
                    v[i]=v[j];
                    v[j]=c;
                }
            }
        }
        
        for(int i=0;i<pos;i++)
        {
            System.out.print(v[i]+" ");
        }
   }
   
   public static void main2()
   {
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter Statement: ");
        String s = sc.nextLine();
       
        String v[] = new String[s.length()];
        s=s.trim();
        s=s+" ";
        String w="";
        int pos=0;
        s=s.toUpperCase();
        
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
            System.out.print(v[i]+" ");
        }
   }
}
