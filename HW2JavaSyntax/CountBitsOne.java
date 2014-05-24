package HW2JavaSyntax;
import java.util.Scanner;

public class CountBitsOne {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int n = in.nextInt();
		String binaryN = String.format("%16s", Integer.toBinaryString(n)).replaceAll(" ", "0");
		System.out.println("Binary representation of your number: ");
		System.out.println(binaryN);
		System.out.println("The count of bits 1 in the binary representation is: ");
		int count = 0;
		int bitP = 0;
		for (int i = 1; i <= 16; i++) {
			int getBits = (n >> bitP) & 1;
			bitP++;
			if (getBits == 1) {
				count++;
			}
		}
		System.out.println(count);
	}

}