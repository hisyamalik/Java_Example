import java.util.Scanner;
public class InputSomeNumber {
	public static void main(String[] args) {
		int i, n=0, s=0;
		double avg;
		{
			System.out.println("Input 5 number: ");
		}
		for (i=0;i<5;i++) {
			Scanner in = new Scanner(System.in); //Input in 5 line
			n = in.nextInt();

			s+=n;
		}
		avg=s/5;
		System.out.println("The sum of 5 number is: "+s+"\nThe average is: "+avg);
	}
}