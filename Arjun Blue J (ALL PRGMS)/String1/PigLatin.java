package String1;
public class PigLatin
{
    /**
     * KING ==> INGKAY
     * SCHOOL ==> OOLSCHAY
     * ARJUN ==> ARJUNAY
     * PRAKASH ==> AKASHPRAY
     */
    public static void toICSEPL(String s)
    {
        s=s.toUpperCase();
        int vPos=0;
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            if(ch=='a'||ch=='A'||ch=='e'||ch=='E'||ch=='i'||ch=='I' ||ch=='o'||ch=='O'||ch=='u'||ch=='U')             
            {
                vPos=i;
                break;
            }
        }
        
        System.out.print(s.substring(vPos));
        System.out.print(s.substring(0,vPos));
        System.out.print("AY");
    }
}
