package HWOneIntroductionToJav;
import java.util.Scanner;

public class SumTwoNumbers {

	public static void main(String[] args) {
       Scanner in = new Scanner(System.in); 
       System.out.printf("Enter number a: ");
       int a = in.nextInt();
       System.out.printf("Enter numer b: ");
       int b = in.nextInt();
       int sum = a + b;
       System.out.printf("Sum = " + sum);
       in.close();
	}

}