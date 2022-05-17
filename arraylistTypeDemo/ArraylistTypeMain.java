package arraylistTypeDemo;

import java.util.ArrayList;
import java.util.Collections;

public class ArraylistTypeMain {

	public static void main(String[] args) {
		
//Type safe kullaným yani tip korumalý kullaným denir. Bu arraylist
//sadece istediðimiz veriler yani String veriler ile çalýþýr. 
//Bu bizim programlarda istediðimiz bir þeydir.		
		
		ArrayList<String> cities = new ArrayList<String>(); 
	    cities.add("Ankara");
	    cities.add("Ýstanbul");
	    cities.add("Ýzmir");
	    cities.add("Adana");
	    
// harflerine bakarak sýralama yaptý.	    
	    Collections.sort(cities);
	    
	    for(String city: cities){
	    	System.out.println(city);
	    }
	
	
	
	
	
	
	
	
	
	
	}
}
