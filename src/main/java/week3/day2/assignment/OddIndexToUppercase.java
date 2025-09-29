package week3.day2.assignment;

public class OddIndexToUppercase {

	public static void main(String[] args) {
		
		String text = "changeme";
		
		// To chararray
		 char[] arr = text.toCharArray();
		 // Loop 
		 for(int i = arr.length -1; i>=0; i--) {
			 //to find odd index
			 if(i%2 !=0) {
				 //to change upper case
				 arr[i] = Character.toUpperCase(arr[i]);
			 }
		 }
		 System.out.println(arr);
	}

}
