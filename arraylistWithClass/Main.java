package arraylistWithClass;

import java.util.ArrayList;

public class Main {
	public static void main(String[] args) {
		
	ArrayList<Customer> customers = new ArrayList<Customer>();

//elemanlar� bu �ekilde tan�mlarsak eleman silmek istedi�imizde
//onlar� silemeyiz.
	
	customers.add(new Customer(1, "�smail Can", "Varl�"));
	customers.add(new Customer(2, "Serkan", "Varl�"));
	customers.add(new Customer(3, "Y�lmaz", "Varl�"));

//Ama �u �ekilde tan�mlarsak eleman silinebilir.	
    Customer customer1 = new Customer(4, "Cahide", "Varl�");
    customers.add(customer1);
    
	for(Customer customer:customers){
		System.out.println(customer.firstName +" "+ customer.lastName);
	}
	
	customers.remove(customer1);
	System.out.println("Silme i�lemi yap�l�yor.");
	for(Customer customer:customers){
		System.out.println(customer.firstName +" "+ customer.lastName);
	}
	
	
	
	}
}
