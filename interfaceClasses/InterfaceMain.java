package interfaceClasses;

public class InterfaceMain {
	public static void main(String[] args) {
		
//Bu �ekilde ba��ml�l�k azala�yor ve istenilen elde ediliyor.
//Bu �ekilde yapt���m zaman biz buraya ne istersek onu koyabiliyoruz.
//�stersek mysql gibi �al��mas�n� isteriz istersek oracle gibi.		
		
		CustomerManager customerManager = 
				new CustomerManager(new MySqlCustomerDal());
	 
	    customerManager.add();
	    
	}
}
