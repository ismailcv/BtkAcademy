package stringDemo;

public class StringMain {

	public static void main(String[] args) {
		String message = "Bug�n hava �ok g�zel.";
		System.out.println(message);
		
		System.out.println("Eleman say�s�: " + message.length());
		System.out.println("5. eleman: " + message.charAt(4));
		System.out.println("Ekledi�imiz hal: " + message.concat(" hello"));
		System.out.println("B ile ba�l�yor mu?: " + message.startsWith("B"));
		System.out.println(". ilemi bitiyor?: " + message.endsWith("."));
		System.out.println("��inde ha var m�?: " + message.indexOf("ha")); 
	
	    String newMes = message.replace(' ', '_');
	    System.out.println("\nDe�i�tirilmi� hal: " + newMes);
	    System.out.println("Harfler b�y�lt�ld�: " + message.toUpperCase()); 
	
	
	}	
}
