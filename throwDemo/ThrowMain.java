package throwDemo;

//bu �al��mada bir bankada ki hesab�m�zdan para �ekme yat�rma
//ve di�er i�lemleri nas�l yapar�z onun uygulamas�n� yapaca��z.

public class ThrowMain {
	public static void main(String[] args) {
	
		AccountManager manager = new AccountManager();
		System.out.println("Hesap = " + manager.getBalance());
		manager.deposit(100);
		System.out.println("Hesap = " + manager.getBalance());
		
		try {
			manager.withdraw(90);
		} catch (BalanceInsufficentExcepiton exception) {
			System.out.println(exception.getMessage());
		}
		System.out.println("Hesap = " + manager.getBalance());
		
		try {
			manager.withdraw(90);
		} catch (BalanceInsufficentExcepiton exception) {
			System.out.println(exception.getMessage());
		}
		System.out.println("Hesap = " + manager.getBalance());
	
	
	
	
	}
}
