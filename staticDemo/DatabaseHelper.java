package staticDemo;

//Bu kýsýmda biraz inner class var ancak gerçek hayatta
//inner class'lar fazla kullanýlmýyor.
//single responsibility yasasýna uymuyor.
//veri tabaný yardýmcýsý olarak kullanýyoruz.
public class DatabaseHelper {
	public static class Crud{//create, read, update, delete
	
		public static void Create(){
			System.out.println("Ürün database'e eklendi.");
		}
        public static void Read(){
        	System.out.println("Ürün bilgileri okundu.");
		}
        public static void Update(){
        	System.out.println("Ürün bilgileri güncellendi.");
        }
        public static void Delete(){
        	System.out.println("Ürün database'den silindi.");
        }
		
		
		
	}
	
//veri tabanlarýna baðlantý için kullanýyoruz.	
	public static class Connection{
		public static void createConnection(){
			System.out.println("Database ile baðlantý kuruluyor.");
		}
	}
}
