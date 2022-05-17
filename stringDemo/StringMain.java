package stringDemo;

public class StringMain {

	public static void main(String[] args) {
		String message = "Bugün hava çok güzel.";
		System.out.println(message);
		
		System.out.println("Eleman sayýsý: " + message.length());
		System.out.println("5. eleman: " + message.charAt(4));
		System.out.println("Eklediðimiz hal: " + message.concat(" hello"));
		System.out.println("B ile baþlýyor mu?: " + message.startsWith("B"));
		System.out.println(". ilemi bitiyor?: " + message.endsWith("."));
		System.out.println("Ýçinde ha var mý?: " + message.indexOf("ha")); 
	
	    String newMes = message.replace(' ', '_');
	    System.out.println("\nDeðiþtirilmiþ hal: " + newMes);
	    System.out.println("Harfler büyültüldü: " + message.toUpperCase()); 
	
	
	}	
}
