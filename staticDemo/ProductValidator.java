package staticDemo;

//bu s�n�f� bir �r�n� kaydederken bir �r�n� g�ncellerken
//kurallara uyup uymad���n� kontrol etmek i�in olu�turduk.
public class ProductValidator {

//bu fonksiyon �unu yap�yor. eklemeye �al��t���m�z �r�n�n
//isim ve fiyat bilgisi girildiyse �r�n� ekliyor girilmediyse
//�r�n� eklemiyor.	
	
	public boolean isValid(Product product){
		if(product.price>0 && !product.name.isEmpty()){
			return true;
		}else{
			return false;
		}
	}





}
