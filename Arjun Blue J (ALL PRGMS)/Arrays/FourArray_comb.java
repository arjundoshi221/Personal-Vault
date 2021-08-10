package Arrays;
public class FourArray_comb
{
    public static void LinearSearch(int r)
    {
        int n[]={1,2,3,4,5,6,7,8,9,10};
        int m[]={75,78,65,79,36,71,76,68,65,78};
        int c=0;
        for(int i=0;i<n.length;i++)
        {
            if(n[i]==r)
            {
                System.out.print("Marks: "+m[i]+"\tRoll number: "+ r);
                c++;
            }
        }
        if(c==0)
        {
            System.out.println("Sorry roll number not found");
        }
    }
    
    public static void binarySearch(int r)
    {
        int n[]={1,2,3,4,5,6,7,8,9,10};
        int m[]={75,78,65,79,36,71,76,68,65,78};
        int l=0,u=n.length-1;
        int c=0;
        while(l<=u)
        {
            int mid=(l+u)/2;
            if(n[mid]==r)
            {
                System.out.println("Roll number: "+r+"\tMarks: "+m[mid]);
                c++;
                break;
            }
            if(n[mid]>r)
            {
                u=mid-1;
            }
            if(n[mid]<r)
            {
                l=mid+1;
            }
        }
        if(l>u || c==0)
        {
            System.out.println("Sorry number not found!");
        }
    }
    
    public static void SelectionSort()
    {   
        int n[]={1,2,3,4,5,6,7,8,9,10};
        int m[]={75,78,65,79,36,71,76,68,65,78};
        
        for(int i=0;i<m.length;i++)//selected
        {
            for(int j=i+1;j<m.length;j++)//range
            {
                if(m[i]>m[j])//acending || (n[i]<n[j])descending
                {
                    int c=n[i];
                    n[i]=n[j];
                    n[j]=c;
                    
                    int a=m[i];
                    m[i]=m[j];
                    m[j]=a;
                }
            }
        }
        System.out.println("Roll number:\tMarks: ");
        for(int i=0;i<m.length;i++)
        {
            System.out.println(n[i]+"\t\t"+ m[i]);
        }
    }
    
    public static void BubbleSort()
    {
        int n[]={1,2,3,4,5,6,7,8,9,10};
        int m[]={75,78,65,79,36,71,76,68,65,78};
        
        for(int i=0;i<m.length;i++)//range (bubble)
        {
            for(int j=0;j<m.length-i-1;j++)//selected terms
            {
                if(m[j]>m[j+1])//acending // (m[j]<m[j+1])descending
                {
                    int c=n[j];
                    n[j]=n[j+1];
                    n[j+1]=c;
                    
                    int a=m[j];
                    m[j]=m[j+1];
                    m[j+1]=a;
                }
            }
        }
        System.out.println("Roll number:\tMarks: ");
        for(int i=0;i<m.length;i++)
        {
            System.out.println(n[i]+"\t\t"+ m[i]);
        }
    }
}
