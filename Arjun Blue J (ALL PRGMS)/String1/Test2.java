package String1;
public class Test2
{
       public static void main (String s)
    {
        s=s.trim();
        int c = 0;
        int a = 0;
        s=s+" ";
        String w = "";
        for(int i=0;i<s.length(); i++)
        {
            char ch= s.charAt(i);
            if(ch!=' ')
            {
                w=ch+w;
            }
            else
            {
                if(w.length()>0)
                {
                    System.out.print(w + " ");
                    System.out.println("The no of characters = " + w.length());
                    c++;
                }
                w="";
            }     
            if(ch=='a'||ch=='e'||ch=='i'|| ch=='o'|| ch=='u'||ch=='A'||ch=='E'||ch=='I'|| ch=='O'|| ch=='U')
            {
                a++;
            }
        }
        System.out.println("No. of words = " + c); 
        System.out.println("No. of vowels = " + a);
    }
}
