package project;

public class PerfectNumber {
	public static void main(String[] args) {
		
	int number = 6;
	int counter = 0;
	
	if(number>0){
		for(int i = 1; i <= (number-1);i++){
			if(number%i == 0){
				counter = counter + i ;
			}
		}
	    if(counter == number){
	    	System.out.println("Say�n�z m�kemmel say�d�r: " + number);
	    }
	    else {
	    	System.out.println("Say�n�z m�kemmel say� de�ildir: " + number);
		}
	
	}
	
	
	}
}
