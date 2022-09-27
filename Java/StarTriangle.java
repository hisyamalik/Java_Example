public class StarTriangle {
	public static void main (String[] args) {
		//n --> number of row
		int n= Integer.parseInt(args[0]);

		for (int i=1;i <= n; i++) {
			for (int j=n-1;j >= i; j--) { // loops to print space in every row
				System.out.print(" ");
			}
			
			for (int k=1; k<=(2*i-1); k++){
				System.out.print("*"); // loops to print star in every row
			}
			System.out.println(""); // enter in new row
		}

	}
}