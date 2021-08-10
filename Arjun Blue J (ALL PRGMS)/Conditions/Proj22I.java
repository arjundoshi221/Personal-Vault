package Conditions;
public class Proj22I
{
    public static void main(double litres)
      {
        int amount=0;
        if(litres<=200)
            amount=80;
        if(litres>200 && litres<=400)
            amount=200;
        if(litres>400 && litres<=600)
            amount=500;
        if(litres>600 && litres<=1000)
            amount=1500;
        if(litres>1000)
            amount=5000;
        System.out.println("The amount for " + litres + " is Rupees " + amount);    
      }
    
        
}
