package HW2JavaSyntax;
import java.util.Scanner;

public class TriangleArea {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enters 3 points in the plane as integer x and y coordinates");
		System.out.print("Enter Ax: ");
		int Ax = in.nextInt();
		System.out.print("Enter Ay: ");
		int Ay = in.nextInt();
		System.out.print("Enter Bx: ");
		int Bx = in.nextInt();
		System.out.print("Enter By: ");
		int By = in.nextInt();
		System.out.print("Enter Cx: ");
		int Cx = in.nextInt();
		System.out.print("Enter Cy: ");
		int Cy = in.nextInt();
		
		int area = 0;
		area = (Ax*(By - Cy) + Bx*(Cy - Ay) + Cx*(Ay - By)) / 2;
		if (area < 0) {
			area = area * (-1);
		}
		System.out.println(area);
		in.close();
	}

}
