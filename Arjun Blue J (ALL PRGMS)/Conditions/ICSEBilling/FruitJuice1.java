package Conditions.ICSEBilling;
/**
 * Define a class called FruitJuice with the following description:

Instance variables/data members:

int product_code – stores the product code number

String flavour – stores the flavor of the juice. (orangle, apple, etc.)

String pack_type – stores the type of packaging (tetra-pack, bottle, etc.)

int pack_size – stores package size (200ml, 400ml, etc.)

int product_price – stores the price of the product

Member methods:

FruitJuice() – default constructor to initialize integer data members to zero and string data members to “”

void input() – to input and store the product code, flavor, pack type, pack size and product price

void discount() – to reduce the product price by 10

void display() – to display the product code, flavor, pack type, pack size and product price

[15 marks]
 */
public class FruitJuice1
{ 
    int product_code ;
    String flavour  ;
    String pack_type  ;
    int pack_size  ;
    int product_price;  
    
    public  FruitJuice1()
    {
         product_code = 0 ;
         flavour = "fggg"  ;
         pack_type = "" ;
         pack_size = 0  ;
         product_price = 0;
    }
    
    public void input(int pc, String f, String pt ,int ps ,int pp)
    {
         product_code = pc;
         flavour = f;
         pack_type = pt;
         pack_size = ps;
         product_price = pp;
        
    }
    
    public void discount()
    {
        product_price = product_price - 10;
    }
    
    public void display()
    {
        System.out.println("Product code = "+product_code);
        System.out.println("Flavour = "+flavour);
        System.out.println("Pack type = "+ pack_type);
        System.out.println("Pack size = "+ pack_size + " ml" );
        System.out.println("Product price = "+ product_price);
    }
}
