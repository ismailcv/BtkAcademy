package interfaceClasses;

public class InterfaceMain {
	public static void main(String[] args) {
		
//Bu þekilde baðýmlýlýk azalaýyor ve istenilen elde ediliyor.
//Bu þekilde yaptýðým zaman biz buraya ne istersek onu koyabiliyoruz.
//Ýstersek mysql gibi çalýþmasýný isteriz istersek oracle gibi.		
		
		CustomerManager customerManager = 
				new CustomerManager(new MySqlCustomerDal());
	 
	    customerManager.add();
	    
	}
}
