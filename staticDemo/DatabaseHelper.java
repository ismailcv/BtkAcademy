package staticDemo;

//Bu k�s�mda biraz inner class var ancak ger�ek hayatta
//inner class'lar fazla kullan�lm�yor.
//single responsibility yasas�na uymuyor.
//veri taban� yard�mc�s� olarak kullan�yoruz.
public class DatabaseHelper {
	public static class Crud{//create, read, update, delete
	
		public static void Create(){
			System.out.println("�r�n database'e eklendi.");
		}
        public static void Read(){
        	System.out.println("�r�n bilgileri okundu.");
		}
        public static void Update(){
        	System.out.println("�r�n bilgileri g�ncellendi.");
        }
        public static void Delete(){
        	System.out.println("�r�n database'den silindi.");
        }
		
		
		
	}
	
//veri tabanlar�na ba�lant� i�in kullan�yoruz.	
	public static class Connection{
		public static void createConnection(){
			System.out.println("Database ile ba�lant� kuruluyor.");
		}
	}
}
