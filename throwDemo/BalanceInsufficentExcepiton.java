package throwDemo;

public class BalanceInsufficentExcepiton extends Exception {

	String message;
	public BalanceInsufficentExcepiton(String message){
		this.message = message;
		
	}
	
	public String getMessage(){
		return this.message;
	}
}
