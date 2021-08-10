package String1;
public class stringI_3
{
    public static void main3(String name)
    {
       String w = "";
       name = name.trim();
       int sPos=name.lastIndexOf(' ');// Surname Position
       System.out.print(name.substring(sPos+1)+" ");
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
    }
}
