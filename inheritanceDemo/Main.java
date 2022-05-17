package inheritanceDemo;

public class Main {

	public static void main(String[] args) {
	
        OgretmenKrediManager ogretmenKrediManager = new OgretmenKrediManager();
        
        KrediUI krediUI = new KrediUI();
        
//Kredi kullanıcı arayüzü oluşturduk ve ona direk bir sınıfı verdik.
//Bu sayede oradaki fonksiyonları yapabiliyor.        
        krediUI.KrediHesapla(new OgretmenKrediManager());
        
        ogretmenKrediManager.Hesapla();
	
		
		
	
	
	
	
	}
}
