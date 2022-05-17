package arraylistDemo;

import java.util.ArrayList;

//arraylist'e obje gönderdiğimiz için sayı da gönderebiliriz harfte
// 
public class ArraylistMain {
	public static void main(String[] args) {
		
	ArrayList numbers = new ArrayList();

//listeye eleman ekledik.	
	numbers.add(5);
	numbers.add(20);
	numbers.add("Ankara");
	numbers.add("İstanbul");
	numbers.add(3);
	numbers.add(7);
	numbers.add(25);
	
	
	System.out.println("Arraylist'in boyutu: " + numbers.size());

//indexteki elemanı değiştirdik.	
	numbers.set(1, 150);
	System.out.println(numbers.get(1));

//Listeden eleman silersen liste kayar static değil dinamik.	
	numbers.remove(2);
	

//Diziyi for döngüsü ile yazmak istersek obje olarak almalıyız
//çünkü arraylist bir obje tutar.
	
	System.out.println("\nDizi yazdırılıyor");
	for(Object i:numbers){
		System.out.println(i);
	}
	
	
	
	
	
	
	}
}
