package staticDemo;
//bu s�n�f�n amac� ise bir veri taban� oldu�unu d���nelim ona
//bilgileri aktar�yor.
//Manager s�n�flar�ndaki �eyler asla static yap�lmaz ��nk�
//static olursa her kullan�c�da ayn� olur zaten manager 
//s�n�f�n�n amac� onu her kullan�c�ya g�re de�i�tirmek.

public class ProductManager {
	public void add(Product product){
	
		ProductValidator validator = new ProductValidator();
		if (validator.isValid(product)) {
			System.out.println("�r�n veri taban�na eklendi.");
		}else{
			System.out.println("�r�n bilgileri ge�ersiz.");
		}	
	
	
	}
}
