package ICSE;
import java.util.*;
public class ICSE2007
{
    String name;String add;int phone;String sub;int sal;double incTax;int yrSal;
	private void Input()
    {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter name: ");
		name=sc.nextLine();
		System.out.println("Enter Adress: ");
		add=sc.nextLine();
		System.out.println("Enter Phone number: ");
		phone=sc.nextInt();
		System.out.println("Enter Monthly Salary: ");
		sal=sc.nextInt();
		System.out.println("Enter Subject Specialization: ");
		sub=sc.nextLine();//error
    }    
	private void Calculation()
	{
		yrSal=sal*12;
		if(yrSal>175000)
		{
			incTax=0.05*yrSal;
		}
	}
	private void Display()
	{
		System.out.println();
		System.out.println();
		System.out.println("Name: "+name);
		System.out.println("Adress: "+add);
		System.out.println("Phone no.: "+phone);
		System.out.println("Subject Specialization: "+sub);
		System.out.println("Monthly Salary: "+sal);
		System.out.println("Yearly salary: "+ yrSal);
		System.out.println("Income Tax: "+incTax);
		
	}
	public void Q4()
    {
        ICSE2007/** SALARY **/ Sal= new ICSE2007/** SALARY **/();
        Sal.Input();
        Sal.Calculation();
        Sal.Display();
    }


    
	public static void Q5(int n)//DOUBT
	{
		double sum=1;
		for(int i=1;i<=n;i++)
		{
			sum=(sum+i)-1/sum*i;
		}
		System.out.println(sum);
	}

	public static void Q6()
	{
		int n[]={2,5,4,1,3};
		int l=n[0],h=n[0];
		int sum=0;
		for(int i=0; i<n.length;i++)
		{
			if(n[i]>h)
			{
				h=n[i];
			}
			if(n[i]<l)
			{
				l=n[i];
			}
			sum=sum + n[i];
		}
		System.out.println("Minimum value: " + l);
		System.out.println("Maximum value: " + h);
        System.out.println("Sum of elements: "+sum);
	}

	public static void Q7()
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a statement here: ");
		String s = sc.nextLine();
		System.out.print("Enter a word to search here: ");
		String search = sc.nextLine();
		s=s.trim();
		s=s+" ";
		String w ="";
		int c=0;

		for(int i=0;i<s.length();i++)
		{
			char ch = s.charAt(i);
			if(ch!=' ')
			{
				w=w+ch;
			}
			else
			{
				if(w.length()>0 && w.equalsIgnoreCase(search))
				{
					c++;
				}			
				w="";
			}
		}
		System.out.println("The word you searched occured "+ c +" times");
	}

    public static void Q8()
	{
		Scanner sc = new Scanner(System.in);
        int opt;
        System.out.println("Select an option:");
        System.out.println("1. To convert from Celsius to Fahrenheit");
        System.out.println("2. To convert from Fahrenheit to Celsius");
        System.out.println("3. Exit Menu");
        System.out.println("Enter choice here: ");
        opt=sc.nextInt();
        do
        {
            switch(opt)
            {
                case 1:
                 System.out.print("Enter temperature in Celsius: ");
                 double c=sc.nextInt();
				 double f=(1.8*c)+32;
				 System.out.println("Temp in Fahrenheit= "+ f);
                break;
                case 2:
                 System.out.print("Enter temperature in Celsius: ");
                 double F = sc.nextInt();
                 double C= 5/9*(F-32);
				 System.out.println("Temp in Celsius= "+ C);
                break;
                case 3:
                System.out.println("Thank you!");
                break;
                default:
                System.out.println("Wrong input");
            }
        }while(opt!=3);
	}
	
	public static void Q9()
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a word: ");
		String s = sc.nextLine();
		s=s.trim();
		String w="",pal="";
		
		for(int i=0;i<s.length();i++)
		{
			char ch=s.charAt(i);
			w=w+ch;
			pal=ch+pal;
		}
		if(w.equalsIgnoreCase(pal))
		{System.out.println("It is a Palindrome");}
		else
		{System.out.println("It is not a Palindrome");}
	}
}
		
	
