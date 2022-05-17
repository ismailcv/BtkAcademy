package interfaceClasses;

public class CustomerManager {

//bunu dýþarýdan eriþime kapatýyoruz.	
	private ICustomerDal customerDal;

//baðýmlýlýðý azaltmak için constructor oluþturuyoruz 
// ve gelen veri tabanýný eþleþtiriyoruz.
	
    public CustomerManager(ICustomerDal customerDal) {
		this.customerDal = customerDal;
	}
		
		
	public void add(){
		//iþ kodlarý yazýlýr.
		customerDal.Add();
	}
	
}
