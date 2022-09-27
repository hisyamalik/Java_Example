import java.util.*;
public class ArrangeNumber {
	public static void main(String[] args) {
		int[] array_numb = {0,1,0,2,0,3,0,4,0,5};
		int i=0;
		System.out.print("\nOriginal array: \n");
		for (int n: array_numb)
			System.out.print(n+" ");

		for (int j=0, l=array_numb.length; j<l;) {
			if (array_numb[j]==0)
				j++;
			else {
				int temp = array_numb[i];
				array_numb[i]=array_numb[j];
				array_numb[j]=temp;
				i++;
				j++;
			}
		}

		while (i<array_numb.length) 
			array_numb[i++] = 0;
		System.out.print("\nAfter moving 0 to the end of array: \n");

		for (int n : array_numb)
			System.out.print(n+" ");
		System.out.print("\n");
	}
}