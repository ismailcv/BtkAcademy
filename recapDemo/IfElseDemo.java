package recapDemo;

public class IfElseDemo {
	public static void main(String[] args) {
		int num1 = 20;
		int num2 = 30;
		int num3 = 40;
		int biggest = num1;

		if (biggest < num2) {
			biggest = num2;
		}
		if (biggest < num3) {
			biggest = num3;
		}

		System.out.println("En büyük sayý: " + biggest);
	}
}
