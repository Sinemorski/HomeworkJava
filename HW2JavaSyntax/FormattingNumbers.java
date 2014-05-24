package HW2JavaSyntax;
import java.util.Locale;
import java.util.Scanner;


public class FormattingNumbers {

	public static void main(String[] args) {
		Locale.setDefault(Locale.ROOT);
		Scanner in = new Scanner(System.in);
		System.out.println("Enter an integer number (0 <= number <= 500): ");
		int a = in.nextInt();
		while (a < 0 || a > 500) {
			System.out.println("Incorrect value of the number!");
			System.out.println("Try again (0 <= number <= 500): ");
			a = in.nextInt();
		}
		System.out.println("Enter a floating-point number: ");
		double b = in.nextDouble();
		System.out.println("Enter second floating-point number: ");
		double c = in.nextDouble();
		String binaryA = String.format("%10s", Integer.toBinaryString(a)).replaceAll(" ", "0");
		System.out.printf("|%1$-10X|%2$10s|%3$10.2f|%4$-10.3f|", a , binaryA, b ,c);
	}

}