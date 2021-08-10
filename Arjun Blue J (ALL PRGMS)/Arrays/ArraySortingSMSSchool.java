package Arrays;
public class ArraySortingSMSSchool
{
public static void doArraysSortWOScannerSelectionSMS(int m[])
    {
        
        for(int i=0;i<m.length;i++)
        {
            for(int j=i+1;j<m.length;j++)
            {
                if(m[i]>m[j])
                {
                    int c=m[i];
                    m[i]=m[j];
                    m[j]=c;
                }
            }
        }
        
        for(int i=0;i<m.length;i++)
        {
            System.out.println(m[i]);
        }
        
        
    }
}
