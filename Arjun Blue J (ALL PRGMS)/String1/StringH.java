package String1;
public class StringH
{
   public static void main(String s)
   {
       int c= 0;
       s=s.trim();
       String w="";
       s=s+" ";
       for(int i =0;i<s.length();i++)
       {
           char ch = s.charAt(i);
           if(ch!= ' ')
           {
               w=ch+w;
           }
           else
           {
               if(w.length()>0)
               {
                 System.out.print(w + " ");
               
               }              
               w="";
           }
       }
       
       
   }
   public static void mainNOT(String s)
   {
       int c= 0;
       s=s.trim();
       String w="",rev="";
        s=s+" ";
       for(int i =0;i<s.length();i++)
       {
           char ch = s.charAt(i);
           if(ch!= ' ')
           {
               w=w+ch;
               rev=ch+rev;
           }
           else
           {
               if(w.length()>0)
               {
                 if(rev.equalsIgnoreCase(w))
                {
                 System.out.print(w + " ");
                 c++;
                 }              
               }
               w="";
               rev="";
            }
       }
       System.out.println("No. of palindromes = "+ c);
       
   }
}
