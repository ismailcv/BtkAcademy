package throwDemo;

public class AccountManager {
	private double balance; //bakiye

	public double getBalance() {
		return balance;
	}
	
//bu hesaba para yat�rmak i�in kulland���m�z fonksiyon.	
    public void deposit(double amount){
    	balance = getBalance() + amount;
    }

//bu hesaptan para �ekmek i�in kulland���m�z fonksiyon.
//Throw yapt���m�z zaman o throw hangi metod yada hangi birim kullanacak ise
//ona throws Exception'u ekler. Belli etmek i�in yapar bunu.    
    public void withdraw(double amount) throws BalanceInsufficentExcepiton{
    	if(balance >= amount){
    		balance = getBalance() - amount;
    	} else{
    		throw new BalanceInsufficentExcepiton("Bakiye yetersiz.");		
    	}
    	
    }
    

}
