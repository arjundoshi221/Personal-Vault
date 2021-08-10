package String1;
import java.util.*;
public class Term3String
{
   public static void main (String s)
   {
     s=s.trim();
     s=s.toLowerCase();
     String w="";
     s=s+" ";
     for(int i=0;i<s.length();i++)
     {
       char ch = s.charAt(i);
       if(ch!=' ')
       {
           w=w+ch;
       }
       else
       {
           if(w.length()>0)
           {
              System.out.print(Character.toUpperCase(w.charAt(0))+ w.substring(1)+" ");
           }
           w="";
       }
   }
 }
 /**
  * Longest
  */
 public static void main2 (String s)
   {
     s=s.trim();
     s=s.toLowerCase();
     String w="",lw="";
     s=s+" ";
     for(int i=0;i<s.length();i++)
     {
       char ch = s.charAt(i);
       if(ch!=' ')
       {
           w=w+ch;
       }
       else
       {
           if(w.length()>0)
           {
               if(w.length()>lw.length())
               {
                   lw=w;
               }
           }
           w="";
       }
     }
     System.out.println("Longest word = "+lw);
     for(int i=0;i<s.length();i++)
     {
       char ch = s.charAt(i);
       if(ch!=' ')
       {
           w=w+ch;
       }
       else
       {
           if(w.length()==lw.length())
           {
               System.out.println("Longest words : "+w);
           }
           w="";
       }
     }
 }
    /**
  * Shortest
  */
 public static void main3(String s)
   {
     s=s.trim();
     s=s.toLowerCase();
     String w="",sw=s;
     s=s+" ";
     for(int i=0;i<s.length();i++)
     {
       char ch = s.charAt(i);
       if(ch!=' ')
       {
           w=w+ch;
       }
       else
       {
           if(w.length()>0)
           {
               if(w.length()<sw.length())
               {
                   sw=w;
               }
           }
           w="";
       }
     }
     System.out.println("Shortest word = "+sw);
 }
 public static int doCountVowel(String s)
 {
     s=s.toLowerCase();
     int c=0;
     for(int i=0;i<s.length();i++)
     {
         char ch=s.charAt(i);
         if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
         {
             c++;
         }
     }
     return c;
 }
 public static void main4(String s)
   {
     s=s.trim();
     s=s.toLowerCase();
     String w="",sw=s;
     s=s+" ";
     for(int i=0;i<s.length();i++)
     {
       char ch = s.charAt(i);
       if(ch!=' ')
       {
           w=w+ch;
       }
       else
       {
           if(w.length()>0)
           {
               int ans=doCountVowel(w);
               if(ans>=2)
               {
                   System.out.println(w);
               }
           }
           w="";
       }
     }
 }
 
 
 public static void main44(String s)
   {
     s=s.trim();
     s=s.toLowerCase();
     String w="",sw=s;
     s=s+" ";
     for(int i=0;i<s.length();i++)
     {
       char ch = s.charAt(i);
       if(ch!=' ')
       {
           w=w+ch;
       }
       else
       {
           if(w.length()>0)
           {
               w=w.toLowerCase();
                 int a=0;
                 for(int j=0;j<w.length();j++)
                 {
                     char c=w.charAt(j);
                     if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u')
                     {
                         a++;
                     }
                 }
               if(a>=2)
               {
                   System.out.println(w);
               }
           }
           w="";
       }
     }
     
 }
 public static void Rev3_1()
 {
     Scanner sc = new Scanner (System.in);
     System.out.print("Enter name: ");
     String name = sc.nextLine();
     int sPos=name.lastIndexOf(' ');
     name = name.trim();
     String w="";
     System.out.print(name.substring(sPos+1)+" ");
     for(int i=0;i<=sPos;i++)
     {
         char ch=name.charAt(i);
         if(ch!=' ')
         {
             w=w+ch;
         }
         else
         {
             if(w.length()>0)
             {
                 System.out.print(Character.toUpperCase(w.charAt(0))+".");
             }
             w="";
         }
     }
 }
 public static void Rev3_2()
 {
     Scanner sc = new Scanner(System.in);
     System.out.println("Enter statement: ");
     String s = sc.nextLine();
     String w="";
     s=s.trim();
     s=s+" ";
     int c = 0;    
     for(int i=0;i<s.length();i++)
     {
         char ch = s.charAt(i);
         if(ch!=' ')
         {
             w=w+ch;
         }
         else
         {
             if(w.length()>0)
             {
                 c++;
                 if(c%2==0)
                 {
                     w=w.toUpperCase();
                     System.out.print(w + " ");
                 }
                 else
                 {
                     w=w.toLowerCase();
                     System.out.print(w+" ");
                 }
             }
             w="";
         }
     }
 }
 public static void Rev_3()
 {
         Scanner sc = new Scanner(System.in);
         System.out.println("Enter statement: ");
         String s = sc.nextLine();
         s=s.trim();
         
         for(int i=0;i<s.length();i++)
         {
             char ch=s.charAt(i);
             if(Character.isUpperCase(ch)==true)
             {
                 
                 System.out.print(Character.toLowerCase(ch));
             }
             else if(Character.isLowerCase(ch)==true)
             {
                 
                 System.out.print(Character.toUpperCase(ch));
             }
              else 
             {
                 
                 System.out.print(ch);
             }
         }
        
 }
}