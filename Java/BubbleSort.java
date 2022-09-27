import java.util.Arrays;
class BubbleSort {
	void bubbleSort(int nums[]){
		int n = nums.length;
		for (int i=0; i<n; i++)
			for (int j=0; j<n-i-1; j++)
				if (nums[j]>nums[j+1]) {

					int temp = nums[j];
					nums[j] = nums[j+1];
					nums[j+1] = temp;
				}
		
	}
	public static void main(String args[]) {
		BubbleSort bs = new BubbleSort();
		int my_nums[] = {20,-3,8,9,1,0,1,13,-31,-2};
		System.out.println("Original array: ");
		System.out.println(Arrays.toString(my_nums));
		bs.bubbleSort(my_nums);
		System.out.println("Sorted array: ");
		System.out.println(Arrays.toString(my_nums));
	}
}