package staticDemo;

//bu sýnýfý bir ürünü kaydederken bir ürünü güncellerken
//kurallara uyup uymadýðýný kontrol etmek için oluþturduk.
public class ProductValidator {

//bu fonksiyon þunu yapýyor. eklemeye çalýþtýðýmýz ürünün
//isim ve fiyat bilgisi girildiyse ürünü ekliyor girilmediyse
//ürünü eklemiyor.	
	
	public boolean isValid(Product product){
		if(product.price>0 && !product.name.isEmpty()){
			return true;
		}else{
			return false;
		}
	}





}
