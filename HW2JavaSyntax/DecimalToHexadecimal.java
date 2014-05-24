package HW2JavaSyntax;
import java.util.Scanner;

public class DecimalToHexadecimal {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter a positive number");
		int number = in.nextInt();
		while (number < 0) {
			System.out.println(number + " is not a positive number!");
			System.out.println("Try again: ");
			number = in.nextInt();
		}
		String hex = Integer.toHexString(number).toUpperCase();
		System.out.println(hex);
		in.close();
	}
}