package String1;
import java.util.*;
public class StringClass9
{
    public static void StringA()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a statement: ");
        String s = sc.nextLine();
        s=s.trim();
        String w ="";
        
        for(int i=0;i<s.length();i++)
        {
            char ch = s.charAt(i);
            w=ch+w;
        }
        System.out.println(w);
    }
    public static void StringB()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a statement: ");
        String s = sc.nextLine();
        s=s.trim();
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
    public static void StringC()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a statement: ");
        String s = sc.nextLine();
        s=s.trim();
        int c=0;
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            if(ch=='a')
            {
                c++;
            }
        }
        System.out.println(c);
    }
    public static void StringD()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a statement: ");
        String s = sc.nextLine();
        s=s.trim();
        s=s+" ";
        String w="";
        int c=0;
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
                    System.out.print(w+ " ");
                    c++;
                }
                w="";
            }
            
        }
        System.out.println("The number of words are: " + c);
    }
    public static void StringE()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a statement: ");
        String s = sc.nextLine();
        s=s.trim();
        int c=0;
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U')
            {
                c++;
            }
        }
        System.out.println(c);
        
    }
    public static void StringF()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a statement: ");
        String s = sc.nextLine();
        s=s.trim();
        s=s+" ";
        String w="";
        
        for(int i =0;i<s.length();i++)
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
                    System.out.println(w);
                }
                w="";
            }
          
        }
    }
    public static void StringG()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a statement: ");
        String s = sc.nextLine();
        s=s.trim();
        s=s+" ";
        String w="";
        
        for(int i =0;i<s.length();i++)
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
                    System.out.println(w);
                    System.out.print("Length="+w.length());
                }
                w="";
            }
        }
    }
    public static void StringH()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a statement: ");
        String s = sc.nextLine();
        s=s.trim();
        s=s+" ";
        String w="";
        
        for(int i =0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            if(ch!=' ')
            {
                w=ch+w;
            }
            else 
            {
                if(w.length()>0)
                {
                    System.out.println(w);
                }
                w="";
            }
          
        }
    }
    public static void StringI_1()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String s = sc.nextLine();
        s=s.trim();
        s=s+" ";
        String w="";
        
        for(int i =0;i<s.length();i++)
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
                    System.out.println(w.charAt(0)+".");
                }
                w="";
            }
          
        }
    }
      public static void StringI_2()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String s = sc.nextLine();
        s=s.trim();
        String w="";
        int sPos= s.lastIndexOf(' ');
        for(int i =0;i<=sPos;i++)
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
                    System.out.print(w.charAt(0)+".");
                }
                w="";
            }
          
        }
        System.out.print(s.substring(sPos));
    }
    public static void StringI_3()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String s = sc.nextLine();
        String w="";
        s=s.trim();
        int sPos = s.lastIndexOf(' ');
        System.out.print(s.substring(sPos+1));
        
        for(int i =0;i<=sPos;i++)
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
                    System.out.print(w.charAt(0)+".");
                }
                w="";
            }
        }
    }
    public static void StringJ()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a statement: ");
        String s = sc.nextLine();
        s=s.trim();
        s=s+" ";
        String w="";
        int c=0;
        for(int i =0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            if(ch!=' ')
            {
                w=w+ch;
            }
            else 
            {
                if(w.equalsIgnoreCase("and"))
                {
                    c++;
                }
                w="";
            }
            
        }
        System.out.println(c);
    }
      public static void StringL()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a statement: ");
        String s = sc.nextLine();
        s=s.trim();
        String w ="";
        for(int i=0;i<s.length();i++)
        {
             w = s.replace("is","was");
        }
        System.out.println(w);
    }
     public static void StringM()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a statement: ");
        String s = sc.nextLine();
        System.out.print("Enter a word to search: ");
        String a = sc.nextLine();
        System.out.print("Enter a word to replace: ");
        String b = sc.nextLine();   
        s=s.trim();
        String w ="";
        for(int i=0;i<s.length();i++)
        {
             w = s.replace(a,b);
        }
        System.out.println(w);
    }
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a word: ");
        String s = sc.nextLine();
        s=s+" ";
        String w = "";
        String pal="";
        int c = 0;
        for(int i=0;i<s.length();i++)
        {
            char ch = s.charAt(i);
            if(ch!=' ')
            {
                w=w+ch;
                pal=ch+pal;
            }
            else
            {
                if(pal.equalsIgnoreCase(w))
                {
                    System.out.println("Yes");
                }
                else
                {
                    System.out.println("NO");
                }
                w="";
                pal="";
            }
           
        }
        
    }
    
}
