package HW2JavaSyntax;
import java.util.Scanner;

public class TheSmallestNumber {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter number a: ");
		double a = in.nextDouble();
		System.out.println("Enter number b: ");
		double b = in.nextDouble();
		System.out.println("Enter number c: ");
		double c = in.nextDouble();
		
		if (a <= b && a <= c) {
			System.out.println("The smallest numer is " + a);
		}
		else if (b <= a && b <= c) {
			System.out.println("The smallest numer is " + b);
		}
		else if (c <= a && c <= b) {
			System.out.println("The smallest numer is " + c);
		}
		in.close();
	}

}
