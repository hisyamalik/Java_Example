import java.util.Scanner;
public class CharPyramid {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Input the row number: "); //input number of row
		int row = sc.nextInt();

		int count1=1, count2=1;
		char c = 'A';

		//(int i=1; i<(row*2); i++) for double pyramid
		for (int i=1; i<(row); i++) {
			//print space
			for (int spasi = row-count2; spasi>0; spasi--) {
				System.out.print(" ");
			}
			if (i<row) {
				count2++;
			}
			else {
				count2--;
			}
			//print char
			for (int huruf=0; huruf<count1; huruf++) {
				System.out.print(c);
				if(huruf<count1/2) {
					c++;
				} else {
					c--;
				}
			}
			if (i<row){
				count1 = count1 + 2;
			} else {
				count1 = count1 - 2;
			}
			c= 'A';

			System.out.println();
		}
	}
}