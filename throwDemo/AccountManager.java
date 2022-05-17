package throwDemo;

public class AccountManager {
	private double balance; //bakiye

	public double getBalance() {
		return balance;
	}
	
//bu hesaba para yatýrmak için kullandýðýmýz fonksiyon.	
    public void deposit(double amount){
    	balance = getBalance() + amount;
    }

//bu hesaptan para çekmek için kullandýðýmýz fonksiyon.
//Throw yaptýðýmýz zaman o throw hangi metod yada hangi birim kullanacak ise
//ona throws Exception'u ekler. Belli etmek için yapar bunu.    
    public void withdraw(double amount) throws BalanceInsufficentExcepiton{
    	if(balance >= amount){
    		balance = getBalance() - amount;
    	} else{
    		throw new BalanceInsufficentExcepiton("Bakiye yetersiz.");		
    	}
    	
    }
    

}
