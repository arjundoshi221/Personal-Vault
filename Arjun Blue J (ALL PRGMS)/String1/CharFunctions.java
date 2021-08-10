package String1;

public class CharFunctions
{
    public static void doCheck(char ch)
    {
        //char ch='A';
        boolean ans = Character.isSpace(ch);//1
        System.out.println("isSpace = "+ans);
        System.out.println("isDigit = "+Character.isDigit(ch));//2
        System.out.println("isLetter = "+Character.isLetter(ch));//3
        System.out.println("isLetterOrDigit = "+Character.isLetterOrDigit(ch));//4
        System.out.println("isUpperCase = "+Character.isUpperCase(ch));//5
        System.out.println("isLowerCase = "+Character.isLowerCase(ch));//6
        System.out.println("toUpperCase = "+Character.toUpperCase(ch));//5
        System.out.println("toLowerCase = "+Character.toLowerCase(ch));//6
        /**
         * 
        if(ch>='a' && ch<'z')
        {
            System.out.println( (char)(ch-32));
        }
        */
                  
        
    }
}
