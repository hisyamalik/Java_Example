import java.util.Arrays;
public class SortingArray {
	public static void main(String[] args) {

		int [] array1 = {2018,1221,835,8261,882,5361,441,8172,1028,123};
		String[] array2 = {
			"Java",
            "Python",
            "Rubi",
            "HTML",
            "PHP",
            "C#",
            "C Programming",
            "C++"};
        System.out.println("Original first array: "+Arrays.toString(array1));
        Arrays.sort(array1);
        System.out.println("Sorted first array: "+Arrays.toString(array1));
        System.out.println(" ");
        System.out.println("Original second array: "+Arrays.toString(array2));
        Arrays.sort(array2);
        System.out.println("Sorted second array: "+Arrays.toString(array2));
	}
}