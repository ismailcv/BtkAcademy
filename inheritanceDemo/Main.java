package inheritanceDemo;

public class Main {

	public static void main(String[] args) {
	
        OgretmenKrediManager ogretmenKrediManager = new OgretmenKrediManager();
        
        KrediUI krediUI = new KrediUI();
        
//Kredi kullan�c� aray�z� olu�turduk ve ona direk bir s�n�f� verdik.
//Bu sayede oradaki fonksiyonlar� yapabiliyor.        
        krediUI.KrediHesapla(new OgretmenKrediManager());
        
        ogretmenKrediManager.Hesapla();
	
		
		
	
	
	
	
	}
}
