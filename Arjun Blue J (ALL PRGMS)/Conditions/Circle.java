package Conditions;
public class Circle
{
    public void doArea(double r)
    {
        double area=22.0/7*r*r;
        System.out.print(area);
    }
    public void doCircumference(double r)
    {
        double circumference=2*22.0/7*r;
        System.out.print(circumference);
    }
    public void doCalAreaCF(double r)
    {
        double area=22.0/7*r*r;
        System.out.print("Area =\t"+area);
        double circumference    =2*22.0/7*r;
        System.out.print("circumference= "+circumference);    
        
        circumference    =r*2*22/7;
        System.out.print("circumference= "+circumference);
        
        
        
        
        
    }
  
}
