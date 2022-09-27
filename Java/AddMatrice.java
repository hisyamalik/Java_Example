import java.util.Scanner;
public class AddMatrice {
	public static void main(String args[]){
		 int row,col,c,d;
		 Scanner in = new Scanner(System.in);

		 System.out.println("Input matrix row: ");
		 row= in.nextInt();
		 System.out.println("Input matrix coloumn: ");
		 col= in.nextInt();

		 int array1[][]=new int[row][col];
		 int array2[][]=new int[row][col];
		 int sum_array[][]=new int[row][col];

		 System.out.println("Element of first matrix");
		 for (c=0;c<row;c++)
		 	for (d=0;d<col;d++)
		 		array1[c][d]=in.nextInt();
		 

		 System.out.println("Element of second matrix");
		 for (c=0;c<row;c++)
		 	for (d=0;d<col;d++)
		 		array2[c][d]=in.nextInt();

		 for (c=0;c<row;c++)
		 	for (d=0;d<col;d++)
		 		sum_array[c][d]=array1[c][d]+array2[c][d];

		 System.out.println("Sum of the matrices: ");
		 for (c=0;c<row;c++){
		 	for (d=0;d<col;d++)
		 		System.out.print(sum_array[c][d]+"\t");
		 	System.out.println();
		 }
		 	
	}
}