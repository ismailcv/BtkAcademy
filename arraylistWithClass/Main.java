package arraylistWithClass;

import java.util.ArrayList;

public class Main {
	public static void main(String[] args) {
		
	ArrayList<Customer> customers = new ArrayList<Customer>();

//elemanlarý bu þekilde tanýmlarsak eleman silmek istediðimizde
//onlarý silemeyiz.
	
	customers.add(new Customer(1, "Ýsmail Can", "Varlý"));
	customers.add(new Customer(2, "Serkan", "Varlý"));
	customers.add(new Customer(3, "Yýlmaz", "Varlý"));

//Ama þu þekilde tanýmlarsak eleman silinebilir.	
    Customer customer1 = new Customer(4, "Cahide", "Varlý");
    customers.add(customer1);
    
	for(Customer customer:customers){
		System.out.println(customer.firstName +" "+ customer.lastName);
	}
	
	customers.remove(customer1);
	System.out.println("Silme iþlemi yapýlýyor.");
	for(Customer customer:customers){
		System.out.println(customer.firstName +" "+ customer.lastName);
	}
	
	
	
	}
}
