public class PowerOfTwo {
	public static void main (String[] args) {

		//read in one command line argument
		int n = Integer.parseInt(args[0]);
		//int n=6;
		int i=0;
		int powoftwo=1;
		//repeat until N
		while (i<=n) {
			System.out.println (i + " " + powoftwo);
			powoftwo=2*powoftwo;
			i=i+1;
		}
	}
}