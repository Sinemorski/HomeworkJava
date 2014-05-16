package HWOneIntroductionToJav;
import java.util.Scanner;
import java.util.Arrays;

public class SortArrayOfStrings {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter number of strings: ");
		int n = in.nextInt();
		String[] arrayStr = new String[n];
		System.out.println("Enter " + n + " strings: ");
				
		for (int i = 0; i < n; i++) {
			arrayStr[i] = in.next();
		}
		Arrays.sort(arrayStr);
		//System.out.println(Arrays.toString(arrayStr));
		System.out.println("Your strings sorts alphabetically: ");
		for (int i = 0; i < n; i++) {
			System.out.println(arrayStr[i]);
		}
		
		in.close();
	}

}