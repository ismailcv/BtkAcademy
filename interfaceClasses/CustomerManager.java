package interfaceClasses;

public class CustomerManager {

//bunu d��ar�dan eri�ime kapat�yoruz.	
	private ICustomerDal customerDal;

//ba��ml�l��� azaltmak i�in constructor olu�turuyoruz 
// ve gelen veri taban�n� e�le�tiriyoruz.
	
    public CustomerManager(ICustomerDal customerDal) {
		this.customerDal = customerDal;
	}
		
		
	public void add(){
		//i� kodlar� yaz�l�r.
		customerDal.Add();
	}
	
}
