package HW2JavaSyntax;
import java.util.Scanner;

public class CountEqualBitPairs {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int n = in.nextInt();
		String binaryN = Integer.toBinaryString(n);
		System.out.println("Binary representation of your number: ");
		System.out.println(binaryN);
		System.out.println("The count of sequences of two equal bits (\"00\" or \"11\") is: ");
		int maxI = binaryN.length();
		if (maxI < 2) {
			System.out.println(0);
			return;
		}
		
		int count = 0;
		int bitP = 0;
		int[] bits = new int[maxI];
				
		for (int i = 0; i < maxI; i++) {
			int getBit = (n >> bitP) & 1;
			bits[i] = getBit;
			bitP++;		
		}
		int bitRight = bits[0];
		int bitLeft = 0;
		
		for (int i = 1; i < maxI; i++) {
			bitLeft = bits[i];
			if (bitLeft == bitRight) {
				count++;
			}
			bitRight = bitLeft;
		}
		
		System.out.println(count);
		in.close();
	}

}