package HW2JavaSyntax;
import java.util.Scanner;

public class PointsInsideTheHouse {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter two floting-point numbers separated by a space: ");
		while (true) {
			String str = in.nextLine();
			String[] parts = new String[2];
			parts = str.split(" ");
			double x = Double.parseDouble(parts[0]);
			double y = Double.parseDouble(parts[1]);
			//(Bx-Ax)*(Y-Ay) - (By-Ay)*(X-Ax)
			double vektorA = (17.5 - 12.5)*(y - 8.5) - (3.5 - 8.5)*(x - 12.5);
			double vektorB = (22.5 - 17.5)*(y - 3.5) - (8.5 - 3.5)*(x - 17.5);
			
			if ((x >= 12.5 && x <= 17.5) && (y >= 8.5 && y <= 13.5)) {
				System.out.println("Inside");
			}
			else if ((x >= 20 && x <= 22.5) && (y >= 8.5 && y <= 13.5)) {
				System.out.println("Inside");
			}
			else if (vektorA >= 0 && vektorB >= 0 && y <= 8.5) {
				System.out.println("Inside");
			}
			else {
				System.out.println("Outside");
			}
		}
	}

}