package String1;
public class StringD
{
   public static void main(String s)
   { 
       int c=0;
       s= s.trim();
       String w="";
       s=s+" ";
       for(int i=0;i<s.length();i++)
       {
           char ch=s.charAt(i);
           if(ch!=' ')
           {
               w=w+ch;
               
           }
           else
           {
               if(w.length()>0)
               {
                   System.out.print(w + " ");
                   c++;
               }
               w="";
           }
       }
       System.out.println();
       System.out.println("The number of words are: " + c);
   }

}

