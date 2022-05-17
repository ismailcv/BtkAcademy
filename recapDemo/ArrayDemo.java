package recapDemo;

public class ArrayDemo {

	public static void main(String[] args) {
		double[] numbers = { 1.2, 3.4, 2.8, 3.6 };

		double total = 0;
		double max = numbers[0];

		for (int i = 0; i < numbers.length; i++) {
			total = total + numbers[i];
			System.out.println("sayý: " + numbers[i]);
		}

		for (int i = 0; i < numbers.length; i++) {

			if (max < numbers[i]) {
				max = numbers[i];
			}
		}

		System.out.println("Toplam: " + total);
		System.out.println("En büyük: " + max);

	}
}
