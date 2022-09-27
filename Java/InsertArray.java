import java.util.Arrays;
public class InsertArray {
	public static void main(String[] args) {
		int [] my_array = {1,2,3,4,5,7,8,9};
		int pos_index = 5;
		int newValue = 1000;

		System.out.println("Original Array= " +Arrays.toString(my_array));

		for (int i=my_array.length-1; i>pos_index;i--){
			my_array[i]=my_array[i-1]; //shifting until pos_index
		}
		my_array[pos_index] = newValue;
		System.out.println("New Array= " +Arrays.toString(my_array));
	}
}