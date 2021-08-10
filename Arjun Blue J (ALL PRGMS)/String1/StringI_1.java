package String1;
public class StringI_1
{
    public static void main1(String name)
    {
       String w = "";
       name = name.trim();
       name= name + ' ';
       for(int i=0; i<name.length();i++)
       {
           char ch= name.charAt(i);
           if( ch!=' ')
           {
               w=w+ch;
           }
           else
           {
               if(w.length()>0)
               {
                   System.out.print(w.charAt(0)+ ".");
                   
               }
               w="";
            }   
       }
    }
}
