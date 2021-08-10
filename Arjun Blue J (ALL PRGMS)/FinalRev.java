import java.util.*;
public class FinalRev
{
    public static void SentToWord()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter statement here: ");
        String s = sc.nextLine();
        
        s=s.trim();
        s=s+" ";
        String w ="";
        int c =0;
        
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
                    c++;
                    System.out.print(w+" ");
                }
                w="";
            }
        }
        System.out.println();
        System.out.println("No  of words =  "+ c);
        
    }
    public static void Successive()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter statement here: ");
        String s = sc.nextLine();
        
        s=s.trim();
        s=s+" ";
        String w ="";
        int c =0,cons =0 ;
        
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
                    for(int j=0;j<w.length()-1;j++)
                    {
                        char c1=w.charAt(j);
                        char c2=w.charAt(j+1);
                        if(c1==c2)
                        {
                            cons++;
                        }
                    }
                    if(cons>0)
                    {
                        System.out.println(w);
                        c++;
                    }
                }
                w="";
                cons=0;
            }
        }
       
    }
    public static void main()
    {
    }
}