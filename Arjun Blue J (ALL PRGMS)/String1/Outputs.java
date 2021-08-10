package String1;
public class Outputs
{
    public static void doCheck()
    {
        String s1="abc",s2="ABCD";
        System.out.println(s1.length()+s2.length()); //B(66)-A(65)== a 
        
        System.out.println("output : "+s1.length()+s2.length());
        System.out.println(s1.length()+s2.length()+" output : ");
        
        String message = "AAAAc BBBc 123456789",wish="@@@@ %%%";
        System.out.println(message.substring(0,1));
        
        //System.out.println(message.charAt(0)+message.charAt(0).toLowerCase());
        System.out.println(Character.toLowerCase(message.charAt(0)+1));
        System.out.println(Character.toLowerCase(message.charAt(6)-message.charAt(0)));
        System.out.println(Character.toUpperCase(message.charAt(message.indexOf('c'))));
        System.out.println(Character.isUpperCase(message.charAt(message.indexOf('c'))));
        System.out.println(Character.isLetter(message.charAt(message.indexOf('c'))));
        System.out.println(message.lastIndexOf(message.charAt(message.indexOf('c'))));;
        //System.out.println(message.lastIndexOf(message.charAt(message.indexOf('Z'))));
        System.out.println(message.lastIndexOf(message.indexOf('A')));
        System.out.println(message.substring(message.lastIndexOf('A')));
    }
}
