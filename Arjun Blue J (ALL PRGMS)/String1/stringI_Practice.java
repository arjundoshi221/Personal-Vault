package String1;
import java.util.*;
class stringI_Practice
{
    public static void mainI3()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a statement");
        String s = sc.nextLine();
        int i;
        String h = "";
        String w = "";
        for(i=0;i<s.length();i=i+1)
        {
            char ch = s.charAt(i);
            if(ch != ' ')
          {
            w=w+ch;
          }
        else
          {
            h=h+(w.charAt(0)+".");
            w="";
          }
    }
    h=w+h;
    System.out.println(h);
   }
   
    public static void I2_new(String name)
    {
       String w = "",sn="";
       name = name.trim();
       //int sPos=name.lastIndexOf(' ');// Surname Position
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
                   sn=sn+(w.charAt(0)+ ".");
                   
               }
               w="";
            }   
       }
       System.out.println(w+" "+sn);
       System.out.println(sn+" "+w);
       //System.out.println(name.substring(sPos));
       
    }
}

      