package String1;
public class StringB
{
  public static void main(String s)
  {
     int c=0;
     for(int i=0;i<s.length();i++)
     {
         char ch=s.charAt(i);
         if(ch==' ')
         {
             c++;
         }
     }     
     System.out.println(c);
  }
}
