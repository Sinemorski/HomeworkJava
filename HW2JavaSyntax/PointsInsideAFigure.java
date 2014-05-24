package HW2JavaSyntax;
import java.util.Scanner;

public class PointsInsideAFigure {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter two floting-point numbers separated by a space: ");
		while (true) {
			String str = in.nextLine();
			String[] parts = new String[2];
			parts = str.split(" ");
			double x = Double.parseDouble(parts[0]);
			double y = Double.parseDouble(parts[1]);
			
			if ((x >= 12.5 && x <= 22.5) && (y >= 6 && y <= 13.5)) {
				if ((x > 17.5 && x < 20) && y > 8.5) {
					System.out.println("Outside");
				}
				else {
					System.out.println("Inside");
				}
			}
			else {
				System.out.println("Outside");
			}
		}
	}

}