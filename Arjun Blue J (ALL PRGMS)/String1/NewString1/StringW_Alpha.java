package String1.NewString1;
public class StringW_Alpha
{
    public static void doAplha(String s)
    {
        s=s.toUpperCase();
        for(int i=65;i<='Z';i++)
        {
            for(int j=0;j<s.length();j++)
            {
                char ch=s.charAt(j);
                if(ch==i)
                {
                    System.out.print(ch);
                }
            }
        }
    }
    public static void doAplha2_bubble(String s)
    {
        char n[]=s.toCharArray();
       
        for(int i=0;i<n.length;i++)
        {
            for(int j=0;j<n.length-1-i;j++)
            {
                if(n[j]>n[j+1])
                {
                    char t=n[j];
                    n[j]=n[j+1];
                    n[j+1]=t;
                }
            }
        }
        String ns=String.copyValueOf(n);
        System.out.print(ns);
    }
    public static void doAplha3_linear(String s)
    {
        char n[]=s.toCharArray();
       
        for(int i=0;i<n.length;i++)
        {
            for(int j=i+1;j<n.length;j++)
            {
                if(n[i]>n[j])
                {
                    char t=n[j];
                    n[j]=n[i];
                    n[i]=t;
                }
            }
        }
        String ns=String.copyValueOf(n);
        System.out.print(ns);
    }
}
