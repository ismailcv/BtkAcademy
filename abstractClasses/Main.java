package abstractClasses;

public class Main {

	public static void main(String[] args) {
		
		WomanGameCalculator womanGameCalculator = new WomanGameCalculator();
		ManGameCalculator manGameCalculator = new ManGameCalculator();
		KidsGameCalculator kidsGameCalculator = new KidsGameCalculator();
		
		System.out.println("Kadýnlar için: ");
		womanGameCalculator.calculate();
		womanGameCalculator.gameOver();
		
		System.out.println("\nÇocuklar için: ");
		kidsGameCalculator.calculate();
		kidsGameCalculator.gameOver();
		
		System.out.println("\nErkekler için: ");
		manGameCalculator.calculate();
		manGameCalculator.gameOver();
		
		

	}
}
