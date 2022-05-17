package staticDemo;
//bu sýnýfýn amacý ise bir veri tabaný olduðunu düþünelim ona
//bilgileri aktarýyor.
//Manager sýnýflarýndaki þeyler asla static yapýlmaz çünkü
//static olursa her kullanýcýda ayný olur zaten manager 
//sýnýfýnýn amacý onu her kullanýcýya göre deðiþtirmek.

public class ProductManager {
	public void add(Product product){
	
		ProductValidator validator = new ProductValidator();
		if (validator.isValid(product)) {
			System.out.println("Ürün veri tabanýna eklendi.");
		}else{
			System.out.println("Ürün bilgileri geçersiz.");
		}	
	
	
	}
}
