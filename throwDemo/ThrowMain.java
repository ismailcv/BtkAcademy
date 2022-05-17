package throwDemo;

//bu çalýþmada bir bankada ki hesabýmýzdan para çekme yatýrma
//ve diðer iþlemleri nasýl yaparýz onun uygulamasýný yapacaðýz.

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
