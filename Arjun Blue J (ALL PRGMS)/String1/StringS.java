package String1;
public class StringS
{
   public static void main(String s)
   {
       s=s.trim();
       s=s+" ";
       String w="";
       String s1 ;
       s1 = s.toUpperCase();
       for(int i=0;i<s1.length();i++)
       {
           char ch = s1.charAt(i);
           if(ch!=' ')
           {
               w=w+ch;
           }
           else
           {
               if(w.length()>0)
               {
                   String l1 =Character.toLowerCase(w.charAt(0))+ w.substring(1);
                   System.out.print(l1 + " ");
                  
               }
               w="";
            }
       }
   }
}