package exceptionHandling;

public class ExceptionMain {
	public static void main(String[] args) {
	
		try{
//derleyici bu kýsýmda bi hata bulamayacak ancak çalýþma anýnada
//hata oluþacak ve o hatayý çözmemiz gerekli.			
			int[] sayilar = new int[]{1,2,3};
			System.out.println(sayilar[5]);

//yukarýda oluþan hata aþþaðýdaki exception'a parametre olarak gelir			
		}catch(ArrayIndexOutOfBoundsException exception){
			System.out.println("Hata oluþtu.\n" +
		    "Hata nedeni: " + exception);
		}catch(StringIndexOutOfBoundsException exception){
			System.out.println("Hata oluþtu.\n" +
				    "Hata nedeni: " + exception);
		}finally{
			System.out.println("Finally her türlü çalýþýr.");
		}
			
	}
}
