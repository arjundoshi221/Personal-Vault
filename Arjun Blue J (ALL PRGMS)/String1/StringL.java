package String1;
public class StringL
{
  public static void main()
  {
      String s = "The world is round and the moon is square and the sun is triangle and the stars are rectangles";
      s=s.trim();
      String Print = s.replace("is","was");
      System.out.print(Print);
  }
}
