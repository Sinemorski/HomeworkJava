package HW2JavaSyntax;
import java.util.Scanner;

public class RectangleArea {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter sides of a rectangle");
		System.out.print("a = ");
		int a = in.nextInt();
		System.out.print("b = ");
		int b = in.nextInt();
		int area = a * b;
		System.out.print("Area = " + area);
		in.close();
	}

}
