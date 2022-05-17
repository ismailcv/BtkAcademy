package exceptionHandling;

public class ExceptionMain {
	public static void main(String[] args) {
	
		try{
//derleyici bu k�s�mda bi hata bulamayacak ancak �al��ma an�nada
//hata olu�acak ve o hatay� ��zmemiz gerekli.			
			int[] sayilar = new int[]{1,2,3};
			System.out.println(sayilar[5]);

//yukar�da olu�an hata a��a��daki exception'a parametre olarak gelir			
		}catch(ArrayIndexOutOfBoundsException exception){
			System.out.println("Hata olu�tu.\n" +
		    "Hata nedeni: " + exception);
		}catch(StringIndexOutOfBoundsException exception){
			System.out.println("Hata olu�tu.\n" +
				    "Hata nedeni: " + exception);
		}finally{
			System.out.println("Finally her t�rl� �al���r.");
		}
			
	}
}
