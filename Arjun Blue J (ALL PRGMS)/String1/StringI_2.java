package String1;

public class StringI_2
{
      public static void main2(String name)
    {
       String w = "";
       name = name.trim();
       int sPos=name.lastIndexOf(' ');// Surname Position
       for(int i=0; i<=sPos;i++)
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
       System.out.print(name.substring(sPos));
       
    }
}
