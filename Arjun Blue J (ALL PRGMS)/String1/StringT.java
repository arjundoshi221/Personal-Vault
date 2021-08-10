package String1;

public class StringT
{
  public static void main(String s)
  
  {
      
      for(int i=0;i<s.length();i++)
      {
          char ch = s.charAt(i);
          if(Character.isUpperCase(ch)==true)
          {
               ch = Character.toLowerCase(ch);
               System.out.print(ch);
          }
          else if(Character.isLowerCase(ch)==true)
          {
               ch = Character.toUpperCase(ch);
               System.out.print(ch);
          }
          else 
          {
              System.out.print(ch);
          }
        }
     }
  
  }

