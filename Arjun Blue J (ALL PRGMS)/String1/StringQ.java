package String1;
public class StringQ
{
    public static void main(String s)
    {
      s=s.trim().toLowerCase();
      String ns=Character.toUpperCase(s.charAt(0))+s.substring(1);
      System.out.println(ns);
    }
}
