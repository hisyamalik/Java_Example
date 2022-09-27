import java.util.*;
public class SplitString{
	static void splitFunction(String str_name, int n){
		int strSize=str_name.length();
		int partSize;

		if (strSize % n != 0){
			System.out.println("The size of the given string is not divisible by " + n);
			return;
		} else {
			System.out.println("The given string is: " + str_name);
   			System.out.println("The string divided into " + n + " parts and they are: ");
   			partSize = strSize/n;
   			for (int i=0; i<strSize; i++){
   				if(i%partSize==0)
   					System.out.println();
   				System.out.print(str_name.charAt(i));
   			}
		}
	}


	public static void main(String[] args) {
		String str1 = "abcdefghijklmnopqrstuvwxy";
		int number_split = 5;
		splitFunction(str1,number_split);

	}
}