package arraylistDemo;

import java.util.ArrayList;

//arraylist'e obje g�nderdi�imiz i�in say� da g�nderebiliriz harfte
// 
public class ArraylistMain {
	public static void main(String[] args) {
		
	ArrayList numbers = new ArrayList();

//listeye eleman ekledik.	
	numbers.add(5);
	numbers.add(20);
	numbers.add("Ankara");
	numbers.add("�stanbul");
	numbers.add(3);
	numbers.add(7);
	numbers.add(25);
	
	
	System.out.println("Arraylist'in boyutu: " + numbers.size());

//indexteki eleman� de�i�tirdik.	
	numbers.set(1, 150);
	System.out.println(numbers.get(1));

//Listeden eleman silersen liste kayar static de�il dinamik.	
	numbers.remove(2);
	

//Diziyi for d�ng�s� ile yazmak istersek obje olarak almal�y�z
//��nk� arraylist bir obje tutar.
	
	System.out.println("\nDizi yazd�r�l�yor");
	for(Object i:numbers){
		System.out.println(i);
	}
	
	
	
	
	
	
	}
}
