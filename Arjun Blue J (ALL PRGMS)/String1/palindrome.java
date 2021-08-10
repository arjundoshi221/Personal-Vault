package String1;
class palindrome
{
   public static void main(String s)
   {
   char ch;
   int i;
   String w="";
   for( i=0;i<s.length();i++)
   {
   ch= s.charAt(i);
    w=ch+w;
}
    if(w.equalsIgnoreCase(s))
    {
        System.out.println("PALINDROME");
        
    }
    else
    {
        System.out.println("NO");
        
    }
   
}
}