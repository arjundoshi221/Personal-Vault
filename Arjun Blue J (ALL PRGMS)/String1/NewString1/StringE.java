package String1.NewString1;

public class StringE
{
    public static void main(String s)
    {
        s=s.trim();
        s=s+" ";
        int c=0;
        
        for(int i=0;i<s.length();i++)
        {
            char ch = s.charAt(i);
            if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U')
            {
                c++;
            }
        }
        System.out.println("Frequency of vowels= "+c);
    }
}
