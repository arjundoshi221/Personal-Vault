package String1;


public class CharCombination
{
    public static void ABCD()
    {
       String s="ABCD"; 
       for(int i=0;i<4;i++)
       {
           for(int j=0;j<4;j++)
           {
               for(int k=0;k<4;k++)
               {
                   for(int l=0;l<4;l++)
                   {
                       if(i!=j && i!=k && i!=l && j!=k && j!=l && k!=l)
                       {
                           System.out.println(s.charAt(i)+" "+s.charAt(j)+" "+s.charAt(k)+" "+s.charAt(l));
                       }
                   }
               }
           }
       }
    }    
}
