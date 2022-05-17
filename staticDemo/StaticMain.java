package staticDemo;

public class StaticMain {

	public static void main(String[] args) {
	
	ProductManager manager = new ProductManager();
	Product product = new Product();
	product.price = 10;
	product.name = "Mouse";
	
	manager.add(product);	
		
	DatabaseHelper.Crud.Delete();	
		
	DatabaseHelper.Crud.Create();
	DatabaseHelper.Connection.createConnection();
		
		
		
		
		
	}
}
