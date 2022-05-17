package arraysDemo;

public class ArrayMain {
	public static void main(String[] args) {

		String[] students = new String[3];
		students[0] = "engin";
		students[1] = "mahmut";
		students[2] = "lale";

		for (int i = 0; i < students.length; i++) {
			System.out.println("Öðrenci adý: " + students[i]);
		}
	}
}
