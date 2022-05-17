package project;

public class FindNumber {
	public static void main(String[] args) {

		int[] numbers = { 5, 7, 15, 28, 36, 78, 45, 19 };
		int num = 36;

		for (int i = 0; i < numbers.length; i++) {
			if (num == numbers[i]) {
				System.out.println("Aradýðýnýz sayýyý buldunuz." + num);
			}
		}

	}
}
