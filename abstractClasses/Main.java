package abstractClasses;

public class Main {

	public static void main(String[] args) {
		
		WomanGameCalculator womanGameCalculator = new WomanGameCalculator();
		ManGameCalculator manGameCalculator = new ManGameCalculator();
		KidsGameCalculator kidsGameCalculator = new KidsGameCalculator();
		
		System.out.println("Kad�nlar i�in: ");
		womanGameCalculator.calculate();
		womanGameCalculator.gameOver();
		
		System.out.println("\n�ocuklar i�in: ");
		kidsGameCalculator.calculate();
		kidsGameCalculator.gameOver();
		
		System.out.println("\nErkekler i�in: ");
		manGameCalculator.calculate();
		manGameCalculator.gameOver();
		
		

	}
}
