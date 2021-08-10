package Conditions;
public class Calculator
{
    double lcd=0;
    public void doAdd(double n)
    {
        lcd =
        lcd
        +n;
        System.out.print(lcd);
    }
    public void doSub(double n)
    {
        lcd = lcd-n;
        System.out.print(lcd);
    }
    public void doMultiplication(double n)
    {
        lcd = lcd*n;
        System.out.print(lcd);
    }
    public void doDiv(double n)
    {
        lcd = lcd/n;
        System.out.print(lcd);
    }
    public void doRemainder(double n)
    {
        lcd = lcd%n;
        System.out.print(lcd);
    }
    public void doSquare()
    {
        lcd = lcd*lcd;
        System.out.print(lcd);
    }
    public void Reciprocate()
    {
        lcd = 1/lcd;
        System.out.print(lcd);
    }
    public void arjun(double n)
    {
        lcd = lcd*lcd*n;
        System.out.print(lcd);
    }
}

