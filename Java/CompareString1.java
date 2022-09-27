public class CompareString1 {
	public static void main(String[] args) {
		String str1= "example.co.id", str2="example.com", str3= "Example.com";
		CharSequence right_str= "example.com";

		System.out.println("Comparing "+str1+" and "+right_str+": "+str1.contentEquals(right_str));
		System.out.println("Comparing "+str2+" and "+right_str+": "+str2.contentEquals(right_str));
		System.out.println("Comparing "+str3+" and "+right_str+": "+str3.contentEquals(right_str));
		System.out.println(" ");

		String columnist1 = "Stephen Edwin King";
        String columnist2 = "Walter Winchell";
        String columnist3 = "Mike Royko";
        String columnist4 = "stephen Edwin king";

        // Are any of the above Strings equal to one another?
        //boolean equals1 = columnist1.equals(columnist2);
        //boolean equals2 = columnist1.equals(columnist3);
        //boolean equals3 = columnist1.equals(columnist4);
        // Test any of the above Strings equal to one another
        boolean equals1 = columnist1.equalsIgnoreCase(columnist2);
        boolean equals2 = columnist1.equalsIgnoreCase(columnist3);
        boolean equals3 = columnist1.equalsIgnoreCase(columnist4);

        // Display the results of the equality checks.
        System.out.println("\"" + columnist1 + "\" equals \"" + columnist2 + "\"? " + equals1);
        System.out.println("\"" + columnist1 + "\" equals \"" + columnist3 + "\"? " + equals2);
        System.out.println("\"" + columnist1 + "\" equals \"" + columnist4 + "\"? " + equals3);
	
	}
}