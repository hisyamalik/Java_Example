public class MinNumber {
	public static void main (String[] args) {
		int a = 11;
		int b = 8;
		int result = minFuction(a,b);
		System.out.println("Minimum value is " + result);

	}


	public static int minFuction(int n1, int n2) {
		int min;
		if (n1>n2)
			min = n2;
		else
			min = n1;

		return min;
	}
}