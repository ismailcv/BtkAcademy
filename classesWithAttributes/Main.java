package classesWithAttributes;

public class Main {

	public static void main(String[] args) {
		
    Product product = new Product(1,"Laptop","lenovo ideapad Gaming",
    		15000,20,"Blue");
    
    product.setId(1);
    product.setName("Laptop");
    product.setDescription("lenovo ideapad Gaming");
    product.setPrice(15000); 
    product.setStockAmount(20); 
    product.setColour("Blue"); 
    
    
    ProductManager productManager = new ProductManager();
    //Burada direk product nesnesini ekledik.
    productManager.Add(product);
	}
}
