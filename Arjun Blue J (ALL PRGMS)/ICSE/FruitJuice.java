package ICSE;
import java.util.*;
public class FruitJuice
{ 
    int product_code ;
    String flavour  ;
    String pack_type  ;
    int pack_size ;
    int product_price;  
    Scanner sc = new Scanner(System.in);
    public FruitJuice()
    {
         product_code = 0 ;
         flavour = ""  ;
         pack_type = "" ;
         pack_size = 0  ;
         product_price = 0;
    }
    
    private void input()
    {
        System.out.println("Product code = ");
        product_code = sc.nextInt();
        System.out.println("Flavour = ");
        flavour = sc.nextLine();
        System.out.println("Pack type = ");
        pack_type = sc.nextLine();
        System.out.println("Pack Size = ");
        pack_size = sc.nextInt();
        System.out.println("Product price = ");
        product_price = sc.nextInt();        
    }
    
    private void discount()
    {
        product_price = product_price - 10;
    }
    
    private void display()
    {
        System.out.println("Product code = "+product_code);
        System.out.println("Flavour = "+flavour);
        System.out.println("Pack type = "+ pack_type);
        System.out.println("Pack size = "+ pack_size + " ml" );
        System.out.println("Product price = "+ product_price);
    }
    
    public void main()
    {
        FruitJuice fj= new FruitJuice();
        fj.input();
        fj.discount();
        fj.display();
    }
}
