package Arrays;
public class Xpaper
{
    public static void main()
    {
        int n[]={5,2,8,9,5,11,77,9,3,0};
        int h=n[0],l=n[0];
        for(int i=0;i<n.length;i++)
        {
            
            if(n[i]>h)
            {
                h=n[i];
            }
            if(n[i]<l)
            {
                l=n[i];
            }
        }
        System.out.println("Highest no. ="+h);
        System.out.println("Lowest no. ="+l);
    }


    public static void main2(int n[], int sNo)
    {
        /**Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number you want to search: ");
        int sNo=sc.nextInt();*/
       
        int c=0;
              
        for(int i=0;i<n.length;i++)
        {
            if(n[i]==sNo)
            {
                c++;
                System.out.println("Your Number is found at "+(i+1));
            }
        }
        if(c==0)
        {
            System.out.println("Your Number not found");
        }
    }
    
}

  


