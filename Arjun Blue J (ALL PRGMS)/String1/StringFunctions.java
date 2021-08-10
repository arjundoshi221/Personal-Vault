package String1;
public class StringFunctions
{
    public static void doTest()
    {
        String s1="hello how are you?", s2="Arjun Digish Doshi";
        System.out.println("Equal = "+s1.equals(s2));//1
        System.out.println("EqualIgnoreCase = "+s1.equalsIgnoreCase(s2));//2
        System.out.println("IndexOf = "+s1.indexOf('A'));//3
        System.out.println("IndexOf 2 = "+s1.indexOf('A',4));//4
        
        String s=s1.toLowerCase();//5
        System.out.println("Lower Case = "+s);
        
        s=s1.toUpperCase();//6
        System.out.println("Lower Case = "+s);
        s="26th January is celebrated as Republic Day";
        System.out.println("Original = "+s);
        
        
        s=s.replace("26", "15");//7
        s=s.replace("January", "August");
        s=s.replace("Republic", "Independence");
        System.out.println("Replaced = "+s);
        
        boolean ans=s.startsWith("th",2);//8
        System.out.println("Starting with = "+ans);
        
        ans=s.endsWith("y");//9
        System.out.println("Ending with = "+ans);
        
        System.out.println("Last IndexOf  = "+s1.lastIndexOf('A'));//10
        
        s1="ABCxyz";
        s2="ABCa";
        System.out.println("compareTo = "+s1.compareTo(s2));//11
        System.out.println("CompareIgnoreCase = "+s1.compareToIgnoreCase(s2));//12
        
        s="January is RD";//13
        System.out.println("Substring : "+s.substring(4,6));
    }
}
