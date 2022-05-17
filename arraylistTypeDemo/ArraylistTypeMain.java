package arraylistTypeDemo;

import java.util.ArrayList;
import java.util.Collections;

public class ArraylistTypeMain {

	public static void main(String[] args) {
		
//Type safe kullan�m yani tip korumal� kullan�m denir. Bu arraylist
//sadece istedi�imiz veriler yani String veriler ile �al���r. 
//Bu bizim programlarda istedi�imiz bir �eydir.		
		
		ArrayList<String> cities = new ArrayList<String>(); 
	    cities.add("Ankara");
	    cities.add("�stanbul");
	    cities.add("�zmir");
	    cities.add("Adana");
	    
// harflerine bakarak s�ralama yapt�.	    
	    Collections.sort(cities);
	    
	    for(String city: cities){
	    	System.out.println(city);
	    }
	
	
	
	
	
	
	
	
	
	
	}
}
