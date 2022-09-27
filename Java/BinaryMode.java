import java.util.Scanner;
public class BinaryMode{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Input first number: ");
		int in = input.nextInt();
		System.out.println("  ||Number of zero is " +ConvertToBinary(in));
	}

	public static int ConvertToBinary(int n) {
		int ctr=0;
		String binaryNumber = Integer.toBinaryString(n);

		System.out.print("Binary representation of "+n+" is: "+binaryNumber);

		for (char ch: binaryNumber.toCharArray()) {
			ctr += ch == '0' ? 1 : 0;
		}
		return ctr;
	}
}