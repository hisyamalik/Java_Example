public class Binary {
	public static void main(String[] args) {
		int n=Integer.parseInt(args[0]);
		//for example n is 6
		int power=1;
		while (power <= n/2) { //power is smaller than n/2 = 3 so power = power*2 (1)
			power *= 2;
		}

		while (power>0) { //power is bigger than 0 so if n smaller than power then print 0
			if (n<power) {
				System.out.print(0);
			}
			else {
				System.out.print(1); //because n is bigger than power so system print 1 and n = n-power
				n -= power;
			}
			//n= 5, power=1
			power /= 2;
			//n=5, power= 1/2
		}
		System.out.println();
	}
}